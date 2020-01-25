package JUnit;

public class Counter {
    public static int COUNT = 1;

    public static void refresh() {
        COUNT = 0;
    }

    public static void increment() {
        COUNT++;
    }
}
