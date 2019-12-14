package L9.task4;

public class ClockManager {
    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread clockThread = new Thread(clock);
        clockThread.start();
        Thread.sleep(10000);
        clockThread.interrupt();
        System.out.println(clock.i);
    }
}
