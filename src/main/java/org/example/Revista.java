package org.example;

public class Revista  extends Publicacion {

    private String nombre, tematica;
    private Periodicidad periodicidad;

    public Revista(String editorial, int numPag, boolean color, String nombre, String tematica, Periodicidad periodicidad) {
        super(editorial, numPag, color);
        this.nombre = nombre;
        this.tematica = tematica;
        this.periodicidad = periodicidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTematica() {
        return tematica;
    }

    public Periodicidad getPeriodicidad() {
        return periodicidad;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "nombre='" + nombre + '\'' +
                ", tematica='" + tematica + '\'' +
                ", periodicidad=" + periodicidad +
                "} " + super.toString();
    }
}
