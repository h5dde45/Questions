package ru.q336.simple;

import java.util.Arrays;

public class SimpleDemo {
    public static void main(String[] args) {
        Dog dog;
        dog = Dog.BOXER;
        System.out.println(dog);
        dog = Dog.LABRADOR;
        System.out.println(dog);

        switch (dog) {
            case BOXER:
                System.out.println("====");
                break;
            case LABRADOR:
                System.out.println("++++++++++");
                break;
            default:
                System.out.println("---------------");
        }

        Dog[] dogs=Dog.values();
        System.out.println(Arrays.toString(dogs));

        Dog box=Dog.valueOf("BOXER");
        System.out.println(box);

        System.out.println(Dog.class.getSuperclass());


    }
}
