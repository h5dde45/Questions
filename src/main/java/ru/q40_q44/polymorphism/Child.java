package ru.q40_q44.polymorphism;

public class Child extends Parent {
    @Override
    public void test() {
        System.out.println("... from child");
    }

    public void testSup(){
        super.test();
    }

    public static void main(String[] args) {
        Child child=new Child();
        child.test();

        Parent parent=new Parent();
        parent.test();

        parent=child;
        parent.test();

        child.testSup();

    }
}
