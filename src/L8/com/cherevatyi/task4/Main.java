package L8.com.cherevatyi.task4;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String first;
        try (BufferedReader input = new BufferedReader(new FileReader("C:\\txt\\text.txt"))) {
            first = input.readLine();
            System.out.println(first);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("FInnnallly");
        }
    }
}
