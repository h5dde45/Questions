package ru.q336.d2;

public class EnumDemo2 {
    public static void main(String[] args) {
        for (Day day:Day.values()){
            day.run();
        }
    }
}
