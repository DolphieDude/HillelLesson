package L8.com.cherevatyi.task5;

public class InvalidUserName extends Exception {
    String username;

    public InvalidUserName (String usernameIn) { this.username = usernameIn; }
}
