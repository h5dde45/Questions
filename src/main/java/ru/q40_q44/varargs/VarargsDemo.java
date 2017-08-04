package ru.q40_q44.varargs;

public class VarargsDemo {

    static void fly(int... ints) {
        System.out.println(ints.length);
    }

    static void fly(String s,int... ints) {
        System.out.println(ints.length);
    }

    public static void main(String... args) {
        fly(1,2,3);
        fly("hello",1,2,3,4,5);
        fly(new int[]{1,2,3,4,5,6,7,8,9,10});
        fly();
    }

}
