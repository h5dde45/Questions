package ru.q80;

import java.lang.reflect.Field;

public class ReflClass {
    public static void main(String[] args) {
        final Class<?> cls=TestClass.class;

        try {
        TestClass testClass = new TestClass();

            Field field=cls.getDeclaredField("iPriv");
            field.setAccessible(true);
            System.out.println(field.getInt(testClass));
            field.setInt(testClass,150);
            System.out.println(field.getInt(testClass));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}
