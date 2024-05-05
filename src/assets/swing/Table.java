package assets.swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.File;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.StatusType;

public class Table extends JTable {

    public Table() {
        setShowHorizontalLines(true);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeader header = new TableHeader(o + "");
                
                try {
                    File f1 = new File("src/assets/font/lexend.ttf");
                    Font font1 = Font.createFont(Font.TRUETYPE_FONT, f1).deriveFont(10f);
                    header.setFont(font1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
                if (i1 == 4) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean bln1, int i, int i1)  {
                  if (i1 != 4) {
                      Component com = super.getTableCellRendererComponent(jtable, o, selected, bln1, i, i1);
                      com.setBackground(Color.WHITE);
                      setBorder(noFocusBorder);
                      if (selected) {
                          com.setForeground(new Color(15, 89, 140));
                      } else {
                          com.setForeground(new Color(102, 102, 102));
                      }
                      return com;
                  } else {
                      StatusType type =  (StatusType) o;
                      CellStatus cell = new CellStatus(type);
                      return cell;
                  }
            }
        });
    }
    
    public void addRow(Object[] row) {
        DefaultTableModel model = (DefaultTableModel)getModel();
        model.addRow(row);  
    }
    
}
