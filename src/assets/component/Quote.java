package assets.component;

import java.awt.Color;
import java.awt.Font;
import java.io.File;

public class Quote extends javax.swing.JPanel {

    public Quote() {
        initComponents();
        setBackground(new Color(0, 0 , 0, 0));
        setOpaque(false);
        
        try {
            File f1 = new File("src/assets/font/lexend.ttf");
            Font font1 = Font.createFont(Font.TRUETYPE_FONT, f1).deriveFont(13f);
            mainQuote1.setFont(font1);
            mainQuote2.setFont(font1);
            mainQuote3.setFont(font1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainQuote1 = new javax.swing.JLabel();
        mainQuote2 = new javax.swing.JLabel();
        mainQuote3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        mainQuote1.setText("Empower your library with our cutting-edge LMS App,");

        mainQuote2.setText("streamlining book management for an efficient and");

        mainQuote3.setText("organized experience.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainQuote1)
            .addComponent(mainQuote2)
            .addComponent(mainQuote3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainQuote1)
                .addGap(0, 0, 0)
                .addComponent(mainQuote2)
                .addGap(0, 0, 0)
                .addComponent(mainQuote3))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel mainQuote1;
    private javax.swing.JLabel mainQuote2;
    private javax.swing.JLabel mainQuote3;
    // End of variables declaration//GEN-END:variables
}
