package com.cherevatyi.task2;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<String>();
        queue.add("AMA FIRST");
        queue.add("second one(");
        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue.offer("AMA FIRST"));
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.peek());

    }
}
