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
public class ReturnTicket_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Supplier_Frame
     */
    public ReturnTicket_Frame() {
        initComponents();
        
        ActionOnGUI.disposeAndOpenNewFrame(ReturnTicket_Frame.this, new Home_Frame());
        
        search_TextField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Từ ngày"); 
        fromeDate_DateChooser.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Từ ngày"); 
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
        cancel_Button = new javax.swing.JButton();
        Separator1 = new javax.swing.JSeparator();
        search_TextField = new javax.swing.JTextField();
        refresh_Button = new javax.swing.JButton();
        ScrollPane = new javax.swing.JScrollPane();
        returnTicket_Table = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        returnDetails_Table = new javax.swing.JTable();
        fromeDate_DateChooser = new com.toedter.calendar.JDateChooser();
        toDate_DateChooser = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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

        cancel_Button.setBackground(new java.awt.Color(250, 173, 20));
        cancel_Button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cancel_Button.setForeground(new java.awt.Color(255, 255, 255));
        cancel_Button.setText("Sửa");
        cancel_Button.setBorderPainted(false);
        cancel_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel_Button.setFocusPainted(false);
        cancel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_ButtonActionPerformed(evt);
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

        returnTicket_Table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        returnTicket_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã phiếu trả", "Mã phiếu mượn", "Mã nhân viên", "Ngày trả"
            }
        ));
        ScrollPane.setViewportView(returnTicket_Table);
        if (returnTicket_Table.getColumnModel().getColumnCount() > 0) {
            returnTicket_Table.getColumnModel().getColumn(0).setPreferredWidth(100);
            returnTicket_Table.getColumnModel().getColumn(1).setPreferredWidth(120);
            returnTicket_Table.getColumnModel().getColumn(2).setPreferredWidth(120);
        }

        returnDetails_Table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        returnDetails_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã CT phiếu trả", "Mã bản sách "
            }
        ));
        jScrollPane1.setViewportView(returnDetails_Table);
        if (returnDetails_Table.getColumnModel().getColumnCount() > 0) {
            returnDetails_Table.getColumnModel().getColumn(0).setPreferredWidth(100);
            returnDetails_Table.getColumnModel().getColumn(1).setPreferredWidth(120);
        }

        fromeDate_DateChooser.setDateFormatString("yyyy-MM-dd");
        fromeDate_DateChooser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        toDate_DateChooser.setDateFormatString("yyyy-MM-dd");
        toDate_DateChooser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Từ ngày");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Đến ngày");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancel_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(search_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fromeDate_DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(toDate_DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(refresh_Button))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(toDate_DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancel_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Separator1)
                            .addComponent(refresh_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(search_TextField, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(fromeDate_DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        new AddReturnTicket_Frame().setVisible(true);
    }//GEN-LAST:event_add_ButtonActionPerformed

    private void cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_ButtonActionPerformed
        
    }//GEN-LAST:event_cancel_ButtonActionPerformed

    private void refresh_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_ButtonActionPerformed
        
    }//GEN-LAST:event_refresh_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnTicket_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnTicket_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnTicket_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnTicket_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnTicket_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JButton add_Button;
    private javax.swing.JButton cancel_Button;
    private com.toedter.calendar.JDateChooser fromeDate_DateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refresh_Button;
    private javax.swing.JTable returnDetails_Table;
    private javax.swing.JTable returnTicket_Table;
    private javax.swing.JTextField search_TextField;
    private com.toedter.calendar.JDateChooser toDate_DateChooser;
    // End of variables declaration//GEN-END:variables
}
