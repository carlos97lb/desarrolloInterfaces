/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tablemodels;

import biblioteca.beans.Libro;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Carlos Aguayo
 * en esta clase creamos el modelo de tabla y le indicamos que cargue los parametros que hemos guardado en logica de negocio.
 */
public class LibrosTablemodel extends AbstractTableModel {
    private List<Libro>listaLibro;
    private String[] columnas = {"Genero","Titulo","Autor","Disponibilidad"};

    public LibrosTablemodel(List<Libro> listaLibro) {
        this.listaLibro = listaLibro;
    }
    
    @Override
    public int getRowCount() {
    return listaLibro.size();
    }
    
    

    @Override
    public int getColumnCount() {
        return 4;
    }
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return listaLibro.get(rowIndex).getGenero();
            case 1:
                return listaLibro.get(rowIndex).getTitulo();
            case 2:
                return listaLibro.get(rowIndex).getAutor();
            case 3:
                    if (listaLibro.get(rowIndex).isDisponibilidad()){
                        return "libre";}else{
                return "alquilado";}
                
        }
        return null;
        
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
}
