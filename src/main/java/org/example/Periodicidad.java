package org.example;

public enum Periodicidad {

    SEMANAL(7),
    MENSUAL(30),
    TRIMESTRA(90);


    private int dias;

    Periodicidad(int dias) {
        this.dias = dias;
    }
}
