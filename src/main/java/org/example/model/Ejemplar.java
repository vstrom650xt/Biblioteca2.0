package org.example.model;

import org.example.listas.generics.LinkedList;

public class Ejemplar {

    private int codigo;
    // cambiar por lista
    private LinkedList listAbonado;

    private Libro libro;

    public Ejemplar(int codigo) {
        this.listAbonado = new LinkedList();
        this.codigo =codigo;

    }


    public LinkedList getListAbonado() {
        return listAbonado;
    }

    //    public int increaseCod(){
//        if (getLibro()==0){
//            codigo=1;
//        }else{
//            codigo = listAbonado.size()+1;
//        }
//
//        return  codigo;
//    }
    public LinkedList addAbonado(Abonado a ){

        listAbonado.addHead(a);
        return listAbonado;



    }

    public int getCodigo() {
        return codigo;
    }





    @Override
    public String toString() {
        return "Ejemplar{" +
                "codigo=" + codigo +
                ", listAbonado=" + listAbonado +
                '}';
    }
}
