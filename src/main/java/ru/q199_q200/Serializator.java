package ru.q199_q200;


import java.io.*;

public class Serializator {

    public boolean serialization(Student st, String filename) {
        boolean flag = false;
        File file = new File(filename);

        try (
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            oos.writeObject(st);
            flag=true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public Student deserialization(String filename) throws InvalidObjectException {
        File file = new File(filename);

        try (
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            Student st=(Student) ois.readObject();
            return st;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        throw new InvalidObjectException(("Objet not deserialized"));
    }

}
