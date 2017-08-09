package ru.q131;

import java.util.*;

public class DifListSet {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Set<String> set=new LinkedHashSet<>();

        list.add("a");
        list.add("b");
        list.add(null);
        list.add(null);
        list.add(4,"ed");
        list.add(5,"ed");
        list.add(3,"ed");

        set.add("a");
        set.add("d");
        set.add(null);
        set.add(null);
        set.add("d");

        System.out.println(list);
        System.out.println(set);


    }
}
