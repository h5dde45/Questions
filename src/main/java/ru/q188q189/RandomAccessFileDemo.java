package ru.q188q189;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

    public static void main(String[] args) {
        String fpath="text";

        try (   RandomAccessFile fileR=new RandomAccessFile(fpath,"r");
                RandomAccessFile fileRW=new RandomAccessFile(fpath,"rw");
                RandomAccessFile fileRW1=new RandomAccessFile("text1.txt","rw");
                ){

            String tmp="";
            while ((tmp=fileR.readLine())!=null){
                System.out.println(tmp);
            }
            System.out.println();

            fileR.seek(3);
            byte[] bytes=new byte[12];
            fileR.read(bytes);
            System.out.println(new String(bytes));
            System.out.println();

            fileRW.seek(3);
            fileRW.write("+ +++".getBytes());

            fileRW1.seek(5);
            fileRW1.write(",mdh;fl".getBytes());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
