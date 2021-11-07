import java.util.List;
import java.util.ListIterator;

public class LinkedList<E> implements ListIterator<E> {

    class Node<E>{
        E data;
        Node<E> next;
        public Node (E obj){
            data = obj;
            next = null;

        }
    }

    private Node <E> head;
    private Node<E> tail;
    private int currentSize;

    public LinkedList (){
        head = tail = null;

        currentSize = 0;

    }

    public void addFirst(E obj){

        Node <E> node = new Node<E>(obj);

        if(head == null){ //if head is null then the new node is now the new head and tail
            head = node;
            tail = head;
            currentSize++;
            return;
        }
        node.next = head;
        head = node;
        currentSize++;
    }

    public void addLast(E obj){
        Node<E> node = new Node<E>(obj);
        if(head == null){
            head = tail = node;
            currentSize++;
            return;
        }
        // -- This code is for the time complexity for iterating through the list with a temp node object --
        // -- Deprecated since there's a better time complexity with keeping track of the tail end of the list --
        //Node<E> temp = head;
        //while(temp.next != null){
        //  temp = temp.next;
        //}
        //temp.next = node;
        //currentSize++;

        tail.next = node; //Tail is pointing to the last node which has a .next = null. We make the .next = the new node
        tail = tail.next;// tail now points to the new end of the list where we assigned the new node
        currentSize++;

    }


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public E next() {
        return null;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }

    @Override
    public E previous() {
        return null;
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return 0;
    }

    @Override
    public void remove() {

    }

    @Override
    public void set(E e) {

    }

    @Override
    public void add(E e) {

    }


}
