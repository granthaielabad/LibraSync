package assets.component;

import assets.event.EventMenuSelected;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import javax.swing.JFrame;
import model.Model_Menu;

public class Menu extends javax.swing.JPanel {

    private EventMenuSelected event;
    
    public void addEventMenuSelected(EventMenuSelected event) {
        this.event = event;
        listMenu1.addEventMenuSelected(event);
    }
    
    public Menu() {
        initComponents();
        setOpaque(false);
        listMenu1.setOpaque(false);
        init();
    }
    
    private void init() { //Refer from the provided images in .icon package
        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("home-30", "Dashboard", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("book-30", "Books", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("member-30", "Members", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("category-30", "Categories", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("borrow-book-30", "Book Issue", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        
        listMenu1.addItem(new Model_Menu("setting-30", "Settings", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("log-out-30", "Logout", Model_Menu.MenuType.MENU));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMoving = new javax.swing.JPanel();
        javax.swing.JLabel mainTitle = new javax.swing.JLabel();
        listMenu1 = new assets.swing.ListMenu<>();

        panelMoving.setOpaque(false);
        panelMoving.setPreferredSize(new java.awt.Dimension(215, 63));

        mainTitle.setForeground(new java.awt.Color(255, 255, 255));
        mainTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainTitle.setText("LIBRA•SYNC");

        javax.swing.GroupLayout panelMovingLayout = new javax.swing.GroupLayout(panelMoving);
        panelMoving.setLayout(panelMovingLayout);
        panelMovingLayout.setHorizontalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMovingLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(mainTitle)
                .addGap(75, 75, 75))
        );
        panelMovingLayout.setVerticalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(mainTitle)
                .addGap(25, 25, 25))
        );

        try {

            File f1 = new File("src/assets/font/bebasneue.ttf");
            Font font1 = Font.createFont(Font.TRUETYPE_FONT, f1).deriveFont(35f);
            mainTitle.setFont(font1);
        } catch (Exception e) {
            e.printStackTrace();

        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
            .addComponent(listMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(listMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintChildren(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // GradientPaint gp = new GradientPaint(0, 0, Color.decode("#0F2027"), 0, getHeight(), Color.decode("#2C5364")); // Change color decode hexcode to change the gradient color 
        //g2.setPaint(gp);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(g);
    }
    
    private int x;
    private int y;
    
    public void initMoving(JFrame fram) {
        panelMoving.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX();
                y = me.getY();
            }
            
        });
        panelMoving.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                fram.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }
                
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private assets.swing.ListMenu<String> listMenu1;
    private javax.swing.JPanel panelMoving;
    // End of variables declaration//GEN-END:variables
}
