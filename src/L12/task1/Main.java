package L12.task1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat("Felix", 2, 30, 23232);
        writeObject(cat);
        Cat cat1 = readObject();
        System.out.println(cat1);
    }

    private static <T extends Serializable> void writeObject(T o) {
        try (FileOutputStream outputStream = new FileOutputStream("object.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            objectOutputStream.writeObject(o);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Saved");
    }

    @SuppressWarnings("unchecked")
    private static <T extends Serializable> T readObject() {
        try (FileInputStream inputStream = new FileInputStream("object.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            return (T)objectInputStream.readObject();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
