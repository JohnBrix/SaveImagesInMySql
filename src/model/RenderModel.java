/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class RenderModel extends AbstractTableModel {

    private String[] columns;
    private Object[][] rows;
    
    public RenderModel(){
    

    }
    
    public RenderModel(Object[][] data, String[] columnName){
    
        this.rows = data;
        this.columns = columnName;
    }

    

    
    public Class getColumnClass(int column){
        System.out.print("\n get Column class");
        
        
// 2 is the index of the column image
        if(column == 2){
             System.out.print("\n column 2 == 2 is true");
            return ImageIcon.class;
          
        }
        else{
            System.out.print("\n default column class");
            //for value para my laman sya na data ksi pag wala picture lng lalabas
            return getValueAt(0,column).getClass();
            
        }
    }
    
    
    public int getRowCount() {
     return this.rows.length;
    }

    public int getColumnCount() {
     return this.columns.length;
    }

    
    public Object getValueAt(int rowIndex, int columnIndex) {
    
    return this.rows[rowIndex][columnIndex];
    }
    public String getColumnName(int col){
        return this.columns[col];
    }


}
