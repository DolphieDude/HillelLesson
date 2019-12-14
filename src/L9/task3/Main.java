package L9.task3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        System.out.println("It's me, Main");
        MyThread thread1 = new MyThread();
        thread1.time = 1000;
        thread1.start();
        thread.join();
        System.out.println("It's me, Main");
        thread1.join();
        System.out.println("It's me, Main");
    }

}
