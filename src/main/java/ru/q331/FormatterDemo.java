package ru.q331;

import java.util.Calendar;
import java.util.Formatter;

public class FormatterDemo {
    public static void main(String[] args) {
        Formatter formatter=new Formatter();

        formatter.format("This %s, %s, %n%S","+++","-----","ноВЫй");
        System.out.println(formatter+"\n=================================");

        formatter=new Formatter();
        formatter.format("hex: %h octal: %o %n hex: %1$#x, octal: %2$#o",100021,100021);
        System.out.println(formatter+"\n=================================");

        Calendar calendar=Calendar.getInstance();
        formatter=new Formatter();
        formatter.format("%1$tr, %n %1$tH:%1$tM, %1$tB %1$tb %1$tm",calendar);
        System.out.println(formatter+"\n=================================");
    }
}
