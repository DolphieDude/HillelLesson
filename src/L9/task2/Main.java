package L9.task2;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread thread = new Thread(printer);
        thread.start();
        System.out.println("Thread started");
        System.out.println("Thread ended");
    }
}
