package org.example.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Periodico extends Publicacion {

    private String nombre;
    private String date;

    public Periodico(String editorial, int numPag, boolean color, String nombre) {
        super(editorial, numPag, color);
        this.nombre = nombre;
        this.date = putDate();
    }

    public String putDate() {
        String fecha;
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter forma = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        fecha = now.format(forma);
        return fecha;

    }

    @Override
    public String toString() {
        return "Periodico{" +
                "nombre='" + nombre + '\'' +
                ", date='" + date + '\'' +
                "} " + super.toString();
    }
}
