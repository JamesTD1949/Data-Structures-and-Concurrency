package Lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CP3LinkedListTest {

    @org.junit.jupiter.api.Test
    void addFirst() {
        CP3LinkedList<String> list = new CP3LinkedList();
        list.addFirst("Anne");
        list.addFirst("Bob");
        list.addFirst("Bill");

        String s = list.getFirst();

        assertEquals("Bill",s);
    }

    @org.junit.jupiter.api.Test
    void getFirst() {
    }

    @org.junit.jupiter.api.Test
    void removeFirst() {
        CP3LinkedList<String> list = new CP3LinkedList();
        list.addFirst("Anne");
        list.addFirst("Bob");
        list.addFirst("Bill");

        list.removeFirst();

        String s = list.getFirst();

        assertEquals("Bob",s);
    }

    @Test
    void size() {
        CP3LinkedList<String> list = new CP3LinkedList();
        list.addFirst("Anne");
        list.addFirst("Bob");
        list.addFirst("Bill");

        int size = list.size();

        assertEquals(3,size);
    }

    @Test
    void contains() {
        CP3LinkedList<String> list = new CP3LinkedList();
        list.addFirst("Anne");
        list.addFirst("Bob");
        list.addFirst("Bill");

        boolean isFound = list.contains("Anne");

        assertEquals(true,isFound);

        isFound = list.contains("Steven");

        assertEquals(false,isFound);
    }

    @Test
    void print() {
        CP3LinkedList<String> list = new CP3LinkedList();
        list.addFirst("Anne");
        list.addFirst("Bob");
        list.addFirst("Bill");

        String result = list.print();

        assertEquals("Bill\nBob\nAnne\n",result);
    }

    @Test
    void isEmpty() {
        CP3LinkedList<String> list = new CP3LinkedList();
        list.addFirst("Anne");
        list.addFirst("Bob");
        list.addFirst("Bill");

        boolean result = list.isEmpty();

        assertEquals(false,result);

        list.removeFirst();
        list.removeFirst();
        list.removeFirst();

        result = list.isEmpty();

        assertEquals(true,result);
    }
}