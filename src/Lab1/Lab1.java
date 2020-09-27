package Lab1;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Lab1 {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Hit return to continue");
        List<String> arrList = new ArrayList();
        List<String> linkList = new LinkedList();
        int listSize = 100000; // 10 is first value, then 100, etc

        int reps = 10;  // will need to experiment with value for reps

        //populate both lists with contents of a data file
        try {   // The name of the file which we will read from
            String filename = "C://Users/johnd/Desktop/words_alpha.txt"; //file on my desktop

            // Prepare to read from the file, using a Scanner object
            File file = new File(filename);
            Scanner in = new Scanner(file);

            for (int i = 0; i < listSize; i++){
                // Read one string from the file
                String str = in.nextLine();

                // add str to ArrayList and LinkedList
                arrList.add(str);
                linkList.add(str);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        // generate random numbers to use as indices for get method
        // same random numbers used for ArrayList and LinkedList
        int [] randomNos = generateRandomNos(listSize, reps);

        // call testGetForArrayList, testGetForLinkedList,  testSetForArrayList etc to test get, set, insert and remove for ArrayList and LinkedList.
        //Compare the speed of getting,setting,inserting and removing in both an ArrayList and a LinkedList.
        //Results are shown in tabular format in the word document

        //Use System.nanoTime() before and after the operation to enable us to get the duration
        long startTime = System.nanoTime();
        testGetForArrayList(arrList,randomNos);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Get Arraylist: " + duration);


        startTime = System.nanoTime();
        testGetForLinkedList(linkList,randomNos);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Get Linkedlist: " + duration + "\n\n");


        startTime = System.nanoTime();
        testSetForArrayList(arrList,randomNos);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Set Arraylist: " + duration);

        startTime = System.nanoTime();
        testSetForLinkedList(linkList,randomNos);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Set Linkedlist: " + duration + "\n\n");


        startTime = System.nanoTime();
        testInsertForArrayList(arrList,randomNos);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Insert Arraylist: " + duration);

        startTime = System.nanoTime();
        testInsertForLinkedList(linkList,randomNos);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Insert Linkedlist: " + duration + "\n\n");

        startTime = System.nanoTime();
        testRemoveForArrayList(arrList,randomNos);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Remove Arraylist: " + duration);

        startTime = System.nanoTime();
        testRemoveForLinkedList(linkList,randomNos);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Remove Linkedlist: " + duration);


    }


    public static void testGetForArrayList(List list, int [] randomNos) {
        testGetForList(list, randomNos);
    }

    public static void testGetForLinkedList(List list, int [] randomNos) {
        testGetForList(list, randomNos);
    }

    public static void testSetForArrayList(List list, int [] randomNos) {
        testSetForList(list, randomNos);
    }

    public static void testSetForLinkedList(List list, int [] randomNos) {
        testSetForList(list, randomNos);
    }

    public static void testInsertForArrayList(List list, int [] randomNos) {
        testInsertForList(list);
    }

    public static void testInsertForLinkedList(List list, int [] randomNos) {
        testInsertForList(list);
    }

    public static void testRemoveForArrayList(List list, int [] randomNos) {
        testRemoveForList(list);
    }

    public static void testRemoveForLinkedList(List list, int [] randomNos) {
        testRemoveForList(list);
    }

    public static void testGetForList(List list, int []randomNos) {
        // call get on list multiple times
        for (int i = 0; i < randomNos.length; i++){
            list.get(randomNos[i]);
        }
    }

    public static void testSetForList(List list, int []randomNos) {
        // call get on list multiple times
        for (int i = 0; i < randomNos.length; i++){
            list.get(randomNos[i]);
        }
    }

    //To test insert (add at index), use code like:
    public static void testInsertForList(List list) {
        int reps = 10;
        for (int i = 0; i < reps; i++)
            list.add(5, "test"); // use 5 to minimize random-access cost, 5 an arbitrary number
    }

    //To test remove, use code like:
    public static void testRemoveForList(List list) {
        while (list.size() > 5)
            list.remove(5); // Use 5 to minimize random access cost // 5 an arbitrary number
    }



    public static int [] generateRandomNos(int listSize, int reps){
        Random random = new Random();
        int [] randomNos = new int [reps];

        for(int i = 0; i < reps; i++) {
            randomNos[i] = random.nextInt(listSize);
        }
        return randomNos;
    }
}