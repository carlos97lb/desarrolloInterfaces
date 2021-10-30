/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.logica;

import biblioteca.beans.Libro;
import biblioteca.beans.LibroMl;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Aguayo
 * Creamos la clase logica de negocio donde tendremos un array de libros con sus respectivos libros creados
 * y el metodo getlistalibros que sera cargado en el tablemodel.
 * 
 */
public  class  LogicaNegocio {
    public static  List<Libro> listaLibro = new ArrayList<>();
    public static List<LibroMl> añadirlibros = new ArrayList<>();
    
    public static void librosInit(){
        listaLibro =new ArrayList<>();
        listaLibro.add(new Libro ("Terror","Pesadillas","margot gomez",true ));
        listaLibro.add(new Libro ("Suspense","Locura","matias perez",true ));
        listaLibro.add(new Libro ("Aventuras","Avaricia","julian ", true));
        listaLibro.add(new Libro ("Accion","Venganza","carlos", true));
    }
    //el metodo getlistaLibros nos devuelve la lista de libros.
    public static  List<Libro> getlistaLibros(){
        return listaLibro;
    }
    

    
    
    
}
