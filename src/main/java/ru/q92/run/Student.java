package ru.q92.run;

import java.util.ArrayList;

public class Student implements Cloneable {
    private int id=100;
    private String name;
    private int age;
    private ArrayList<Byte> markList=new ArrayList<>();

    public ArrayList<Byte> getMarkList() {
        return markList;
    }

    @Override
    public Student clone(){
        Student copy=null;

        try {
            copy=(Student)super.clone();
            copy.markList=(ArrayList<Byte>)markList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return copy;
    }
}
