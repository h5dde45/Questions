package ru.q181_q184;

public class InternAndCompare {
    public static void main(String[] args) {
        String sPool="java..."; //пулл
        String str=new String("java..."); // объект
        StringBuffer sbf=new StringBuffer("java...");
        StringBuilder sbld= new StringBuilder("java...");

        System.out.println(sPool==str); // по ссылке
        str=str.intern(); //ссылка на пулл
        System.out.println(sPool==str);
        System.out.println("++++++++++++++++++");
        System.out.println("++++++++++++++++++");

        System.out.println(str.equals(sbf));
        System.out.println(str.equals(sbf.toString()));
        System.out.println(sbf.equals(sbld)); //по ссылке в StringBuffer и StringBuilder equals не переопределен
        System.out.println(sbf.toString().equals(sbld.toString()));
        System.out.println(str.contentEquals(sbf));

    }
}
