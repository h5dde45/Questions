package ru.q163.simple;

public class Gener<T> {
    private T obj;

    public Gener(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
    void showType(){
        System.out.println("Type T is "+obj.getClass().getName());
    }
}
