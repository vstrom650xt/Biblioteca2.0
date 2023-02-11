package org.example.model;

import org.example.listas.generics.LinkedList;

public class Ejemplar {

    private  boolean alquilado;
    private int codigo;
    // cambiar por lista
    private LinkedList<Abonado> listAbonado;


    public Ejemplar(int codigo) {
        this.listAbonado = new LinkedList();
        this.codigo =codigo;
        this.alquilado=false;

    }
//devuel false
    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    public LinkedList getListAbonado() {
        return listAbonado;
    }

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
                "alquilado=" + alquilado +
                ", codigo=" + codigo +
                ", listAbonado=" + listAbonado +
                '}';
    }
}
