package org.example.model;

import org.example.listas.LinkedList;

public class Abonado {
    private String nombre, DNI;
    private LinkedList<Prestamo> alquilados;


    public Abonado(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        alquilados = new LinkedList<>();
    }

    public boolean alquilado(Libro libro) {
        boolean available = false;
            for (int j = 1; j < libro.getListaEjemplares().size(); j++) {
                if (!libro.getListaEjemplares().get(j).isAlquilado())
                    return available;
            }
        available = true;
        return available;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDNI() {
        return DNI;
    }

    public LinkedList<Prestamo> addPrestamoToCustomer(Libro libro) {
        if (alquilados.size() >= 3) {
            System.out.println("ya tienes demasiados libro");
        } else {

            int indece=1;
            boolean encontrado = false;
            if (!alquilado(libro))
              do {
                  if(!libro.getListaEjemplares().get(indece).isAlquilado()){
                      encontrado=true;
                  }else{
                   indece++;
                  }
              }while (indece<= libro.getListaEjemplares().size() && !encontrado);
                if (encontrado){

                    libro.getListaEjemplares().get(indece).addAbonado(this);
                }
                alquilados.addTail(new Prestamo(libro));

        }
        return alquilados;
    }


    public LinkedList<Prestamo> devolverPrestamoToCustomer(int libro) {
        if (alquilados.size() == 0) {
        }else {
            alquilados.remove(libro);
        }

        return alquilados;
    }


    public LinkedList<Prestamo> getAlquilados() {
        return alquilados;
    }


    @Override
    public String toString() {
        return "Abonado{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}
