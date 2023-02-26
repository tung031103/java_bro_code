package CTDL_GT.LinkedList_ArrayList;

import java.util.LinkedList;
import java.text.NumberFormat.Style;
import java.util.*;

public class LinkedList_ArayList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime;
        long endTime;
        long elapTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        // ************** linked list ***********************
        startTime = System.nanoTime();
        // linkedList.get(0);
        // linkedList.get(500000);
        // linkedList.get(999999);

        // linkedList.remove(0);
        // linkedList.remove(500000);
        linkedList.remove(999999);

        endTime = System.nanoTime();

        elapTime = endTime - startTime;

        System.out.println("linked list:\t" + elapTime + " ns");
        // ************** Array list ************************
        startTime = System.nanoTime();
        // arrayList.get(0);
        // arrayList.get(500000);
        // arrayList.get(999999);

        // arrayList.remove(0);
        // arrayList.remove(500000);
        arrayList.remove(999999);

        endTime = System.nanoTime();

        elapTime = endTime - startTime;
        System.out.println("array list:\t" + elapTime + " ns");
    }
}
