package org.example.model;

import org.example.listas.LinkedList;

public class Libro extends Publicacion  {
    private String autor,titulo;
    // si es estatico no me deja meterlo en el constructor
    private  String ISBN;

    private LinkedList<Ejemplar> listaEjemplares= new LinkedList<>();


    public Libro(String editorial, int numPag, boolean color, String autor, String titulo, String ISBN) {
        super(editorial, numPag, color);
        this.autor = autor;
        this.titulo = titulo;
        this.ISBN =ISBN;
        this.listaEjemplares = fillLista(10);//cuidao con el <>
    }

//ESPEFICAR Q TIPO DE LISTA DEVUELVE
    public LinkedList<Ejemplar> getListaEjemplares() {
        return listaEjemplares;
    }



    public LinkedList<Ejemplar> fillLista(int num) {
        for (int i = 0; i <num; i++) {
           listaEjemplares.addTail( new Ejemplar(listaEjemplares.size()+1));

        }
        return listaEjemplares;

    }



//    public LinkedList addToList(Libro e){
//        listaEjemplares.addHead(e);
//        return listaEjemplares;
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


    //2 booleanos


//    public boolean prestarLibro(Ejemplar ejemplar){
//        boolean prestado = false;
//
//
//        if (listaEjemplares.search(ejemplar)== -1  ){
//
//
//
//
//        }
//        return ;
//    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", ISBN='" + ISBN + '\'' +
                " " + super.toString();
    }
}
