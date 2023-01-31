package org.example;

public class Libro {
    private String autor,titulo;
    private static  String ISBN;


// constr
    public Libro(String autor, String titulo, String ISBN) {
        this.autor = autor;
        this.titulo = titulo;
        this.ISBN = ISBN;
    }

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
