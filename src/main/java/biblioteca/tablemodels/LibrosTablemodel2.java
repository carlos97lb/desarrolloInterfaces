/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tablemodels;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author carlo
 */
public class LibrosTablemodel2 extends AbstractTableModel{
   String param1;
   String param2;
   String param3;
   private String[] columnas = {"Autor","Titulo","Genero"};
    public LibrosTablemodel2(String param1, String param2, String param3) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
    }
            
    @Override
    public int getRowCount() {
       return 1;
        
    }

    @Override
    public int getColumnCount() {
       return 3;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         switch(columnIndex){
            case 0: 
                return param1;
            case 1:
                return param2;
            case 2:
                return param3;
    }
       return null;
    
}

    @Override
    public String getColumnName(int column) {
    return columnas[column];  
    }
    
    
}
