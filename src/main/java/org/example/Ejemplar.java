package org.example;

import org.example.listas.LinkedListAbonado;
import org.example.listas.LinkedListEjemplar;

import java.util.Arrays;

public class Ejemplar {

    private int codigo;
    // cambiar por lista
    private LinkedListAbonado listAbonado;

    public Ejemplar(int codigo) {
        this.listAbonado = new LinkedListAbonado();
        this.codigo =codigo ;
    }

    public void showCodigos(){
        for (int i = 0; i < listAbonado.size(); i++) {
            System.out.println(codigo);

        }




    }

    public int increaseCod(){
        if (listAbonado.size()==0){
            codigo=1;
        }else{
            codigo = listAbonado.size()+1;
        }

        return  codigo;
    }
    public LinkedListAbonado addAbonado(Abonado a ){

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
