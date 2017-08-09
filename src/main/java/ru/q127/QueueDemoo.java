package ru.q127;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemoo {
    public static void main(String[] args) {
        Queue<String> strings=new PriorityQueue<>();
        strings.add("1i");
        strings.add("2i");
        System.out.println(strings.add("3i"));
        System.out.println(strings.offer("4i"));

        System.out.println(strings);
        System.out.println(strings.element());
        System.out.println(strings);
        System.out.println(strings.remove());
        System.out.println(strings);

    }
}
