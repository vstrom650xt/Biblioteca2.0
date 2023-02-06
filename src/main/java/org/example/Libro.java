package org.example;

import org.example.listas.LinkedListEjemplar;

public class Libro extends Publicacion  {
    private String autor,titulo;
    private static  String ISBN;

    private LinkedListEjemplar lista ;

    public Libro(String editorial, int numPag, boolean color, String autor, String titulo, LinkedListEjemplar lista) {
        super(editorial, numPag, color);
        this.autor = autor;
        this.titulo = titulo;
        this.lista = lista;
    }

    // constr


    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }
}
