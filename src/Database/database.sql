CREATE DATABASE  IF NOT EXISTS `library_management` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `library_management`;
-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: library_management
-- ------------------------------------------------------
-- Server version	8.0.39

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `account` (
  `account_id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` enum('Admin','Nhân viên thư viện','Nhân viên kho') NOT NULL,
  `status` enum('Đang hoạt động','Ngừng hoạt động') NOT NULL,
  PRIMARY KEY (`account_id`),
  UNIQUE KEY `username_UNIQUE` (`username`),
  UNIQUE KEY `account_id_UNIQUE` (`account_id`),
  CONSTRAINT `fk_staff_staff_id` FOREIGN KEY (`account_id`) REFERENCES `staff` (`staff_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` VALUES (1,'admin','12345','Admin','Đang hoạt động'),(2,'hieu2603','123','Nhân viên thư viện','Đang hoạt động');
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book` (
  `isbn` varchar(20) NOT NULL,
  `title` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `publisher_id` int NOT NULL,
  `year_publish` int NOT NULL,
  `category_id` int NOT NULL,
  `quantity` int NOT NULL,
  PRIMARY KEY (`isbn`),
  UNIQUE KEY `isbn_UNIQUE` (`isbn`),
  KEY `fk_publisher_publisher_id_idx` (`publisher_id`),
  KEY `fk_category_category_id_idx` (`category_id`),
  CONSTRAINT `fk_category_category_id` FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`),
  CONSTRAINT `fk_publisher_publisher_id` FOREIGN KEY (`publisher_id`) REFERENCES `publisher` (`publisher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bookitem`
--

DROP TABLE IF EXISTS `bookitem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bookitem` (
  `bookitem_id` varchar(20) NOT NULL,
  `isbn` varchar(20) NOT NULL,
  `purchaseticket_id` varchar(20) NOT NULL,
  `bookshelf_id` int DEFAULT NULL,
  `status` enum('Có sẵn','Đang mượn','Hư hỏng','Mất') NOT NULL,
  `add_date` date NOT NULL,
  PRIMARY KEY (`bookitem_id`),
  KEY `fk_bookshelf_id_idx` (`bookshelf_id`),
  KEY `fk_isbn_idx` (`isbn`),
  KEY `fk_purchaseticket_bookitem_id_idx` (`purchaseticket_id`),
  CONSTRAINT `fk_bookshelf_id` FOREIGN KEY (`bookshelf_id`) REFERENCES `bookshelf` (`bookshelf_id`),
  CONSTRAINT `fk_isbn_book` FOREIGN KEY (`isbn`) REFERENCES `book` (`isbn`),
  CONSTRAINT `fk_purchaseticket_bookitem_id` FOREIGN KEY (`purchaseticket_id`) REFERENCES `purchaseticket` (`purchase_ticket_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bookitem`
--

LOCK TABLES `bookitem` WRITE;
/*!40000 ALTER TABLE `bookitem` DISABLE KEYS */;
/*!40000 ALTER TABLE `bookitem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bookshelf`
--

DROP TABLE IF EXISTS `bookshelf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bookshelf` (
  `bookshelf_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `capacity` int NOT NULL,
  PRIMARY KEY (`bookshelf_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bookshelf`
--

LOCK TABLES `bookshelf` WRITE;
/*!40000 ALTER TABLE `bookshelf` DISABLE KEYS */;
/*!40000 ALTER TABLE `bookshelf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `borrowticket`
--

DROP TABLE IF EXISTS `borrowticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `borrowticket` (
  `borrow_ticket_id` varchar(20) NOT NULL,
  `staff_id` int NOT NULL,
  `member_id` int NOT NULL,
  `borrow_date` date NOT NULL,
  `due_date` date NOT NULL,
  `status` enum('Chưa trả','Đã trả') NOT NULL,
  PRIMARY KEY (`borrow_ticket_id`),
  KEY `staff_id_idx` (`staff_id`),
  KEY `member_id_idx` (`member_id`),
  CONSTRAINT `fk_member` FOREIGN KEY (`member_id`) REFERENCES `member` (`member_id`),
  CONSTRAINT `fk_staff` FOREIGN KEY (`staff_id`) REFERENCES `staff` (`staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `borrowticket`
--

LOCK TABLES `borrowticket` WRITE;
/*!40000 ALTER TABLE `borrowticket` DISABLE KEYS */;
/*!40000 ALTER TABLE `borrowticket` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `borrowticket_details`
--

DROP TABLE IF EXISTS `borrowticket_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `borrowticket_details` (
  `borrow_ticket_details_id` int NOT NULL AUTO_INCREMENT,
  `borrow_ticket_id` varchar(20) NOT NULL,
  `book_item_id` varchar(20) NOT NULL,
  PRIMARY KEY (`borrow_ticket_details_id`),
  KEY `fk_borrowticket_id_idx` (`borrow_ticket_id`),
  KEY `fk_borrowticket_bookitem_id_idx` (`book_item_id`),
  CONSTRAINT `fk_borrowticket` FOREIGN KEY (`borrow_ticket_id`) REFERENCES `borrowticket` (`borrow_ticket_id`),
  CONSTRAINT `fk_borrowticket_bookitem_id` FOREIGN KEY (`book_item_id`) REFERENCES `bookitem` (`bookitem_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `borrowticket_details`
--

LOCK TABLES `borrowticket_details` WRITE;
/*!40000 ALTER TABLE `borrowticket_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `borrowticket_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category` (
  `category_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `member` (
  `member_id` int NOT NULL AUTO_INCREMENT,
  `full_name` varchar(255) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `address` varchar(255) NOT NULL,
  `membership_date` date NOT NULL,
  `status` enum('Đang hoạt động','Ngừng hoạt động') NOT NULL,
  `violationCount` int NOT NULL,
  PRIMARY KEY (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `penalty`
--

DROP TABLE IF EXISTS `penalty`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `penalty` (
  `penalty_id` int NOT NULL AUTO_INCREMENT,
  `penalty_name` varchar(45) NOT NULL,
  `amount` decimal(10,2) NOT NULL,
  PRIMARY KEY (`penalty_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `penalty`
--

LOCK TABLES `penalty` WRITE;
/*!40000 ALTER TABLE `penalty` DISABLE KEYS */;
/*!40000 ALTER TABLE `penalty` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `penaltyticket`
--

DROP TABLE IF EXISTS `penaltyticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `penaltyticket` (
  `penalty_ticket_id` varchar(20) NOT NULL,
  `member_id` int NOT NULL,
  `staff_id` int NOT NULL,
  `penalty_id` int NOT NULL,
  `penalty_date` date NOT NULL,
  `note` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`penalty_ticket_id`),
  KEY `fk_mem_id_idx` (`member_id`),
  KEY `fk_staff_id_idx` (`staff_id`),
  KEY `fk_penalty_idx` (`penalty_id`),
  CONSTRAINT `fk_mem_id` FOREIGN KEY (`member_id`) REFERENCES `member` (`member_id`),
  CONSTRAINT `fk_penalty` FOREIGN KEY (`penalty_id`) REFERENCES `penalty` (`penalty_id`),
  CONSTRAINT `fk_staff_penticket` FOREIGN KEY (`staff_id`) REFERENCES `staff` (`staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `penaltyticket`
--

LOCK TABLES `penaltyticket` WRITE;
/*!40000 ALTER TABLE `penaltyticket` DISABLE KEYS */;
/*!40000 ALTER TABLE `penaltyticket` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `publisher`
--

DROP TABLE IF EXISTS `publisher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `publisher` (
  `publisher_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `phone` varchar(10) NOT NULL,
  PRIMARY KEY (`publisher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `publisher`
--

LOCK TABLES `publisher` WRITE;
/*!40000 ALTER TABLE `publisher` DISABLE KEYS */;
/*!40000 ALTER TABLE `publisher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchaseticket`
--

DROP TABLE IF EXISTS `purchaseticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `purchaseticket` (
  `purchase_ticket_id` varchar(20) NOT NULL,
  `supplier_id` int NOT NULL,
  `staff_id` int NOT NULL,
  `purchase_date` date NOT NULL,
  PRIMARY KEY (`purchase_ticket_id`),
  KEY `fk_supplier_supplier_id_idx` (`supplier_id`),
  KEY `fk_staff_id_pt_id_idx` (`staff_id`),
  CONSTRAINT `fk_staff_id_pt_id` FOREIGN KEY (`staff_id`) REFERENCES `staff` (`staff_id`),
  CONSTRAINT `fk_supplier_supplier_id` FOREIGN KEY (`supplier_id`) REFERENCES `supplier` (`supplier_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchaseticket`
--

LOCK TABLES `purchaseticket` WRITE;
/*!40000 ALTER TABLE `purchaseticket` DISABLE KEYS */;
/*!40000 ALTER TABLE `purchaseticket` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchaseticket_details`
--

DROP TABLE IF EXISTS `purchaseticket_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `purchaseticket_details` (
  `purchase_ticket_details_id` int NOT NULL AUTO_INCREMENT,
  `purchase_ticket_id` varchar(20) NOT NULL,
  `isbn` varchar(20) NOT NULL,
  `quantity` int NOT NULL,
  PRIMARY KEY (`purchase_ticket_details_id`),
  KEY `fk_isbn_idx` (`isbn`),
  KEY `fk_purchaseticket_idx` (`purchase_ticket_id`),
  CONSTRAINT `fk_isbn` FOREIGN KEY (`isbn`) REFERENCES `book` (`isbn`),
  CONSTRAINT `fk_purchaseticket` FOREIGN KEY (`purchase_ticket_id`) REFERENCES `purchaseticket` (`purchase_ticket_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchaseticket_details`
--

LOCK TABLES `purchaseticket_details` WRITE;
/*!40000 ALTER TABLE `purchaseticket_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `purchaseticket_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `returnticket`
--

DROP TABLE IF EXISTS `returnticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `returnticket` (
  `return_ticket_id` varchar(20) NOT NULL,
  `borrow_ticket_id` varchar(20) NOT NULL,
  `staff_id` int NOT NULL,
  `return_date` date NOT NULL,
  PRIMARY KEY (`return_ticket_id`),
  KEY `staff_id_idx` (`staff_id`),
  KEY `fk_borrow_ticket_id_idx` (`borrow_ticket_id`),
  CONSTRAINT `fk_borrowticket_id` FOREIGN KEY (`borrow_ticket_id`) REFERENCES `borrowticket` (`borrow_ticket_id`),
  CONSTRAINT `fk_staff_id` FOREIGN KEY (`staff_id`) REFERENCES `staff` (`staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `returnticket`
--

LOCK TABLES `returnticket` WRITE;
/*!40000 ALTER TABLE `returnticket` DISABLE KEYS */;
/*!40000 ALTER TABLE `returnticket` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `returnticket_details`
--

DROP TABLE IF EXISTS `returnticket_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `returnticket_details` (
  `return_ticket_details_id` int NOT NULL AUTO_INCREMENT,
  `return_ticket_id` varchar(20) NOT NULL,
  `book_item_id` varchar(20) NOT NULL,
  PRIMARY KEY (`return_ticket_details_id`),
  KEY `fk_return_idx` (`return_ticket_id`),
  KEY `fk_returnticket_bookitem_id_idx` (`book_item_id`),
  CONSTRAINT `fk_return` FOREIGN KEY (`return_ticket_id`) REFERENCES `returnticket` (`return_ticket_id`),
  CONSTRAINT `fk_returnticket_bookitem_id` FOREIGN KEY (`book_item_id`) REFERENCES `bookitem` (`bookitem_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `returnticket_details`
--

LOCK TABLES `returnticket_details` WRITE;
/*!40000 ALTER TABLE `returnticket_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `returnticket_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staff` (
  `staff_id` int NOT NULL AUTO_INCREMENT,
  `full_name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `address` varchar(255) NOT NULL,
  `hire_date` date NOT NULL,
  `status` enum('Đang làm việc','Đã nghỉ việc') NOT NULL,
  PRIMARY KEY (`staff_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff`
--

LOCK TABLES `staff` WRITE;
/*!40000 ALTER TABLE `staff` DISABLE KEYS */;
INSERT INTO `staff` VALUES (1,'ADMIN','admin@gmail.com','0123456789','SGU','2024-09-12','Đang làm việc'),(2,'Nguyễn Văn Hiếu','nguyenvanhieu2603@gmail.com','0777011640','SGU','2024-09-14','Đang làm việc');
/*!40000 ALTER TABLE `staff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `supplier` (
  `supplier_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `phone` varchar(10) NOT NULL,
  PRIMARY KEY (`supplier_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier`
--

LOCK TABLES `supplier` WRITE;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-10-02  7:42:44
