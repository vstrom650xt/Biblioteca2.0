package org.example;

public class Node <E>{

    private Publicacion publicacion;
    private Node next;


    public Node(){



    }
    public Node(Publicacion publicacion){
        this.publicacion = publicacion;
        this.next =null;

    }
    public Node(Publicacion publicacion, Node next){
        this.publicacion = publicacion;
        this.next=next;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

//    @Override
//    public boolean equals(Object obj){
//        if(!(obj instanceof Node))
//            return false;
//        Node node =(Node) obj;
//        return  (node.getLibro().getISBN()== publicacion.getISBN());
//
//    }
}
