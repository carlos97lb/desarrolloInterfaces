/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.beans;

/**
 *
 * @author Carlos Aguayo
 * Creamos la clase libro para definir el objeto libro, en que almacenaremos
 * el genero el titulo el autor y si esta disponible.
 * Implementamos un constructor con parametros y sus getters y setters.
 */
public class Libro {
    private String genero;
    private String titulo;
    private String autor;
    private boolean disponibilidad;

    public Libro(String genero, String titulo, String autor, boolean disponibilidad) {
        this.genero = genero;
        this.titulo = titulo;
        this.autor = autor;
        this.disponibilidad = disponibilidad;
    }

    
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    
}
