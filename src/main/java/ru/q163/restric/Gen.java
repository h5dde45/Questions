package ru.q163.restric;

public class Gen<T> {
    T obj;

    public Gen(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    void showObj() {
        System.out.println("=> " + obj.getClass().getName());
    }

    static void printSmth(){
        System.out.println("++++++++++++++");
    }
}