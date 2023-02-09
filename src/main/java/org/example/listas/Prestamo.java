package org.example.listas;

import org.example.model.Libro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Prestamo {
    private  String FechaInicio , fechaFin;
    private Libro libro;

    private int codigoEjemplar;
    public Prestamo() {
        this.FechaInicio = putDate();
        this.fechaFin = putDate();
        this.codigoEjemplar = libro.getListaEjemplares().get(2).getCodigo();
    }

    public String putDate(){
        String fecha;
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter forma = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        fecha= now.format(forma);
        return fecha;

    }

    public String getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        FechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCodigoEjemplar(int i){
        return libro.getListaEjemplares().get(i).getCodigo();
    }

}
