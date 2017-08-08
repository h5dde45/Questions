package ru.q185_q187;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDemo {
    public static void main(String[] args) {
        String fPath = "in";
        int i;

        File file = new File(fPath);
        FileReader fileReader=null;

        try {
            fileReader=new FileReader(file);
            while ((i=fileReader.read())!=-1){
                System.out.print((char) i);
                Thread.sleep(150);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            if(fileReader!=null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
