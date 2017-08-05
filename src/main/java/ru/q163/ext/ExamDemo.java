package ru.q163.ext;

public class ExamDemo {
    public static void main(String[] args) {
        Exam<Double> md1=new Exam<>(22.93,"Math");
        Exam<Double> md2=new Exam<>(22.53,"Math");

        System.out.println(md1.equalsToMark(md2));

        Exam<Integer> mi=new Exam<>(23,"ttt");
        System.out.println(mi.equalsToMark(md2));

    }
}
