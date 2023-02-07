package org.example;

import org.example.listas.LinkedListEjemplar;

public class Libro extends Publicacion  {
    private String autor,titulo;
    // si es estatico no me deja meterlo en el constructor
    private static  String ISBN;

    private LinkedListEjemplar lista ;


    // constr


    public Libro(String editorial, int numPag, boolean color, String autor, String titulo, String ISBN,LinkedListEjemplar lista) {
        super(editorial, numPag, color);
        this.autor = autor;
        this.titulo = titulo;
        Libro.ISBN =ISBN; ///ESTO NO SE PORQ ME LO HA CAMBIADO
        this.lista = lista;
    }

    public LinkedListEjemplar getLista() {
        return lista;
    }

    public LinkedListEjemplar addToList(Ejemplar e){
        lista.addHead(e);
        return lista;
    }
    public int getListSize() {
        return lista.size();
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
                " " + super.toString();
    }
}
