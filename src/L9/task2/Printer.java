package L9.task2;

public class Printer implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello, I'm Printer");
//        try {
//            Thread.currentThread().sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("Printer finished");
    }
}