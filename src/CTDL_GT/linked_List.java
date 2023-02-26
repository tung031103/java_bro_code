package CTDL_GT;

import java.util.*;

public class linked_List {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // linkedList.push("A");
        // linkedList.push("B");
        // linkedList.push("C");
        // linkedList.push("D");
        // linkedList.push("E");
        // linkedList.pop();

        // linked list as a Queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("E");
        // linkedList.poll();

        // linkedList.add(4, "E");
        // linkedList.remove("E");
        // System.out.println(linkedList.indexOf("E"));

        // System.out.println(linkedList.peekFirst());
        // System.out.println(linkedList.peekLast());
        // linkedList.addFirst("0");
        // linkedList.addLast("F");
        // String first = linkedList.removeFirst();
        // String last = linkedList.removeLast();

        System.out.println(linkedList);

    }
}
