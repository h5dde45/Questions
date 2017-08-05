package ru.q163.ext;

public class Exam<T extends Number> {

    private T mark;
    private String name;

    public Exam(T mark, String name) {
        this.mark = mark;
        this.name = name;
    }

    public T getMark() {
        return mark;
    }

    private int roundMark(){
        return Math.round(mark.floatValue());
    }

//    public boolean equalsToMark(Exam<T> obj){
//        return roundMark()==obj.roundMark();
//    }

    public boolean equalsToMark(Exam<?> obj){
        return roundMark()==obj.roundMark();
    }
}
