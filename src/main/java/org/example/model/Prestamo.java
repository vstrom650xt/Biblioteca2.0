package org.example.model;

import org.example.listas.LinkedList;
import org.example.model.Ejemplar;
import org.example.model.Libro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Prestamo {
    private String fechaFin, FechaInicio;


    private String tituloLibro;
    private int codigoEjemplar;

    public Prestamo(Libro libro) {
        this.FechaInicio = putDate();
        this.fechaFin = "no devuelto";
        this.tituloLibro = libro.getTitulo();
        this.codigoEjemplar = consegirCodi(libro);


    }

    public String putDate() {
        String fecha;
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter forma = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        fecha = now.format(forma);
        return fecha;

    }




    //busca que no hayan 0

    public int consegirCodi(Libro libro) {
        int co;
        for (int i = 1; i < libro.getListaEjemplares().size(); i++) {
            if (!libro.getListaEjemplares().get(i).isAlquilado()) {
                co = libro.getListaEjemplares().get(i).getCodigo();
                libro.getListaEjemplares().get(i).setAlquilado(true);
                return co;
            }

        }


        return 0;
        //    libro.getListaEjemplares().get(i).setCodigo(0);

    }


    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "FechaInicio='" + FechaInicio + '\'' +
                ", fechaFin='" + fechaFin + '\'' +
                ", tituloLibro='" + tituloLibro + '\'' +
                ", codigoEjemplar=" + codigoEjemplar +
                '}';
    }
}
