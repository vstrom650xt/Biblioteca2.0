package org.example.logic;

import org.example.listas.LinkedList;
import org.example.model.*;

import java.util.Scanner;

public class Biblioteca {
    public static LinkedList<Publicacion> biblioteca = new LinkedList<>();
    public static LinkedList<Abonado> clientes = new LinkedList<>();
    public static Abonado abonado;
    public static Libro libro;


    public Biblioteca() {
        biblioteca = crearBiblioteca();
        clientes = crearClientes();
    }


    public static LinkedList<Publicacion> crearBiblioteca() {
        biblioteca.addHead(new Libro("ppp", 1323, false,
                "yo", "harryPotter", "123113132"));
        biblioteca.addHead(new Libro("vvvvv", 456, true,
                "yo", "El señor de los anillos", "999999"));
        biblioteca.addHead(new Periodico("EL PAIS", 10, true, "ultima hora"));
        biblioteca.addHead(new Revista("Alfaguara", 123, false, "hola", "informativo", Periodicidad.MENSUAL));

        return biblioteca;


    }

    public static LinkedList<Abonado> crearClientes() {
        clientes.addTail(new Abonado("jose", "123465"));
        clientes.addTail(new Abonado("helena", "7897845"));
        clientes.addTail(new Abonado("lol", "852147"));
        return clientes;
    }


    public static void mostrarClientes() {
        for (int i = 1; i <= clientes.size(); i++) {
            System.out.println(clientes.get(i));
        }
    }

    public static void mostrarPublicaciones() {
        for (int i = 1; i <= biblioteca.size(); i++) {
            System.out.println(biblioteca.get(i));
        }
    }

    public static void elegerPerfil() {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("1.Admin");
        System.out.println("2. cliente");
        a = sc.nextInt();

        if (a == 1) {
            menuAdmin();
        } else {
            accesoMenuClientes();
        }

    }


    public static void accesoMenuClientes() {
        Scanner sc = new Scanner(System.in);
        String name;
        int cont = 0;
        do {
            System.out.println("escribe tu nombre de usuario");
            name = sc.next();
            for (int i = 1; i <= clientes.size(); i++) {
                if (name.equals(clientes.get(i).getNombre())) {
                    abonado = clientes.get(i);
                    menuCliente();
                }

            }
            cont++;

        } while (cont != 3);
    }

    public static void menuAdmin() {

        int a;
        String b;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.dar de alta publicacion");
            System.out.println("2.dar de baja publicacion");
            System.out.println("3.modificar datos clientes");
            System.out.println("4.ver publicaciones");
            System.out.println("5.volver");

            a = sc.nextInt();

            if (a == 1) {
                System.out.println("que tipo de publicacion quieres");
                System.out.println("1.Libro");
                System.out.println("2.Revista");
                System.out.println("3.Periodico");
                a = sc.nextInt();
                if (a == 1) {
                    String editorial;
                    editorial = sc.next();
                    int numPag;
                    numPag = sc.nextInt();
                    boolean color = true;
                    //.......
                    String autor;
                    autor = sc.next();
                    String titulo;
                    titulo = sc.next();
                    String ISBN;
                    ISBN = sc.next();
                    biblioteca.addHead(new Libro(editorial, numPag, color, autor, titulo, ISBN));

                } else if (a == 2) {
                    String editorial;
                    editorial = sc.next();
                    int numPag;
                    numPag = sc.nextInt();
                    boolean color = true;
                    String nombre;
                    nombre = sc.next();
                    String tematica;
                    tematica = sc.next();
                    System.out.println("pon periodicidad 7  30  90");
                    int p = sc.nextInt();
                    biblioteca.addHead(new Revista(editorial, numPag, color, nombre, tematica, Periodicidad.SEMANAL));


                } else if (a == 3) {
                    String editorial;
                    editorial = sc.next();
                    int numPag;
                    numPag = sc.nextInt();
                    boolean color = true;
                    String nombre;
                    nombre = sc.next();
                    biblioteca.addHead(new Periodico(editorial, numPag, color, nombre));

                }

            } else if (a==2) {
                
            } else if (a==3) {
                
            }else if (a==4) {
                mostrarPublicaciones();
            }


        } while (a != -1);
    }

    public static void menuCliente() {
        int a;
        String b;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.alquilar libro");
            System.out.println("2.devolver libro");
            System.out.println("3.comprar revista");
            System.out.println("4.comprar periodico");
            a = sc.nextInt();

            if (a == 1) {
                //mostrar libros
                Biblioteca.mostrarPublicaciones();
                Biblioteca.mostrarClientes();
                System.out.println("escriba el nombre del titulo");
                b = sc.next();

                //  abonado.addPrestamoToCustomer();


            }


        } while (a != -1);


    }


}
