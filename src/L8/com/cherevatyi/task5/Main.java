package L8.com.cherevatyi.task5;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            String username = input.readLine();
            String password = input.readLine();
            authorize(username, password);
        } catch (IOException e) { e.printStackTrace(); }
        catch (InvalidUserNameException e) { System.out.println(e.getMessage()); }
    }

    private static void authorize (String username, String password) throws InvalidUserNameException {
        if (username.equals("hacker")) { throw new InvalidUserNameException(username); }
    }
}
