package org.example.listas;

import org.example.model.Ejemplar;

 class NodeEjemplar<T>{

    private T ejemplar;
    private NodeEjemplar<T> next;


    public NodeEjemplar(){



    }
    public NodeEjemplar(T ejemplar){
        this.ejemplar = ejemplar;
        this.next =null;

    }
    public NodeEjemplar(T ejemplar, NodeEjemplar next){
        this.ejemplar = ejemplar;
        this.next=next;
    }

    public T getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(T ejemplar) {
        this.ejemplar = ejemplar;
    }

    public NodeEjemplar<T> getNext() {
        return next;
    }

    public void setNext(NodeEjemplar<T> next) {
        this.next = next;
    }
}
