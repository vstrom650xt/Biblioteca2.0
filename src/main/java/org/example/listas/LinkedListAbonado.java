package org.example.listas;


import org.example.Abonado;
import org.example.Ejemplar;

public class LinkedListAbonado  {
    private NodeAbonado head;
    private NodeAbonado tail;
    private int size;

    public LinkedListAbonado(){



    }
    public int size(){
        return size;

    }
    //NodeEmplar
    public NodeAbonado getHead(){
        return head;

    }

    public NodeAbonado getTail(){
        return tail;
    }

    public boolean isEmpty(){

        return  size==0;
    }


    public  void addHead(Abonado element){
        NodeAbonado nodeAbonado = new NodeAbonado(element);


        if (isEmpty()){
            head= nodeAbonado;
            tail= nodeAbonado;
        }else{

            nodeAbonado.setNext(head);
            head= nodeAbonado;
        }
        size++;

    }
    public  void addTail(Abonado element){
        NodeAbonado nodeAbonado = new NodeAbonado(element);


        if (isEmpty()){
            head= nodeAbonado;
            tail= nodeAbonado;
        }else{
            tail.setNext(nodeAbonado);
            head= nodeAbonado;

        }

    }

    // se ponen wrapper para evitar los nulls

//    public int search(Ejemplar element){
//        int result = -1;
//        if(isEmpty())
//            return result;
//        NodeAbonado nodeAbonado = head;
//
//        for (int j = 0; j < size; j++) {
//            if (nodeAbonado.getEjemplar()==element)
//                return j;
//            nodeAbonado = nodeAbonado.getNext();
//        }
//
//        return result;
//    }

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

    public Integer remove(int index){
        Integer result= null;
        if (isEmpty()|| index<0 || index >= size) {
            return null;
        }
        NodeEjemplar nodePublicacion =null;
        if (index==0){
            //result= head.getEjemplar();
            head= head.getNext();
        }else {
            NodeAbonado aux = head;
            NodeAbonado aux2 = head.getNext();

            while (index>1){
                aux= aux2;
                aux2 = aux2.getNext();
                index--;
            }
            //result = aux2.getAbonado().getCodigo();
            aux.setNext(aux2.getNext());
        }
        size--;



        return result;
    }

}
