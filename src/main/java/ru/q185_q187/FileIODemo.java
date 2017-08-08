package ru.q185_q187;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIODemo {
    public static void main(String[] args) {
        String fPath = "C:/java_projects/july2017/28_07_17/in";
        String fResult = "result.txt";

        try(    FileInputStream fis = new FileInputStream(fPath);
                FileOutputStream fos = new FileOutputStream(fResult); ) {

            int s = fis.read();
            while (s != -1) {
                fos.write(s);
                s = fis.read();
            }
//            fis.close();
//            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
