/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HeaderCustom;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
 
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
/**
 *
 * @author User
 */
public class DefaultHeader extends JLabel implements TableCellRenderer {
 
    public DefaultHeader() {
        setFont(new Font("seque ui", Font.BOLD, 14));
        setOpaque(true);
        setForeground(Color.WHITE);
        setBackground(new Color (94, 103, 107 ));
        setBorder(BorderFactory.createEtchedBorder());
      DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalTextPosition(DefaultTableCellRenderer.CENTER);
    }
     
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        setText(value.toString());
        return this;
    }
 
}
