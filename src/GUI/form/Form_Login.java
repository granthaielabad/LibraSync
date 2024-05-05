package GUI.form;

import java.awt.Font;
import java.io.File;

public class Form_Login extends javax.swing.JPanel {

    public Form_Login() {
        initComponents();
        setOpaque(false);
        
        try {
            File f1 = new File("src/librasync/font/lexend.ttf");
            Font font1 = Font.createFont(Font.TRUETYPE_FONT, f1).deriveFont(12f);
            emailAddress.setFont(font1);
            password.setFont(font1);
            btnLogin.setFont(font1);
            btnSignup.setFont(font1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField4 = new assets.component.TextField();
        emailAddress = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        passTextField1 = new assets.component.PassTextField();
        button1 = new assets.component.Button();
        btnLogin = new javax.swing.JLabel();
        button2 = new assets.component.Button();
        btnSignup = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(textField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 410, -1));

        emailAddress.setText("Email Address:");
        add(emailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        password.setText("Password:");
        add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        add(passTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 410, -1));

        btnLogin.setText("Login");

        javax.swing.GroupLayout button1Layout = new javax.swing.GroupLayout(button1);
        button1.setLayout(button1Layout);
        button1Layout.setHorizontalGroup(
            button1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnLogin)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        button1Layout.setVerticalGroup(
            button1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 100, 30));

        btnSignup.setText("Signup");

        javax.swing.GroupLayout button2Layout = new javax.swing.GroupLayout(button2);
        button2.setLayout(button2Layout);
        button2Layout.setHorizontalGroup(
            button2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnSignup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );
        button2Layout.setVerticalGroup(
            button2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSignup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnLogin;
    private javax.swing.JLabel btnSignup;
    private assets.component.Button button1;
    private assets.component.Button button2;
    private javax.swing.JLabel emailAddress;
    private assets.component.PassTextField passTextField1;
    private javax.swing.JLabel password;
    private assets.component.TextField textField4;
    // End of variables declaration//GEN-END:variables
}
