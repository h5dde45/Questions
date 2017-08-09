package ru.q126;

import java.util.HashSet;
import java.util.Set;

public class ExampleSet {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();

        set.add("a");
        set.add("d");
        set.add("r");

        System.out.println(set);
        System.out.println(set.add("c"));
        System.out.println(set.contains("d"));
        System.out.println(set);
        System.out.println(set.isEmpty());

        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());

    }
}
