package ru.q163.simple;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class SimpleExample {
    public static void main(String[] args) {
        Gener<Integer> iObj;
//        NonGener<int> iObj; - ошибка(приметивный тип)
        Gener<String> sObj;
        Gener<LocalDate> dObj;

        iObj = new Gener<>(333);
        sObj = new Gener<>("qwerty");
        dObj = new Gener<>(LocalDate.now());

        iObj.showType();
        int i=iObj.getObj();
        System.out.println(i);

        sObj.showType();
        String s=sObj.getObj();
        System.out.println(s);

        dObj.showType();
        LocalDate l=dObj.getObj();
        System.out.println(l);

        Map<String,String> map=new HashMap<>();
        map.put("123","text");
        System.out.println(map);

    }
}
