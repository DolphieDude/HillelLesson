package L8.com.cherevatyi.task5;

class InvalidUserNameException extends Exception {
    private String username;

    public InvalidUserNameException(String usernameIn) {
        super("Username is invalid");
        this.username = usernameIn;
    }
}
