package CTDL_GT;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        // queue = FIFO data structure. first in first out
        // A collection designed for holding elements prior ro processing
        // linear data structure

        // add = enqueue, offer()
        // remove = dequeue, poll()

        Queue<String> q = new LinkedList<String>();

        // System.out.println(q.isEmpty());

        q.offer("Tung");
        q.offer("Luong");
        q.offer("Duong");
        q.offer("Nhan");

        // System.out.println(q.isEmpty());
        // System.out.println(q.size());
        // System.out.println(q.contains("Nhan")); // return true

        // System.out.println(q.peek()); // return a object you offer first
        // System.out.println(q.poll() + ", " + q.poll()); // poll it's similar pop
        // stack, but it's remove object first you
        // offer

        System.out.println(q);

    }
}
