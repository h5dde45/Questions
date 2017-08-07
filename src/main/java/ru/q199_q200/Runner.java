package ru.q199_q200;

import java.io.InvalidObjectException;

public class Runner {
    public static void main(String[] args) {
        Student student = new Student("facultY", "IvIv", 123, "asd");
        System.out.println(student + "\n===================");

        String file = "C:\\Users\\н\\Desktop\\demo.data";
        Serializator sz = new Serializator();
        boolean b=sz.serialization(student,file);
        System.out.println(b + "\n===================");

        Student.faculty="SSS";
        System.out.println(student + "\n===================");

        Student rez=null;
        try {
            rez=sz.deserialization(file);
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
        System.out.println(rez + "\n===================");

    }
}
