package org.example;

import java.util.Arrays;

public class Ejemplar {

    private int codigo;
    private int cantidad;
    private Abonado [] abonados;

    public Ejemplar(int codigo, int cantidad, Abonado ... abonados) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.abonados = abonados;
    }

    @Override
    public String toString() {
        return "Ejemplar{" +
                "codigo=" + codigo +
                ", cantidad=" + cantidad +
                ", abonados=" + Arrays.toString(abonados) +
                '}';
    }
}
