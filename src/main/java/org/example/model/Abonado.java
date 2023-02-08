package org.example.model;

import org.example.listas.LinkedList;
import org.example.listas.Prestamo;

public class Abonado {
    private String nombre,DNI;
    private LinkedList<Prestamo> alquilados;

    public Abonado(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Abonado{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}
