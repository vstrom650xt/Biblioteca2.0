package org.example.listas;

import org.example.model.Publicacion;

public  class LinkedListPublicacion {
    private NodePublicacion head;
    private NodePublicacion tail;
    private int size;

    public LinkedListPublicacion(){



    }
    public int size(){
        return size;

    }

    public NodePublicacion getHead(){
        return head;

    }

    public NodePublicacion getTail(){
        return tail;
    }

    public boolean isEmpty(){

        return  size==0;
    }


    public  void addHead(Publicacion element){
        NodePublicacion nodePublicacion = new NodePublicacion(element);


        if (isEmpty()){
            head= nodePublicacion;
            tail= nodePublicacion;
        }else{

            nodePublicacion.setNext(head);
            head= nodePublicacion;
        }
        size++;

    }
    public  void addTail(Publicacion element){
        NodePublicacion nodePublicacion = new NodePublicacion(element);


        if (isEmpty()){
            head= nodePublicacion;
            tail= nodePublicacion;
        }else{
            tail.setNext(nodePublicacion);
            head= nodePublicacion;

        }

    }

    // se ponen wrapper para evitar los nulls

    public int search(Publicacion element){
        int result = -1;
        if(isEmpty())
            return result;
        NodePublicacion nodePublicacion = head;

        for (int j = 0; j < size; j++) {
            if (nodePublicacion.getPublicacion()==element)
                return j;
            nodePublicacion = nodePublicacion.getNext();
        }

        return result;
    }

    public Publicacion [] toArray(){
        Publicacion []vector = new Publicacion[size];
        NodePublicacion nodePublicacion =head;


        for (int i = 0; i < size; i++) {
            vector[i] = nodePublicacion.getPublicacion();
            nodePublicacion = nodePublicacion.getNext();

        }
        return  vector;


    }

    public Integer remove(int index){
        Integer result= null;
        if (isEmpty()|| index<0 || index >= size) {
            return null;
        }
        NodePublicacion nodePublicacion =null;
        if (index==0){
            result= head.getPublicacion().getNumPag();
            head= head.getNext();
        }else {
            NodePublicacion aux = head;
            NodePublicacion aux2 = head.getNext();

            while (index>1){
                aux= aux2;
                aux2 = aux2.getNext();
                index--;
            }
            result = aux2.getPublicacion().getNumPag();
            aux.setNext(aux2.getNext());
        }
        size--;



        return result;
    }


}
