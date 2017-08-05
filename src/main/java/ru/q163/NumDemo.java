package ru.q163;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class NumDemo {
    public static void main(String[] args) {

        List<Number> list=new ArrayList<>();
        list.add((byte)25); //подтип
        list.add((short)235); //подтип
        list.add(1_900_000_000); //подтип int
        list.add(2_900_000_000L); //подтип long
        list.add((float)3.12); //подтип
        list.add(3.142); //подтип double
        list.add(new BigInteger("1234444556677")); //подтип
        list.add(new BigDecimal("2.3e309")); //подтип

        for(Number number:list){
            System.out.println(number);
        }



    }
}
