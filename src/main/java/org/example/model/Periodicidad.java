package org.example.model;

public enum Periodicidad {

    SEMANAL(7),
    MENSUAL(30),
    TRIMESTRA(90);

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    private int dias;

    Periodicidad(int dias) {
        this.dias = dias;
    }
}
