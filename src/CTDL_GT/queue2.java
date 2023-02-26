package CTDL_GT;

import java.util.*;

public class queue2 {
    // priority queue = A FIFO data structure that serves elements
    // with the highest priority first
    // before element with lower priority
    public static void main(String[] args) {
        // Queue<Double> q = new LinkedList<>(); // default q
        // Queue<Double> q = new PriorityQueue<>(); // sort queue
        // Queue<Double> q = new PriorityQueue<>(Collections.reverseOrder()); // reverse
        // queue
        Queue<String> q = new PriorityQueue<>(); // sort
        // Queue<String> q = new PriorityQueue<>(Collections.reverseOrder()); //reverse
        q.offer("A");
        q.offer("B");
        q.offer("C");
        q.offer("D");
        q.offer("E");
        q.offer("G");

        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }

    }
}
