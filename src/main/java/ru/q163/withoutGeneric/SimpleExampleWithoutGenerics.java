package ru.q163.withoutGeneric;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class SimpleExampleWithoutGenerics {
    public static void main(String[] args) {
        NonGener iObj;
        NonGener sObj;
        NonGener dObj;

        iObj = new NonGener(333);
        sObj = new NonGener("qwerty");
        dObj = new NonGener(LocalDate.now());

        iObj.showType();
        int i=(int)iObj.getObj();
        System.out.println(i);

        sObj.showType();
        String s= (String) sObj.getObj();
        System.out.println(s);

        dObj.showType();
        LocalDate l= (LocalDate) dObj.getObj();
        System.out.println(l);

        Map<String,String> map=new HashMap<>();
        map.put("123","text");
        System.out.println(map);

    }
}
