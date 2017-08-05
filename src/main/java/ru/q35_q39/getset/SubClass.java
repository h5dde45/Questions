package ru.q35_q39.getset;

public class SubClass extends GetSetDemo {
    public static void main(String[] args) {

        SubClass child=new SubClass();
        child.protPrint();
        statPrint();

        GetSetDemo parent=new GetSetDemo("444");
        System.out.println(parent.getName());
        parent.setName("=========");
        System.out.println(parent.getName());
    }
}
