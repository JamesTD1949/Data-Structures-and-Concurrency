package Lab2;

public class Main {
    public static void main(String[] args) {
        CP3LinkedList<String> list = new CP3LinkedList();
        list.addFirst("Anne");
        list.addFirst("Bob");
        list.addFirst("Bill");

        list.removeFirst();

        String s = list.getFirst();
        System.out.println(s);//expect Bob

        list.print();
    }
}
