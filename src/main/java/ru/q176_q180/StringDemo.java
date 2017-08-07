package ru.q176_q180;

import java.util.Properties;

public class StringDemo {

    public static void main(String[] args) {
        String str="0123456789String12345StrING";
        System.out.println(str);
        System.out.println();

        System.out.println(str.substring(10));
        System.out.println(str.substring(10,16));
        System.out.println(str.indexOf("tr"));
        System.out.println(str.lastIndexOf("tr"));
        System.out.println();

        Properties prope=System.getProperties();
        System.out.println(prope);
        System.out.println();

        String[] strings=prope.toString().split(",");
        for(String s:strings){
            if(s.contains("version")||s.contains("os")) {
                System.out.println(s.trim());
            }
        }

        int i=1222;
        String s=String.valueOf(i);
        System.out.println(s);
        System.out.println();

        System.out.println(str.charAt(23));
        System.out.println(str.contains("45"));
        System.out.println(str.contains("43"));
        System.out.println(str.indexOf("89"));
        System.out.println(str.lastIndexOf("i"));
        System.out.println();
        System.out.println();




    }
}
