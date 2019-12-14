package L9.task4;

public class Clock implements Runnable {
    int i = 0;

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        while (!thread.interrupted()) {
            try {
                Thread.sleep(500);
                System.out.println("Tik");
                Thread.sleep(500);
                System.out.println("Tak");
            }
            catch (InterruptedException e) {
                return;
            }
            this.i++;
        }
    }
}
