package ru.q336.d1;

public class EnumDemo1 {
    public static void main(String[] args) {
        DayOfWeek d1,d2,d3;

        for(DayOfWeek week:DayOfWeek.values()){
            System.out.println(week+" = "+week.ordinal());
        }

        d1=DayOfWeek.MONDAY;
        d2=DayOfWeek.FRIDAY;
        d3=DayOfWeek.MONDAY;

        int i;
        if((i=d1.compareTo(d2))<0){
            System.out.println(i);
            System.out.println(d1+" before "+d2);
        }
        if((i=d1.compareTo(d3))==0){
            System.out.println(i);
            System.out.println(d1+" equals "+d3);
        }
        System.out.println("++++++++++++++++++++++");

        boolean b;
        if(b=d1.equals(d2)){
            System.out.println(b);
            System.out.println(d1+" no equals "+d2);
        }
        if(b=d1.equals(d3)){
            System.out.println(b);
            System.out.println(d1+" equals "+d3);
        }
        if(d1==d3){
            System.out.println(b);
            System.out.println(d1+" == "+d3);
        }
    }
}
