package org.example;

import org.example.listas.LinkedListAbonado;
import org.example.listas.LinkedListEjemplar;

import java.util.Arrays;

public class Ejemplar {

    private int codigo;
    // cambiar por lista
    private LinkedListAbonado listAbonado;

    public Ejemplar() {
        this.codigo = increaseCod();
        this.listAbonado = new LinkedListAbonado();
    }

    public int getCodigo() {
        return codigo;
    }

    public int increaseCod(){



        if (codigo==0){
            codigo=1;
        }else{
            codigo++;
        }

        return  codigo;
    }

    @Override
    public String toString() {
        return "Ejemplar{" +
                "codigo=" + codigo +
                ", listAbonado=" + listAbonado +
                '}';
    }
}
