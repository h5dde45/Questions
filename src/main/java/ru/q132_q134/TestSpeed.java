package ru.q132_q134;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestSpeed {

    private static final int COUNT = 1_000_000;
    private List<Integer> arrayList = new ArrayList<>();
    private List<Integer> linkedList = new LinkedList<>();
    private List<Integer> vector = new Vector<>();

    public static void main(String[] args) {

        TestSpeed speed = new TestSpeed();

        speed.testFillList(speed.arrayList);
        speed.testFillList(speed.linkedList);
        speed.testFillList(speed.vector);
        System.out.println("============================");

        speed.testGetOfIndex(speed.arrayList);
        speed.testGetOfIndex(speed.linkedList);
        speed.testGetOfIndex(speed.vector);
        System.out.println("============================");

        speed.testGetOfValue(speed.arrayList);
        speed.testGetOfValue(speed.linkedList);
        speed.testGetOfValue(speed.vector);
        System.out.println(speed.arrayList.size());
        System.out.println(speed.linkedList.size());
        System.out.println(speed.vector.size());
        System.out.println("============================");

        speed.testAddByIndex(speed.arrayList);
        speed.testAddByIndex(speed.linkedList);
        speed.testAddByIndex(speed.vector);
        System.out.println(speed.arrayList.size());
        System.out.println(speed.linkedList.size());
        System.out.println(speed.vector.size());
        System.out.println("============================");

        speed.testRemoveByIndex(speed.arrayList);
        speed.testRemoveByIndex(speed.linkedList);
        speed.testRemoveByIndex(speed.vector);
        System.out.println(speed.arrayList.size());
        System.out.println(speed.linkedList.size());
        System.out.println(speed.vector.size());
        System.out.println("============================");


    }

    private void testFillList(List list) {
        long start = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            list.add(i);
        }
        long result = System.nanoTime() - start;
        System.out.println(String.format("%9.8f", (double) result / 1000_000_000));
    }

    private void testGetOfIndex(List list) {
        long start = System.nanoTime();
        list.get(COUNT / 2);
        long result = System.nanoTime() - start;
        System.out.println(String.format("%9.8f", (double) result / 1000_000_000));
    }

    private void testGetOfValue(List list) {
        long start = System.nanoTime();
        list.contains(COUNT / 2);
        long result = System.nanoTime() - start;
        System.out.println(String.format("%9.8f", (double) result / 1000_000_000));
    }

    private void testAddByIndex(List list) {
        long start = System.nanoTime();
        list.add(COUNT / 2,22);
        long result = System.nanoTime() - start;
        System.out.println(String.format("%9.8f", (double) result / 1000_000_000));
    }

    private void testRemoveByIndex(List list) {
        long start = System.nanoTime();
        list.remove(COUNT / 2);
        long result = System.nanoTime() - start;
        System.out.println(String.format("%9.8f", (double) result / 1000_000_000));
    }


}
