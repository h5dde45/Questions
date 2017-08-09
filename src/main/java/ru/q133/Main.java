package ru.q133;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] strings=new String[11];
        strings[2]="d";
        strings[0]= String.valueOf(2);
        strings[3]=null;

        System.out.println(strings);
        System.out.println(Arrays.toString(strings));
        for (String s:strings){
            System.out.print(s+" ");
        }
        System.out.println();
        for(int i=0;i<strings.length;i++){
            System.out.print(strings[i]+" ");
        }
        System.out.println();
        int i=0;
        while (i<strings.length){
            System.out.print(strings[i]+" ");
            i++;
        }
        System.out.println();
        System.out.println("=====================");

        int[] ints=new int[11];
//        ints[1]= Integer.parseInt(null);

        List list=new ArrayList();
        list.add("aw");
        list.add(33);
        list.add(new Date());

        System.out.println(list);

        List<String> list1=new ArrayList<>();
        list1.add("aw");
        list1.add(String.valueOf(33));
        list1.add(String.valueOf(new Date()));

        System.out.println(list1);
        Iterator<String> itr=list1.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
            itr.remove();
        }
        System.out.println();
        System.out.println(list1.size());
        System.out.println(list.size());
        System.out.println(strings.length);


        System.out.println();

        String strings1="tdh eiguu";
        System.out.println(strings1.length());
        System.out.println(strings1.charAt(2));
    }
}
