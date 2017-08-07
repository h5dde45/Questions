package ru.q92.run;

public class Runner {
    public static void main(String[] args) {
        Student st=new Student();
        System.out.println(st);
        System.out.println("======================");
        Student stc=st.clone();
        System.out.println(stc);
        System.out.println("======================");

        System.out.println(st.getMarkList()==stc.getMarkList());
        System.out.println(st.getMarkList().equals(stc.getMarkList()));
    }
}
