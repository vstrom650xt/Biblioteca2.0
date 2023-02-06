package org.example.listas;

import org.example.Ejemplar;

public class NodeEjemplar{

    private Ejemplar ejemplar;
    private NodeEjemplar next;


    public NodeEjemplar(){



    }
    public NodeEjemplar(Ejemplar ejemplar){
        this.ejemplar = ejemplar;
        this.next =null;

    }
    public NodeEjemplar(Ejemplar ejemplar, NodeEjemplar next){
        this.ejemplar = ejemplar;
        this.next=next;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public NodeEjemplar getNext() {
        return next;
    }

    public void setNext(NodeEjemplar next) {
        this.next = next;
    }
}
