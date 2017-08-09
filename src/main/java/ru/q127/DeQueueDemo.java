package ru.q127;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueueDemo {
    public static void main(String[] args) {
        Deque<String> strings = new ArrayDeque<>();
        strings.add("1i");
        strings.add("2i");
        System.out.println(strings.add("3i"));
        System.out.println(strings.offer("4i"));

        System.out.println(strings);

        strings.addFirst("first");
        strings.addLast("last");
        System.out.println(strings);
        strings.push("push1");
        strings.push("push2");
        System.out.println(strings);
        strings.pop();
        System.out.println(strings);

    }
}
