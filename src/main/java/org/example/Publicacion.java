package org.example;

public abstract class Publicacion {

    private String editorial;
    private int numPag;
    private boolean color;

    public Publicacion(String editorial, int numPag, boolean color) {
        this.editorial = editorial;
        this.numPag = numPag;
        this.color = color;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getNumPag() {
        return numPag;
    }

    public boolean isColor() {
        return color;
    }


    @Override
    public String toString() {
        return "Folios{" +
                "editorial='" + editorial + '\'' +
                ", numPag=" + numPag +
                ", color=" + color +
                '}';
    }
}
