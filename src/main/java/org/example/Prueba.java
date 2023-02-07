package org.example;

import org.example.listas.LinkedListEjemplar;
import org.example.listas.LinkedListPublicacion;

public class Prueba {
    public static void main(String[] args) {

        LinkedListEjemplar p = new LinkedListEjemplar();
        LinkedListPublicacion labiblios = new LinkedListPublicacion();
        Ejemplar hp = new Ejemplar();
        Ejemplar hp2 = new Ejemplar();

        Libro harryPotter = new Libro("ppp",1323,false,
                "yo","harryPotter","123113132",p);
        p.addHead(hp);
      //  System.out.println(harryPotter);
        System.out.println();
       // labiblios.addHead(harryPotter);
        p.addHead(hp2);
        System.out.println(harryPotter.getListSize());
        System.out.println(harryPotter);
        System.out.println(hp.getCodigo());
        System.out.println(hp2.getCodigo());



    }
}
