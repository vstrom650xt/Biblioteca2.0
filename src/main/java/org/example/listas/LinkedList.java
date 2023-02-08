package org.example.listas;

import org.example.model.Ejemplar;
import org.w3c.dom.Node;

import java.lang.reflect.Array;

public class LinkedList <T>{
    private NodeEjemplar<T>  head;
    private NodeEjemplar<T> tail;
    private int size;

    public LinkedList(){



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
            tail= nodeEjemplar;

        }
        size++;

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

    public T [] toArray(Class c){
        T []vector = (T[]) Array.newInstance(c,size);
        NodeEjemplar nodePublicacion =head;


        for (int i = 0; i < size; i++) {
            vector[i] = (T)nodePublicacion.getEjemplar();
            nodePublicacion = nodePublicacion.getNext();

        }
        return  vector;


    }


    public  T get (int index){

        NodeEjemplar <T>  node= head;
        if (index <= 0 || isEmpty() || index> size()){
            return null;
        }

        if (index==1)
            return node.getEjemplar();

        while (index>1){
            node=node.getNext();
            index--;
        }



        return node.getEjemplar();
    }


    public T remove(int index){
        T result= null;
        if (isEmpty()|| index<0 || index >= size) {
            return null;
        }
        NodeEjemplar nodePublicacion =null;
        if (index==0){
            result= head.getEjemplar();
            head= head.getNext();
        }else {
            NodeEjemplar<T> aux = head;
            NodeEjemplar<T> aux2 = head.getNext();

            while (index>1){
                aux= aux2;
                aux2 = aux2.getNext();
                index--;
            }
            result = aux2.getEjemplar();
            aux.setNext(aux2.getNext());


            if (index==size()){
                tail= aux;


            }
            size--;
        }





        return result;
    }


}
