package ru.q40_q44.typeСonversion;

public class Cat extends Animal {
    void doCat1() { }
    void doCat2() { }

    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.doCat1();
        cat.doAnimal1();

        Animal catA=new Cat();//восходящее преобразование неявное
//        catA.doCat1();
        catA.doAnimal1();

        //нисходящее преобразование явное
        int i=33;
        byte b= (byte) i;
    }
}
