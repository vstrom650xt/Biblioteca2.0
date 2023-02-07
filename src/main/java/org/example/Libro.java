package org.example;

import org.example.listas.LinkedListEjemplar;

public class Libro extends Publicacion  {
    private String autor,titulo;
    // si es estatico no me deja meterlo en el constructor
    private  String ISBN;

    private LinkedListEjemplar listaEjemplares;


    public Libro(String editorial, int numPag, boolean color, String autor, String titulo, String ISBN) {
        super(editorial, numPag, color);
        this.autor = autor;
        this.titulo = titulo;
        this.ISBN =ISBN; ///ESTO NO SE PORQ ME LO HA CAMBIADO
        this.listaEjemplares = new LinkedListEjemplar();
    }


    public LinkedListEjemplar getListaEjemplares() {
        return listaEjemplares;
    }


//    public LinkedListEjemplar getCodigos() {
//        int ultimo = 0;
//        for (int i = 0; i < lista.size(); i++) {
//
//        }
//        return ;
//    }

    //    public int getCodigosEjemplar() {
//        //Ejemplar p = null;
//        for (int i = 0; i < lista.size(); i++) {
//
//
//        }
//        return null;
//    }
    public LinkedListEjemplar fillLista(int num) {
        for (int i = 0; i <num; i++) {
           listaEjemplares.addTail( new Ejemplar(listaEjemplares.size()+1));

        }
        return listaEjemplares;

    }

//    public LinkedListEjemplar addToList(Ejemplar e){
//        lista.addHead(e);
//        return lista;
//    }
    public int getListSize() {
        return listaEjemplares.size();
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
