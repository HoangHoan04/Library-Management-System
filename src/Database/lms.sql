CREATE TABLE `account` (
  `account_id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` ENUM ('Admin', 'Nhân viên thư viện', 'Nhân viên kho') NOT NULL,
  `status` ENUM ('Đang hoạt động', 'Ngừng hoạt động') NOT NULL
);

CREATE TABLE `book` (
  `isbn` varchar(20) PRIMARY KEY NOT NULL,
  `title` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `publisher_id` int NOT NULL,
  `year_publish` int NOT NULL,
  `category_id` int NOT NULL,
  `quantity` int NOT NULL
);

CREATE TABLE `bookitem` (
  `bookitem_id` varchar(20) PRIMARY KEY NOT NULL,
  `isbn` varchar(20) NOT NULL,
  `purchaseticket_id` varchar(20) NOT NULL,
  `bookshelf_id` int DEFAULT null,
  `status` ENUM ('Có sẵn', 'Đang mượn', 'Hư hỏng', 'Mất') NOT NULL,
  `add_date` date NOT NULL
);

CREATE TABLE `bookshelf` (
  `bookshelf_id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `capacity` int NOT NULL
);

CREATE TABLE `borrowticket` (
  `borrow_ticket_id` varchar(20) PRIMARY KEY NOT NULL,
  `staff_id` int NOT NULL,
  `member_id` int NOT NULL,
  `borrow_date` date NOT NULL,
  `due_date` date NOT NULL,
  `status` ENUM ('Chưa trả', 'Đã trả') NOT NULL
);

CREATE TABLE `borrowticket_details` (
  `borrow_ticket_details_id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `borrow_ticket_id` varchar(20) NOT NULL,
  `book_item_id` varchar(20) NOT NULL
);

CREATE TABLE `category` (
  `category_id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL
);

CREATE TABLE `member` (
  `member_id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `full_name` varchar(255) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `address` varchar(255) NOT NULL,
  `membership_date` date NOT NULL,
  `status` ENUM ('Đang hoạt động', 'Ngừng hoạt động') NOT NULL,
  `violationCount` int NOT NULL
);

CREATE TABLE `penalty` (
  `penalty_id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `penalty_name` varchar(45) NOT NULL,
  `amount` decimal(10,2) NOT NULL
);

CREATE TABLE `penaltyticket` (
  `penalty_ticket_id` varchar(20) PRIMARY KEY NOT NULL,
  `member_id` int NOT NULL,
  `staff_id` int NOT NULL,
  `penalty_id` int NOT NULL,
  `penalty_date` date NOT NULL,
  `note` varchar(255) DEFAULT null
);

CREATE TABLE `publisher` (
  `publisher_id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `phone` varchar(10) NOT NULL
);

CREATE TABLE `purchaseticket` (
  `purchase_ticket_id` varchar(20) PRIMARY KEY NOT NULL,
  `supplier_id` int NOT NULL,
  `staff_id` int NOT NULL,
  `purchase_date` date NOT NULL
);

CREATE TABLE `purchaseticket_details` (
  `purchase_ticket_details_id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `purchase_ticket_id` varchar(20) NOT NULL,
  `isbn` varchar(20) NOT NULL,
  `quantity` int NOT NULL
);

CREATE TABLE `returnticket` (
  `return_ticket_id` varchar(20) PRIMARY KEY NOT NULL,
  `borrow_ticket_id` varchar(20) NOT NULL,
  `staff_id` int NOT NULL,
  `return_date` date NOT NULL
);

CREATE TABLE `returnticket_details` (
  `return_ticket_details_id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `return_ticket_id` varchar(20) NOT NULL,
  `book_item_id` varchar(20) NOT NULL
);

CREATE TABLE `staff` (
  `staff_id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `full_name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `address` varchar(255) NOT NULL,
  `hire_date` date NOT NULL,
  `status` ENUM ('Đang làm việc', 'Đã nghỉ việc') NOT NULL
);

