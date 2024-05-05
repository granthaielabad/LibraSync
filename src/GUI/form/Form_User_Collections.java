package GUI.form;

import java.awt.Font;
import java.io.File;

public class Form_User_Collections extends javax.swing.JPanel {

    public Form_User_Collections() {
        initComponents();
        
        try {
            File f1 = new File("src/assets/font/lexend.ttf");
            Font font1 = Font.createFont(Font.TRUETYPE_FONT, f1).deriveFont(18f);
            jLabel1.setFont(font1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new assets.swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        panel = new javax.swing.JLayeredPane();
        card_User1 = new assets.component.Card_User();
        card_User3 = new assets.component.Card_User();
        card_User4 = new assets.component.Card_User();
        card_User8 = new assets.component.Card_User();
        card_User5 = new assets.component.Card_User();
        card_User7 = new assets.component.Card_User();
        card_User2 = new assets.component.Card_User();
        card_User6 = new assets.component.Card_User();

        setBackground(new java.awt.Color(255, 255, 255));

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(89, 89, 89));
        jLabel1.setText("Collections");

        panel.setLayout(new java.awt.GridLayout(2, 0, 10, 10));
        panel.add(card_User1);
        panel.add(card_User3);
        panel.add(card_User4);
        panel.add(card_User8);
        panel.add(card_User5);
        panel.add(card_User7);
        panel.add(card_User2);
        panel.add(card_User6);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private assets.component.Card_User card_User1;
    private assets.component.Card_User card_User2;
    private assets.component.Card_User card_User3;
    private assets.component.Card_User card_User4;
    private assets.component.Card_User card_User5;
    private assets.component.Card_User card_User6;
    private assets.component.Card_User card_User7;
    private assets.component.Card_User card_User8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane panel;
    private assets.swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
