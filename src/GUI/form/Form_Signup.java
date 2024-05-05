package GUI.form;

import java.awt.Font;
import java.io.File;

public class Form_Signup extends javax.swing.JPanel {

    public Form_Signup() {
        initComponents();
        setOpaque(false);
        
        try {
            File f1 = new File("src/librasync/font/lexend.ttf");
            Font font1 = Font.createFont(Font.TRUETYPE_FONT, f1).deriveFont(12f);
            firstName.setFont(font1);
            lastName.setFont(font1);
            address.setFont(font1);
            emailAddress.setFont(font1);
            password.setFont(font1);
            confirmPassword.setFont(font1);
            gender.setFont(font1);
            contactNumber.setFont(font1);
            btnLogin.setFont(font1);
            btnSignup.setFont(font1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField1 = new assets.component.TextField();
        textField2 = new assets.component.TextField();
        textField3 = new assets.component.TextField();
        textField6 = new assets.component.TextField();
        textField7 = new assets.component.TextField();
        textField8 = new assets.component.TextField();
        passTextField1 = new assets.component.PassTextField();
        passTextField2 = new assets.component.PassTextField();
        firstName = new javax.swing.JLabel();
        lastName = new javax.swing.JLabel();
        emailAddress = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        confirmPassword = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        contactNumber = new javax.swing.JLabel();
        button1 = new assets.component.Button();
        btnLogin = new javax.swing.JLabel();
        button2 = new assets.component.Button();
        btnSignup = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
        add(textField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));
        add(textField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 410, -1));
        add(textField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 410, -1));
        add(textField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));
        add(textField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, -1));
        add(passTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        add(passTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        firstName.setText("First Name:");
        add(firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lastName.setText("Last Name:");
        add(lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        emailAddress.setText("Email Address:");
        add(emailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        password.setText("Password:");
        add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        confirmPassword.setText("Confirm Password:");
        add(confirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        address.setText("Address:");
        add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        gender.setText("Gender:");
        add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        contactNumber.setText("Contact Number:");
        add(contactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        btnLogin.setText("Login");

        javax.swing.GroupLayout button1Layout = new javax.swing.GroupLayout(button1);
        button1.setLayout(button1Layout);
        button1Layout.setHorizontalGroup(
            button1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );
        button1Layout.setVerticalGroup(
            button1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, 30));

        btnSignup.setText("Signup");

        javax.swing.GroupLayout button2Layout = new javax.swing.GroupLayout(button2);
        button2.setLayout(button2Layout);
        button2Layout.setHorizontalGroup(
            button2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnSignup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );
        button2Layout.setVerticalGroup(
            button2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSignup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JLabel btnLogin;
    private javax.swing.JLabel btnSignup;
    private assets.component.Button button1;
    private assets.component.Button button2;
    private javax.swing.JLabel confirmPassword;
    private javax.swing.JLabel contactNumber;
    private javax.swing.JLabel emailAddress;
    private javax.swing.JLabel firstName;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel lastName;
    private assets.component.PassTextField passTextField1;
    private assets.component.PassTextField passTextField2;
    private javax.swing.JLabel password;
    private assets.component.TextField textField1;
    private assets.component.TextField textField2;
    private assets.component.TextField textField3;
    private assets.component.TextField textField6;
    private assets.component.TextField textField7;
    private assets.component.TextField textField8;
    // End of variables declaration//GEN-END:variables
}
