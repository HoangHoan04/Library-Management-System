/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import com.formdev.flatlaf.FlatClientProperties;

/**
 *
 * @author hieun
 */
public class BorrowTicket_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Supplier_Frame
     */
    public BorrowTicket_Frame() {
        initComponents();
        
        ActionOnGUI.disposeAndOpenNewFrame(BorrowTicket_Frame.this, new Home_Frame());
        
        search_TextField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Từ ngày"); 
        fromDate_DateChooser.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Từ ngày"); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add_Button = new javax.swing.JButton();
        edit_Button = new javax.swing.JButton();
        Separator1 = new javax.swing.JSeparator();
        search_TextField = new javax.swing.JTextField();
        refresh_Button = new javax.swing.JButton();
        ScrollPane = new javax.swing.JScrollPane();
        borrowTicket_Table = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        borrowDetails_Table = new javax.swing.JTable();
        fromDate_DateChooser = new com.toedter.calendar.JDateChooser();
        toDate_DateChooser = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        status_ComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        add_Button.setBackground(new java.awt.Color(82, 196, 26));
        add_Button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        add_Button.setForeground(new java.awt.Color(255, 255, 255));
        add_Button.setText("Thêm");
        add_Button.setBorderPainted(false);
        add_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_Button.setFocusPainted(false);
        add_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_ButtonActionPerformed(evt);
            }
        });

        edit_Button.setBackground(new java.awt.Color(250, 173, 20));
        edit_Button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        edit_Button.setForeground(new java.awt.Color(255, 255, 255));
        edit_Button.setText("Sửa");
        edit_Button.setBorderPainted(false);
        edit_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit_Button.setFocusPainted(false);
        edit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_ButtonActionPerformed(evt);
            }
        });

        Separator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        search_TextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        refresh_Button.setBackground(new java.awt.Color(24, 144, 255));
        refresh_Button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        refresh_Button.setForeground(new java.awt.Color(255, 255, 255));
        refresh_Button.setText("Làm mới");
        refresh_Button.setBorderPainted(false);
        refresh_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refresh_Button.setFocusPainted(false);
        refresh_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_ButtonActionPerformed(evt);
            }
        });

        borrowTicket_Table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        borrowTicket_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã phiếu mượn", "Mã nhân viên", "Mã thành viên", "Ngày mượn", "Ngày trả", "Trạng thái"
            }
        ));
        ScrollPane.setViewportView(borrowTicket_Table);
        if (borrowTicket_Table.getColumnModel().getColumnCount() > 0) {
            borrowTicket_Table.getColumnModel().getColumn(0).setPreferredWidth(120);
            borrowTicket_Table.getColumnModel().getColumn(1).setPreferredWidth(120);
            borrowTicket_Table.getColumnModel().getColumn(2).setPreferredWidth(120);
        }

        borrowDetails_Table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        borrowDetails_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã CT phiếu mượn", "Mã phiếu mượn", "Mã bản sách ", "Trạng thái"
            }
        ));
        jScrollPane1.setViewportView(borrowDetails_Table);
        if (borrowDetails_Table.getColumnModel().getColumnCount() > 0) {
            borrowDetails_Table.getColumnModel().getColumn(0).setPreferredWidth(120);
            borrowDetails_Table.getColumnModel().getColumn(1).setPreferredWidth(120);
            borrowDetails_Table.getColumnModel().getColumn(2).setPreferredWidth(120);
        }

        fromDate_DateChooser.setDateFormatString("yyyy-MM-dd");
        fromDate_DateChooser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        toDate_DateChooser.setDateFormatString("yyyy-MM-dd");
        toDate_DateChooser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Từ ngày");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Đến ngày");

        status_ComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        status_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chưa trả", "Đã trả" }));
        status_ComboBox.setSelectedIndex(-1);
        status_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                status_ComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(edit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(search_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(status_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addComponent(ScrollPane))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fromDate_DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(toDate_DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(refresh_Button))
                    .addComponent(jScrollPane1))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(toDate_DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(edit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Separator1)
                                .addComponent(refresh_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addComponent(search_TextField)))
                        .addComponent(fromDate_DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(status_ComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_ButtonActionPerformed
        new AddBorrowTicket_Frame().setVisible(true);
    }//GEN-LAST:event_add_ButtonActionPerformed

    private void edit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_ButtonActionPerformed
        new EditBorrowTicket_Frame().setVisible(true); 
    }//GEN-LAST:event_edit_ButtonActionPerformed

    private void refresh_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_ButtonActionPerformed
        
    }//GEN-LAST:event_refresh_ButtonActionPerformed

    private void status_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_status_ComboBoxActionPerformed
//        int selectedIndex = statusStaff_ComboBox.getSelectedIndex();
//        DefaultTableModel model = (DefaultTableModel) staff_Table.getModel();
//        ArrayList<StaffDTO> list = staffBUS.getByStatus(selectedIndex + 1);
//
//        // Nếu selected index = -1 thì load lại tất cả dữ liệu của table
//        if (selectedIndex == -1) {
//            ActionOnGUI.showDataOnTable(model, staffBUS.getAllStaff());
//        } else {
//            ActionOnGUI.showDataOnTable(model, list);
//        }
    }//GEN-LAST:event_status_ComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BorrowTicket_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowTicket_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowTicket_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowTicket_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrowTicket_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JButton add_Button;
    private javax.swing.JTable borrowDetails_Table;
    private javax.swing.JTable borrowTicket_Table;
    private javax.swing.JButton edit_Button;
    private com.toedter.calendar.JDateChooser fromDate_DateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refresh_Button;
    private javax.swing.JTextField search_TextField;
    private javax.swing.JComboBox<String> status_ComboBox;
    private com.toedter.calendar.JDateChooser toDate_DateChooser;
    // End of variables declaration//GEN-END:variables
}
