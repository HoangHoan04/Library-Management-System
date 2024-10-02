/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import App.Static;
import BUS.AccountBUS;
import BUS.StaffBUS;
import DTO.AccountDTO;
import DTO.StaffDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author hieun
 */
public class AddStaff_Frame extends javax.swing.JFrame {

    /**
     * Creates new form AddStaff
     */
    public AddStaff_Frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header_Panel = new javax.swing.JPanel();
        header_Label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fullname_TextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        phone_TextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        email_TextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        address_TextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        username_TextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        password_TextField = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        role_ComboBox = new javax.swing.JComboBox<>();
        add_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        header_Panel.setBackground(new java.awt.Color(24, 144, 255));

        header_Label.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        header_Label.setForeground(new java.awt.Color(255, 255, 255));
        header_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header_Label.setText("Thêm nhân viên mới");

        javax.swing.GroupLayout header_PanelLayout = new javax.swing.GroupLayout(header_Panel);
        header_Panel.setLayout(header_PanelLayout);
        header_PanelLayout.setHorizontalGroup(
            header_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        header_PanelLayout.setVerticalGroup(
            header_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Họ và tên");

        fullname_TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Số điện thoại");

        phone_TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Email");

        email_TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Địa chỉ");

        address_TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Tên đăng nhập");

        username_TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Mật khẩu");

        password_TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Phân quyền");

        role_ComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        role_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Nhân viên thư viện", "Nhân viên kho" }));

        add_Button.setBackground(new java.awt.Color(82, 196, 26));
        add_Button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        add_Button.setForeground(new java.awt.Color(255, 255, 255));
        add_Button.setText("Thêm mới");
        add_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(add_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(role_ComboBox, 0, 250, Short.MAX_VALUE)
                            .addComponent(username_TextField)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(email_TextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fullname_TextField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(jLabel4))
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)
                                .addComponent(phone_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(address_TextField))
                            .addComponent(password_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullname_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(role_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_ButtonActionPerformed
        // Lấy thông tin nhân viên
        String fullName = fullname_TextField.getText();
        String email = email_TextField.getText();
        String phone = phone_TextField.getText();
        String address = address_TextField.getText();
        String hire_date = Static.getCurrentDate();
        
        // Lấy thông tin tài khoản của nhân viên
        String username = username_TextField.getText();
        char[] password = password_TextField.getPassword();
        String passwordStr = new String(password);
        String role = role_ComboBox.getSelectedItem().toString();
        
        StaffBUS staffBUS = new StaffBUS();
        AccountBUS accountBUS = new AccountBUS();
        
        if (fullName.isEmpty() || email.isEmpty() || phone.isEmpty() || address.isEmpty() || username.isEmpty() || passwordStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Thông tin không được để trống.", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!email.matches(Static.EMAIL_PATTERN)) {
            JOptionPane.showMessageDialog(this, "Định dạng email không chính xác", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!phone.matches(Static.PHONE_PATTERN)) {
            JOptionPane.showMessageDialog(this, "Định dạng số điện thoại không chính xác", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (accountBUS.searchAccount(username)) {
            JOptionPane.showMessageDialog(this, "Tên đăng nhập đã tồn tại. Vui lòng chọn tên đăng nhập khác!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        StaffDTO staff = new StaffDTO(fullName, email, phone, address, hire_date);
        AccountDTO account = new AccountDTO(username, passwordStr, role);

        if (staffBUS.createStaff(staff) && accountBUS.createAccount(account)) {
            JOptionPane.showMessageDialog(this, "Tạo nhân viên mới thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Tạo nhân viên mới thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }

        this.dispose();
    }//GEN-LAST:event_add_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddStaff_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStaff_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStaff_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStaff_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStaff_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_Button;
    private javax.swing.JTextField address_TextField;
    private javax.swing.JTextField email_TextField;
    private javax.swing.JTextField fullname_TextField;
    private javax.swing.JLabel header_Label;
    private javax.swing.JPanel header_Panel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField password_TextField;
    private javax.swing.JTextField phone_TextField;
    private javax.swing.JComboBox<String> role_ComboBox;
    private javax.swing.JTextField username_TextField;
    // End of variables declaration//GEN-END:variables
}
