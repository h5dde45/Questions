package ru.q62_q68;

public class AnonymousDemoClass {
    public static void main(String[] args) {
        new Thread((new Runnable() {
            @Override
            public void run() {
                System.out.println("==========");
            }
        })).start();
    }
}
