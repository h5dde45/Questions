package ru.q163.withoutGeneric;

public class NonGener {
    private Object obj;

    public NonGener(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }
    void showType(){
        System.out.println("Type T is "+obj.getClass().getName());
    }
}
