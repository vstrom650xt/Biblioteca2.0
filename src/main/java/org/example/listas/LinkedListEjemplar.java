package org.example.listas;

import org.example.Ejemplar;

public class LinkedListEjemplar  {
    private NodeEjemplar head;
    private NodeEjemplar tail;
    private int size;

    public LinkedListEjemplar(){



    }
    public int size(){
        return size;

    }
//NodeEmplar
    public NodeEjemplar getHead(){
        return head;

    }

    public NodeEjemplar getTail(){
        return tail;
    }

    public boolean isEmpty(){

        return  size==0;
    }


    public  void addHead(Ejemplar element){
        NodeEjemplar nodeEjemplar = new NodeEjemplar(element);


        if (isEmpty()){
            head= nodeEjemplar;
            tail= nodeEjemplar;
        }else{

            nodeEjemplar.setNext(head);
            head= nodeEjemplar;
        }
        size++;

    }
    public  void addTail(Ejemplar element){
        NodeEjemplar nodeEjemplar = new NodeEjemplar(element);


        if (isEmpty()){
            head= nodeEjemplar;
            tail= nodeEjemplar;
        }else{
            tail.setNext(nodeEjemplar);
            head= nodeEjemplar;

        }

    }

    // se ponen wrapper para evitar los nulls

    public int search(Ejemplar element){
        int result = -1;
        if(isEmpty())
            return result;
        NodeEjemplar nodeEjemplar = head;

        for (int j = 0; j < size; j++) {
            if (nodeEjemplar.getEjemplar()==element)
                return j;
            nodeEjemplar = nodeEjemplar.getNext();
        }

        return result;
    }

//    public Publicacion [] toArray(){
//        Publicacion []vector = new Publicacion[size];
//        NodePublicacion nodePublicacion =head;
//
//
//        for (int i = 0; i < size; i++) {
//            vector[i] = nodePublicacion.getPublicacion();
//            nodePublicacion = nodePublicacion.getNext();
//
//        }
//        return  vector;
//
//
//    }

//    public Integer remove(int index){
//        Integer result= null;
//        if (isEmpty()|| index<0 || index >= size) {
//            return null;
//        }
//        NodeEjemplar nodePublicacion =null;
//        if (index==0){
//            //result= head.getEjemplar();
//            head= head.getNext();
//        }else {
//            NodeEjemplar aux = head;
//            NodeEjemplar aux2 = head.getNext();
//
//            while (index>1){
//                aux= aux2;
//                aux2 = aux2.getNext();
//                index--;
//            }
//            result = aux2.getEjemplar().getNumPag();
//            aux.setNext(aux2.getNext());
//        }
//        size--;
//
//
//
//        return result;
//    }

}
