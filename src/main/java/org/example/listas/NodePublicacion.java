package org.example.listas;

import org.example.model.Publicacion;

public class NodePublicacion{

    private Publicacion publicacion;
    private NodePublicacion next;


    public NodePublicacion(){



    }
    public NodePublicacion(Publicacion publicacion){
        this.publicacion = publicacion;
        this.next =null;

    }
    public NodePublicacion(Publicacion publicacion, NodePublicacion next){
        this.publicacion = publicacion;
        this.next=next;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public NodePublicacion getNext() {
        return next;
    }

    public void setNext(NodePublicacion next) {
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
