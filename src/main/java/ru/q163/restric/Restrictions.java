package ru.q163.restric;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Restrictions {
    public static void main(String[] args) {

//        Gen<int> i; - только ссылочные типы

        Gen<Integer> gint=new Gen<>(23);
        Gen<LocalDate> dateGen=new Gen<>(LocalDate.now());

        List<String> is=new ArrayList<>(); // в интерфейсах



    }
}
