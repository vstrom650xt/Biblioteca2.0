package org.example;

public class Abonado {
    private String nombre,DNI;

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
