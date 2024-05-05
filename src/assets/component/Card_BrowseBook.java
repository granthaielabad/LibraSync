package assets.component;

import model.Model_Book;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GradientPaint;
import java.awt.RenderingHints;
import java.io.File;

public class Card_BrowseBook extends javax.swing.JPanel {

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }
    
    private Color color1;
    private Color color2;

    public Card_BrowseBook() {
        initComponents();
        color1 = Color.BLACK;
        color2 = Color.WHITE;
        book.setBackground(new Color(142,142,250));
        
        try {
            File f1 = new File("src/assets/font/lexend.ttf");
            Font font1 = Font.createFont(Font.TRUETYPE_FONT, f1).deriveFont(18f);
            Font font2 = Font.createFont(Font.TRUETYPE_FONT, f1).deriveFont(14f);
            book.setFont(font1);
            title.setFont(font2);
            author.setFont(font2);
            publisher.setFont(font2);
            genre.setFont(font2);
            description.setFont(font2);
            tags.setFont(font2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void setData(Model_Book data) {
        title.setText(data.getTitle());
        author.setText(data.getAuthor());
        publisher.setText(data.getPublisher());
        genre.setText(data.getGenre());
        description.setText(data.getDescription());
        tags.setText(data.getTags());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        book = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        author = new javax.swing.JLabel();
        publisher = new javax.swing.JLabel();
        genre = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        tags = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        book.setBackground(new java.awt.Color(102, 102, 102));
        book.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        book.setForeground(new java.awt.Color(0, 0, 0));
        book.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        book.setText("Book Cover");
        book.setOpaque(true);

        title.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        title.setText("Title:");

        author.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        author.setText("Author:");

        publisher.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        publisher.setText("Publisher:");

        genre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        genre.setText("Genre:");

        description.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        description.setText("Description:");

        tags.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tags.setText("Tags:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(author))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(publisher))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(genre))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tags))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(description)))
                .addContainerGap(212, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(author)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(publisher)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(genre))
                    .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tags)
                .addGap(18, 18, 18)
                .addComponent(description)
                .addContainerGap(158, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

//    @Override
//    protected void paintComponent(Graphics g) {
//        Graphics2D g2 = (Graphics2D) g;
//        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        GradientPaint gp = new GradientPaint(0, 0, color1, 0, getHeight(), color2); // Change color decode hexcode to change the gradient color 
//        g2.setPaint(gp);
//        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
//        g2.setColor(new Color(255,255,255,50));
//        g2.fillOval(getWidth()-(getHeight() / 2), 10, getHeight(), getHeight());
//        g2.fillOval(getWidth()-(getHeight() / 2) - 20,  getHeight() / 2 + 20, getHeight(), getHeight());
//        super.paintComponent(g);
//    }
//    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel author;
    private javax.swing.JLabel book;
    private javax.swing.JLabel description;
    private javax.swing.JLabel genre;
    private javax.swing.JLabel publisher;
    private javax.swing.JLabel tags;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
