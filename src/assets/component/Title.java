package assets.component;

import java.awt.Font;
import java.io.File;

public class Title extends javax.swing.JPanel {

    public Title() {
        initComponents();
        setOpaque(false);
        
        try {
            File f1 = new File("src/assets/font/bebasneue.ttf");
            Font font1 = Font.createFont(Font.TRUETYPE_FONT, f1).deriveFont(35f);
            mainTitle.setFont(font1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        mainTitle = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(255, 255, 255));

        mainTitle.setText("LIBRA•SYNC");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTitle)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTitle)
        );
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mainTitle;
    // End of variables declaration//GEN-END:variables
}
