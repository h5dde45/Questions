package ru.q185_q187;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String name;
        double weigth;
        int heigth;
        double delta;
        String action="gdh";

        System.out.println(">> ");
        name=scanner.nextLine();
        System.out.println(">> ");
        weigth=scanner.nextDouble();
        System.out.println(">> ");
        heigth=scanner.nextInt();

        delta=heigth-weigth;

        System.out.println(name);
        System.out.println(weigth);
        System.out.println(heigth);
        System.out.println(delta);
        System.out.println(action);


    }

}
