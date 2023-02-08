package org.example;

import org.example.listas.LinkedListPublicacion;
import org.example.listas.NodeEjemplar;
import org.example.model.Abonado;
import org.example.model.Libro;
import org.w3c.dom.Node;

public class Prueba {
    public static void main(String[] args) {



        LinkedListPublicacion labiblios = new LinkedListPublicacion();

        Abonado ptt = new Abonado("pp","1234356");
        Libro harryPotter = new Libro("ppp",1323,false,
                "yo","harryPotter","123113132");

//
        harryPotter.fillLista(5);

        //esto no entiendo porq no printea
//        for (int i = 0; i < harryPotter.getListSize(); i++) {
//            System.out.println(harryPotter.getListaEjemplares().getHead().getEjemplar());
//            harryPotter.getListaEjemplares().getHead().getNext().getEjemplar().getCodigo();
//
//        }
        NodeEjemplar n=    harryPotter.getListaEjemplares().getHead();

        for (int i = 0; i < harryPotter.getListSize(); i++) {
            System.out.println(n.getEjemplar());
            n=n.getNext();

        }
       // harryPotter.getListaEjemplares().getHead().getEjemplar().addAbonado(ptt);
  //     System.out.println(harryPotter.getListaEjemplares().getHead().getEjemplar().getListAbonado());



   //     System.out.println(harryPotter.getListaEjemplares().getHead().getEjemplar());

        System.out.println("codigo de inicio "+harryPotter.getListaEjemplares().getHead().getEjemplar().getCodigo());

        System.out.println("tamano lista ejemplares "+harryPotter.getListaEjemplares().size());





    }
}
