package org.example;

import org.example.listas.LinkedListPublicacion;
import org.example.model.Abonado;
import org.example.model.Ejemplar;
import org.example.model.Libro;
import org.w3c.dom.Node;

public class Prueba {
    public static void main(String[] args) {
//EN ESTE EJER GUARDADO VERSIONES EN GIT DE LAS LISTAS


        LinkedListPublicacion labiblios = new LinkedListPublicacion();

        Abonado ptt = new Abonado("pp","1234356");
        Libro harryPotter = new Libro("ppp",1323,false,
                "yo","harryPotter","123113132");

//
        harryPotter.fillLista(5);
        Ejemplar a = (Ejemplar) harryPotter.getListaEjemplares().get(3);
        ((Ejemplar) harryPotter.getListaEjemplares().get(2)).addAbonado(ptt);
        for (int i = 1; i <= harryPotter.getListSize(); i++) {
            System.out.println("codigo de inicio "+harryPotter.getListaEjemplares().get(i));

        }





    }
}