CREATE TABLE `supplier` (
  `supplier_id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `phone` varchar(10) NOT NULL
);

CREATE UNIQUE INDEX `username_UNIQUE` ON `account` (`username`);

CREATE UNIQUE INDEX `account_id_UNIQUE` ON `account` (`account_id`);

CREATE UNIQUE INDEX `isbn_UNIQUE` ON `book` (`isbn`);

CREATE INDEX `fk_publisher_publisher_id_idx` ON `book` (`publisher_id`);

CREATE INDEX `fk_category_category_id_idx` ON `book` (`category_id`);

CREATE INDEX `fk_bookshelf_id_idx` ON `bookitem` (`bookshelf_id`);

CREATE INDEX `fk_isbn_idx` ON `bookitem` (`isbn`);

CREATE INDEX `fk_purchaseticket_bookitem_id_idx` ON `bookitem` (`purchaseticket_id`);

CREATE INDEX `staff_id_idx` ON `borrowticket` (`staff_id`);

CREATE INDEX `member_id_idx` ON `borrowticket` (`member_id`);

CREATE INDEX `fk_borrowticket_id_idx` ON `borrowticket_details` (`borrow_ticket_id`);

CREATE INDEX `fk_borrowticket_bookitem_id_idx` ON `borrowticket_details` (`book_item_id`);

CREATE INDEX `fk_mem_id_idx` ON `penaltyticket` (`member_id`);

CREATE INDEX `fk_staff_id_idx` ON `penaltyticket` (`staff_id`);

CREATE INDEX `fk_penalty_idx` ON `penaltyticket` (`penalty_id`);

CREATE INDEX `fk_supplier_supplier_id_idx` ON `purchaseticket` (`supplier_id`);

CREATE INDEX `fk_staff_id_pt_id_idx` ON `purchaseticket` (`staff_id`);

CREATE INDEX `fk_isbn_idx` ON `purchaseticket_details` (`isbn`);

CREATE INDEX `fk_purchaseticket_idx` ON `purchaseticket_details` (`purchase_ticket_id`);

CREATE INDEX `staff_id_idx` ON `returnticket` (`staff_id`);

CREATE INDEX `fk_borrow_ticket_id_idx` ON `returnticket` (`borrow_ticket_id`);

CREATE INDEX `fk_return_idx` ON `returnticket_details` (`return_ticket_id`);

CREATE INDEX `fk_returnticket_bookitem_id_idx` ON `returnticket_details` (`book_item_id`);

ALTER TABLE `account` ADD CONSTRAINT `fk_staff_staff_id` FOREIGN KEY (`account_id`) REFERENCES `staff` (`staff_id`);

ALTER TABLE `book` ADD CONSTRAINT `fk_category_category_id` FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`);

ALTER TABLE `book` ADD CONSTRAINT `fk_publisher_publisher_id` FOREIGN KEY (`publisher_id`) REFERENCES `publisher` (`publisher_id`);

ALTER TABLE `bookitem` ADD CONSTRAINT `fk_bookshelf_id` FOREIGN KEY (`bookshelf_id`) REFERENCES `bookshelf` (`bookshelf_id`);

ALTER TABLE `bookitem` ADD CONSTRAINT `fk_isbn_book` FOREIGN KEY (`isbn`) REFERENCES `book` (`isbn`);

ALTER TABLE `bookitem` ADD CONSTRAINT `fk_purchaseticket_bookitem_id` FOREIGN KEY (`purchaseticket_id`) REFERENCES `purchaseticket` (`purchase_ticket_id`);

ALTER TABLE `borrowticket` ADD CONSTRAINT `fk_member` FOREIGN KEY (`member_id`) REFERENCES `member` (`member_id`);

ALTER TABLE `borrowticket` ADD CONSTRAINT `fk_staff` FOREIGN KEY (`staff_id`) REFERENCES `staff` (`staff_id`);

ALTER TABLE `borrowticket_details` ADD CONSTRAINT `fk_borrowticket` FOREIGN KEY (`borrow_ticket_id`) REFERENCES `borrowticket` (`borrow_ticket_id`);

ALTER TABLE `borrowticket_details` ADD CONSTRAINT `fk_borrowticket_bookitem_id` FOREIGN KEY (`book_item_id`) REFERENCES `bookitem` (`bookitem_id`);

ALTER TABLE `penaltyticket` ADD CONSTRAINT `fk_mem_id` FOREIGN KEY (`member_id`) REFERENCES `member` (`member_id`);

ALTER TABLE `penaltyticket` ADD CONSTRAINT `fk_penalty` FOREIGN KEY (`penalty_id`) REFERENCES `penalty` (`penalty_id`);

ALTER TABLE `penaltyticket` ADD CONSTRAINT `fk_staff_penticket` FOREIGN KEY (`staff_id`) REFERENCES `staff` (`staff_id`);

ALTER TABLE `purchaseticket` ADD CONSTRAINT `fk_staff_id_pt_id` FOREIGN KEY (`staff_id`) REFERENCES `staff` (`staff_id`);

ALTER TABLE `purchaseticket` ADD CONSTRAINT `fk_supplier_supplier_id` FOREIGN KEY (`supplier_id`) REFERENCES `supplier` (`supplier_id`);

ALTER TABLE `purchaseticket_details` ADD CONSTRAINT `fk_isbn` FOREIGN KEY (`isbn`) REFERENCES `book` (`isbn`);

ALTER TABLE `purchaseticket_details` ADD CONSTRAINT `fk_purchaseticket` FOREIGN KEY (`purchase_ticket_id`) REFERENCES `purchaseticket` (`purchase_ticket_id`);

ALTER TABLE `returnticket` ADD CONSTRAINT `fk_borrowticket_id` FOREIGN KEY (`borrow_ticket_id`) REFERENCES `borrowticket` (`borrow_ticket_id`);

ALTER TABLE `returnticket` ADD CONSTRAINT `fk_staff_id` FOREIGN KEY (`staff_id`) REFERENCES `staff` (`staff_id`);

ALTER TABLE `returnticket_details` ADD CONSTRAINT `fk_return` FOREIGN KEY (`return_ticket_id`) REFERENCES `returnticket` (`return_ticket_id`);

ALTER TABLE `returnticket_details` ADD CONSTRAINT `fk_returnticket_bookitem_id` FOREIGN KEY (`book_item_id`) REFERENCES `bookitem` (`bookitem_id`);
