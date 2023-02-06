package org.example;

import org.example.listas.LinkedListEjemplar;
import org.example.listas.LinkedListPublicacion;

public class Prueba {
    public static void main(String[] args) {
        //Periodicidad.MENSUAL;
        LinkedListEjemplar p = new LinkedListEjemplar();
        Abonado ab = new Abonado("jsoe","123123asdas");

        Libro a = new Libro("ppp",1323,false,"yo","1",p);
      //  System.out.println(a);
        LinkedListPublicacion labiblios = new LinkedListPublicacion();
        labiblios.addHead(a);






    }
}
