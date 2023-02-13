package org.example.model;

import org.example.listas.LinkedList;
import org.jetbrains.annotations.NotNull;

public class Abonado {
    private String nombre, DNI;
    private LinkedList<Prestamo> alquilados;


    public Abonado(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        alquilados = new LinkedList<>();
    }

    public boolean stock(Libro libro) {
        boolean available = true;
        for (int j = 1; j < libro.getListaEjemplares().size(); j++) {
            if (!libro.getListaEjemplares().get(j).isAlquilado())
                return available;


        }

        available = false;
        return available;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDNI() {
        return DNI;
    }

    public LinkedList<Prestamo> addPrestamoToCustomer(Libro libro) {
        if (alquilados.size() >= 3) {
            System.out.println("ya tienes demasiados libro");
        } else {
            if (stock(libro))
                alquilados.addTail(new Prestamo(libro));
        }
        return alquilados;
    }


    public LinkedList<Prestamo> devolverPrestamoToCustomer(Libro libro) {
        if (alquilados.size() == 0) {
            System.out.println("no tienes libros que devolver");
        }

        for (int i = 0; i < alquilados.size(); i++) {


        }
        return alquilados;
    }


    public LinkedList<Prestamo> getAlquilados() {
        return alquilados;
    }


    @Override
    public String toString() {
        return "Abonado{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}
