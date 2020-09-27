package Lab1;

import java.util.NoSuchElementException;

public class CP3LinkedList<E>{
    private class Node{
        public E data;
        public Node next;
    }

    private Node first;

    public CP3LinkedList()
    {
        first = null;
    }

    public E getFirst()
    {
        if (first == null)
            throw new NoSuchElementException();
        return first.data;
    }

    public void addFirst(E element)
    {
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = first;
        first = newNode;
    }

    public void removeFirst()
    {
       if  (first == null){
           throw new NoSuchElementException();
       }
       first = first.next;
    }
}
