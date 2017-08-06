package ru.q336.d3;

public class EnumDemo3 {
    public static void main(String[] args) {
        for(Days days:Days.values()){
            System.out.println(days.shortname());
        }
    }
}
