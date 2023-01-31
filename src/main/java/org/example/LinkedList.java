package org.example;

public class LinkedList {
    private Node head;
    private  Node tail;
    private int size;

    public LinkedList(){



    }
    public int size(){
        return size;

    }

    public  Node getHead(){
        return head;

    }

    public Node getTail(){
        return tail;
    }

    public boolean isEmpty(){

        return  size==0;
    }


    public  void addHead(Publicacion element){
        Node node= new Node(element);


        if (isEmpty()){
            head= node ;
            tail= node;
        }else{

            node.setNext(head);
            head=node;
        }
        size++;

    }
    public  void addTail(Publicacion element){
        Node node= new Node(element);


        if (isEmpty()){
            head= node ;
            tail= node;
        }else{
            tail.setNext(node);
            head=node;

        }

    }

    // se ponen wrapper para evitar los nulls

    public int search(Publicacion element){
        int result = -1;
        if(isEmpty())
            return result;
        Node node = head;

        for (int j = 0; j < size; j++) {
            if (node.getPublicacion()==element)
                return j;
            node = node.getNext();
        }

        return result;
    }

    public Publicacion [] toArray(){
        Publicacion []vector = new Publicacion[size];
        Node node =head;


        for (int i = 0; i < size; i++) {
            vector[i] = node.getPublicacion();
            node = node.getNext();

        }
        return  vector;


    }

    public Integer remove(int index){
        Integer result= null;
        if (isEmpty()|| index<0 || index >= size) {
            return null;
        }
        Node node =null;
        if (index==0){
            result= head.getElement();
            head= head.getNext();
        }else {
            Node aux = head;
            Node aux2 = head.getNext();

            while (index>1){
                aux= aux2;
                aux2 = aux2.getNext();
                index--;
            }
            result = aux2.getElement();
            aux.setNext(aux2.getNext());
        }
        size--;



        return result;
    }
}
