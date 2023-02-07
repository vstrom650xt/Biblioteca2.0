package org.example;

import org.example.listas.LinkedListEjemplar;
import org.example.listas.LinkedListPublicacion;
import org.example.listas.NodeEjemplar;
import org.w3c.dom.Node;

public class Prueba {
    public static void main(String[] args) {



        LinkedListPublicacion labiblios = new LinkedListPublicacion();

        Abonado ptt = new Abonado("pp","1234356");
        Libro harryPotter = new Libro("ppp",1323,false,
                "yo","harryPotter","123113132");

//
        harryPotter.fillLista(5);


        NodeEjemplar n = harryPotter.getListaEjemplares().getHead();
  //      System.out.println(n);
        for (int i = 0; i < 4; i++) {
            System.out.println(n.getEjemplar().getCodigo());
            n=n.getNext();
        //   System.out.println(harryPotter.getListaEjemplares().size());

        }
 //       System.out.println(harryPotter.getListSize());
  //      System.out.println();





    }
}
