package ru.q181_q184;

public class SbfSbdDemo {
    public static void main(String[] args) {

        StringBuffer sbf=new StringBuffer();
        System.out.println("Length - "+sbf.length());
        System.out.println("Size - "+sbf.capacity());
        sbf=new StringBuffer(20);
        sbf.append("java");
        System.out.println(sbf);
        System.out.println("Length - "+sbf.length());
        System.out.println("Size - "+sbf.capacity());

        sbf.append(" is a programming language.");
        System.out.println(sbf);
        System.out.println("Length - "+sbf.length());
        System.out.println("Size - "+sbf.capacity());
        System.out.println("========================");
        System.out.println("========================");

        System.out.println(sbf);
        StringBuffer sbf1=new StringBuffer(48);
        sbf1.append("java is a programming language.");
        System.out.println(sbf1);

        System.out.println(sbf.equals(sbf1)); //equals не переопределен, сравн по ссылке
        System.out.println(sbf.hashCode()==sbf1.hashCode()); //разные объекты
        System.out.println(sbf.toString().contentEquals(sbf1));
        System.out.println("========================");
        System.out.println("========================");

        StringBuilder a=new StringBuilder("abc");
        StringBuilder b=a.append("de");
        b=b.append("f").append("g");
        System.out.println("a="+a);
        System.out.println("b="+b);

    }
}
