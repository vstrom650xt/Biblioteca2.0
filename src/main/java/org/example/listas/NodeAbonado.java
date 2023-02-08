package org.example.listas;

import org.example.model.Abonado;

public class NodeAbonado{

    private Abonado abonado;
    private NodeAbonado next;


    public NodeAbonado(){



    }
    public NodeAbonado(Abonado abonado){
        this.abonado = abonado;
        this.next =null;

    }
    public NodeAbonado(Abonado abonado, NodeAbonado next){
        this.abonado = abonado;
        this.next=next;
    }

    public Abonado getAbonado() {
        return abonado;
    }

    public void setEjemplar(Abonado abonado) {
        this.abonado = abonado;
    }

    public NodeAbonado getNext() {
        return next;
    }

    public void setNext(NodeAbonado next) {
        this.next = next;
    }
}
