package GUI.form;

import java.awt.Font;
import java.io.File;

import assets.swing.ScrollBar;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import model.Model_Card;
import model.StatusType;

public class Form_Admin_Dashboard extends javax.swing.JPanel {

    public Form_Admin_Dashboard() {
        initComponents();
        
        totalU.setData(new Model_Card("Total of Users:"));
        totalB.setData(new Model_Card("Total of Books:"));
        
        try {
            File f1 = new File("src/assets/font/lexend.ttf");
            Font font1 = Font.createFont(Font.TRUETYPE_FONT, f1).deriveFont(18f);
            Font font2 = Font.createFont(Font.TRUETYPE_FONT, f1).deriveFont(24f);
            userDetails.setFont(font1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        JPanel p  = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        spTable.getViewport().setBackground(Color.WHITE);
        // Add row table
        table.addRow(new Object[]{"Grant Haiel Abad", "granthaielpabad@gmail.com", "09998887776", "03 May 2024", StatusType.APPROVED}); // This is a test
        table.addRow(new Object[]{"Grant Haiel Abad", "granthaielpabad@gmail.com", "09998887776", "03 May 2024", StatusType.PENDING}); // This is a test
        table.addRow(new Object[]{"Grant Haiel Abad", "granthaielpabad@gmail.com", "09998887776", "03 May 2024", StatusType.REJECTED}); // This is a test
        table.addRow(new Object[]{"Grant Haiel Abad", "granthaielpabad@gmail.com", "09998887776", "03 May 2024", StatusType.PENDING}); // This is a test
        table.addRow(new Object[]{"Grant Haiel Abad", "granthaielpabad@gmail.com", "09998887776", "03 May 2024", StatusType.APPROVED}); // This is a test
        table.addRow(new Object[]{"Grant Haiel Abad", "granthaielpabad@gmail.com", "09998887776", "03 May 2024", StatusType.APPROVED}); // This is a test
        table.addRow(new Object[]{"Grant Haiel Abad", "granthaielpabad@gmail.com", "09998887776", "03 May 2024", StatusType.REJECTED}); // This is a test
        table.addRow(new Object[]{"Grant Haiel Abad", "granthaielpabad@gmail.com", "09998887776", "03 May 2024", StatusType.REJECTED}); // This is a test
        table.addRow(new Object[]{"Grant Haiel Abad", "granthaielpabad@gmail.com", "09998887776", "03 May 2024", StatusType.APPROVED}); // This is a test
        table.addRow(new Object[]{"Grant Haiel Abad", "granthaielpabad@gmail.com", "09998887776", "03 May 2024", StatusType.PENDING}); // This is a test
        table.addRow(new Object[]{"Grant Haiel Abad", "granthaielpabad@gmail.com", "09998887776", "03 May 2024", StatusType.APPROVED}); // This is a test
        table.addRow(new Object[]{"Grant Haiel Abad", "granthaielpabad@gmail.com", "09998887776", "03 May 2024", StatusType.PENDING}); // This is a test
        table.addRow(new Object[]{"Grant Haiel Abad", "granthaielpabad@gmail.com", "09998887776", "03 May 2024", StatusType.REJECTED}); // This is a test
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new assets.swing.PanelBorder();
        userDetails = new javax.swing.JLabel();
        spTable = new javax.swing.JScrollPane();
        table = new assets.swing.Table();
        panel = new javax.swing.JLayeredPane();
        totalU = new assets.component.Card_Admin();
        totalB = new assets.component.Card_Admin();

        setBackground(new java.awt.Color(255, 255, 255));

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        userDetails.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userDetails.setForeground(new java.awt.Color(89, 89, 89));
        userDetails.setText("User Details");

        spTable.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "Contact Number", "Date Joined", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTable.setViewportView(table);

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        totalU.setColor1(new java.awt.Color(142, 142, 250));
        totalU.setColor2(new java.awt.Color(123, 123, 245));
        panel.add(totalU);

        totalB.setColor1(new java.awt.Color(186, 123, 247));
        totalB.setColor2(new java.awt.Color(167, 94, 236));
        panel.add(totalB);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userDetails)
                            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        spTable.getAccessibleContext().setAccessibleName("");

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
    private javax.swing.JLayeredPane panel;
    private assets.swing.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spTable;
    private assets.swing.Table table;
    private assets.component.Card_Admin totalB;
    private assets.component.Card_Admin totalU;
    private javax.swing.JLabel userDetails;
    // End of variables declaration//GEN-END:variables
}
