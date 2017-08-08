package ru.q185_q187;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {
    public static void main(String[] args) {
        String[] arr = {"one", "two", "3"};

        File fByte = new File("byte");
        File fSymb = new File("symbol");
        try (
                FileOutputStream fos = new FileOutputStream(fByte);
                FileWriter fw = new FileWriter(fSymb);
        ) {
            for (String s : arr) {
                fos.write(s.getBytes());
                fw.write(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
