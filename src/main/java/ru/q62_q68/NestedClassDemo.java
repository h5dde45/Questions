package ru.q62_q68;

public class NestedClassDemo {

    public static void main(String[] args) {
        OuterN.Nested.displayStat();
        System.out.println("===========");
        OuterN.Nested nested = new OuterN.Nested();
        nested.display();
    }
}

class OuterN {
    int outer_var = 100;
    static int outer_stat_var = 150;

    static class Nested {

        void display() {
            OuterN outerN = new OuterN();
            System.out.println(outerN.outer_var);
            System.out.println(outer_stat_var);
        }

        static void displayStat() {
            System.out.println("disp stat");
        }
    }
}
