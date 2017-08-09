package ru.q128;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map=new TreeMap<>();
        map.put("perv",23);
        map.put("vtor",56);
        map.put("tret",44);

        System.out.println(map);
        System.out.println(map.put("vtor",98));
        System.out.println(map);

        Set<Map.Entry<String,Integer>> set=map.entrySet();
        for(Map.Entry<String,Integer> entry:set){
            System.out.print(entry.getKey()+" = ");
            System.out.println(entry.getValue());
        }

    }
}
