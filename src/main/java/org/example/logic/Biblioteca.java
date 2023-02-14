package org.example.logic;

import org.example.listas.LinkedList;
import org.example.model.*;

import java.util.Scanner;

public class Biblioteca {
    public static LinkedList<Publicacion> biblioteca = new LinkedList<>();
    public static LinkedList<Abonado> clientes = new LinkedList<>();
    public static Abonado abonado;
    public static Libro libro;
    public static Ejemplar ejemplar;

    public static Publicacion publicacion;


    public Biblioteca() {
        biblioteca = crearBiblioteca();
        clientes = crearClientes();
    }


    public static LinkedList<Publicacion> crearBiblioteca() {
        biblioteca.addTail(new Libro("ppp", 1323, false,
                "yo", "harryPotter", "123113132"));
        biblioteca.addTail(new Libro("vvvvv", 456, true,
                "yo", "El señor de los anillos", "999999"));
        biblioteca.addTail(new Periodico("EL PAIS", 10, true, "ultima hora"));
        biblioteca.addTail(new Revista("Alfaguara", 123, false, "hola", "informativo", Periodicidad.MENSUAL));

        return biblioteca;


    }

    public static LinkedList<Abonado> crearClientes() {
        clientes.addTail(new Abonado("2", "123465"));
        clientes.addTail(new Abonado("helena", "7897845"));
        clientes.addTail(new Abonado("lol", "852147"));
        return clientes;
    }


    public static void mostrarClientes() {
        for (int i = 1; i <= clientes.size(); i++) {
            System.out.println(i + " " + clientes.get(i));
        }
    }

    public static void mostrarPublicaciones() {
        for (int i = 1; i < biblioteca.size(); i++) {
            System.out.println(i + " " + biblioteca.get(i));

        }
    }

    public static LinkedList<Publicacion> deleteBook(int posicion) {
        biblioteca.remove(posicion - 1);
        return biblioteca;

    }

    public static LinkedList<Abonado> deleteCustomer(int posicion) {
        biblioteca.remove(posicion - 1);
        return clientes;

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
        String b, c;
        Periodicidad periodicidad = Periodicidad.SEMANAL;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.dar de alta publicacion");
            System.out.println("2.dar de baja publicacion");
            System.out.println("3.dar de alta clientes");
            System.out.println("4.dar de baja clientes");
            System.out.println("5.modificar datos clientes");
            System.out.println("6.ver publicaciones");
            System.out.println("7.volver");

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
                    if (p == 7) {

                        periodicidad = Periodicidad.SEMANAL;
                    } else if (p == 30) {
                        periodicidad = Periodicidad.MENSUAL;

                    } else if (p == 90) {
                        periodicidad = Periodicidad.TRIMESTRA;

                    }
                    biblioteca.addHead(new Revista(editorial, numPag, color, nombre, tematica, periodicidad));


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

            } else if (a == 2) {  //borrar publica
                mostrarPublicaciones();
                System.out.println("pon numero q qieras borrar");
                a = sc.nextInt();
                deleteBook(a);
                mostrarPublicaciones();
                System.out.println();
                System.out.println();

            } else if (a == 3) {//alta cliente
                System.out.println("cuantos clientes desea añadir");
                a = sc.nextInt();
                for (int i = 0; i < a; i++) {
                    System.out.println("pon nombre");
                    b = sc.next();
                    System.out.println("pon dni");
                    c = sc.next();
                    new Abonado(b, c);
                }


            } else if (a == 4) { //borrar cliente
                mostrarClientes();
                System.out.println("pon numero q qieras borrar");
                a = sc.nextInt();
                deleteCustomer(a);
                mostrarClientes();
                a = sc.nextInt();
            } else if (a == 5) {// modi cliente
                mostrarClientes();
                modificarCliente();
                mostrarClientes();
            } else if (a == 6) { //ver
                mostrarPublicaciones();
            } else if (a == 7) { //salir
                elegerPerfil();
            }


        } while (a != -1);
    }

    ///////////////////lloookko
    public static LinkedList<Abonado> modificarCliente() {
        Scanner sc = new Scanner(System.in);
        String b;
        int c;
        System.out.println("introduce el num ");
        c = sc.nextInt();

        abonado = clientes.get(c);

        System.out.println("pon nuevo nombre");
        b = sc.next();
        abonado.setNombre(b);
        System.out.println("pon nuevo dni");
        b = sc.next();
        abonado.setDNI(b);
        return clientes;


        //      System.out.println("el cliente no existe");


    }

    public static void menuCliente() {
        int a;
        String b;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.alquilar libro");
            System.out.println("2.devolver libro");

            a = sc.nextInt();

            if (a == 1) {
                //mostrar libros
                Biblioteca.mostrarPublicaciones();
                System.out.println("introduce el num ");
                a = sc.nextInt();
                publicacion = biblioteca.get(a);
                libro = (Libro) publicacion;

                abonado.addPrestamoToCustomer(libro);

                mostrarAlquilados();


            } else if (a == 2) {
                if (abonado.getAlquilados().size() == 0) {
                    System.out.println("no tienes libros que devolver");


                } else {
                    mostrarAlquilados();
                    System.out.println("introduce el num ");
                    a = sc.nextInt();
                    publicacion = biblioteca.get(a);
                    libro = (Libro) publicacion;
                    abonado.getAlquilados().remove(a-1);
                    mostrarAlquilados();
                }

            } else if (a==3) {
                elegerPerfil();

            }


        } while (a != -1);


    }


    public static void mostrarAlquilados() {
        if (abonado.getAlquilados().isEmpty()){
            System.out.println("no hay nada");

        }else {

            for (int i = 1; i <= abonado.getAlquilados().size(); i++) {
                System.out.println(i + " " + abonado.getAlquilados().get(i));


            }

        }

    }

    public static LinkedList<Publicacion> getBiblioteca() {
        return biblioteca;
    }
}
