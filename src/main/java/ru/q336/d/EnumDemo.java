package ru.q336.d;

public class EnumDemo {
    public static void main(String[] args) {
        Dog1 dog1;
        System.out.println(Dog1.BOXER.getWeigth());
        System.out.println("++++=>");
        for(Dog1 dog11:Dog1.values()){
            System.out.println(dog11+" = "+dog11.getWeigth());
        }
    }
}
