package org.example.model;

public class Periodico extends Publicacion {

    private String nombre;
    private String date;

    public Periodico(String editorial, int numPag, boolean color, String nombre, String date) {
        super(editorial, numPag, color);
        this.nombre = nombre;
        this.date = date;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Periodico{" +
                "nombre='" + nombre + '\'' +
                ", date='" + date + '\'' +
                "} " + super.toString();
    }
}
