package L8.com.cherevatyi.task3;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        first();
    }
    private static void first () {
        try {
            second();
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
    private static void second () throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(null));
        String in = input.readLine();
    }
}
