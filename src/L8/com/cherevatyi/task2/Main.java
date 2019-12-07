package L8.com.cherevatyi.task2;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Throw");
            exceptionThrower();
            System.out.println("FeelsBad");
        }
        catch (Exception e) {
            System.out.println("HA! Caught");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    private static void exceptionThrower () {
        System.out.println("Before 0");
        int nothing = 1 / 0;
        System.out.println("After 0");
    }
}
