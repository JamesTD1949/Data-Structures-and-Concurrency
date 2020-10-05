package Lab2;

import java.util.NoSuchElementException;
//singly linked list with reference to first node only 

/**
A linked list is a sequence of links with efficient
element insertion and removal. This class 
contains a subset of the methods of the standard
java.util.LinkedList class.
*/

public class CP3LinkedList<E> {
     private class Node {
		public E data;
		public Node next;
		public Node previous;
	}
	private Node first;
     private Node last;
		
	/** 
    	Constructs an empty linked list.
	*/
	public CP3LinkedList()
	{  
		first = null;
		last = null;
	}
 
	/**
 	Adds an element to the front of the linked list.
 	@param element the element to add
	 */
	//MODIFY IF THERE'S ONLY ONE ELEMENT
	public void addFirst(E element)
	{  
		Node newLink = new Node();
		newLink.data = element;
		newLink.next = first;
		first = newLink;
	}

	public E getFirst() {
		if (first == null)
			throw new NoSuchElementException();
		return first.data;
	}

	//MODIFY IF THERE'S ONLY ONE ELEMENT
	public void removeFirst() {
		if (first == null)
			throw new NoSuchElementException();
		first = first.next;
		if(first == null)
		{
			last = null;
		}
	}

	//Q5 Add previous to Node

	public String print(){
		Node current = first;
		String result = "";

		while(current != null){
			//output the data at current
			result += current.data + "\n";
			current = current.next;
		}
		return result;
	}

	public boolean isEmpty()
	{
		return first==null;
	}

	public int size()
	{
		Node current = first;
		int size = 0;

		while(current != null) {
			//increase size variable if current node is not null
			size++;
			current = current.next;
		}
		return size;
	}

	public boolean contains(E value)
	{
		Node current = first;
		boolean found = false;

		while(current != null) {
			//increase size variable if current node is not null
			if(current.data.equals(value))
			{
				found = true;
				return found;
			}
			current = current.next;
		}
		return found;
	}

	public void addLast(E element)
	{
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = null;
		if (last!=null) {
			last.next = newNode;
		}
		if(first == null)
		{
			first = newNode;
		}
		last = newNode;


	}

	
}
