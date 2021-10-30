/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.beans;

/**
 *
 * @author carlo
 */
public class LibroMl {
  private  String titulo;
  private   String Autor;
  private   String genero;

    public LibroMl(String titulo, String Autor, String genero) {
        this.titulo = titulo;
        this.Autor = Autor;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
   
}
