package L9.task4;

public class Clock implements Runnable {
    boolean isCancel = true;
    int i = 0;

    void cancel() { this.isCancel = false; }

    @Override
    public void run() {
        while (this.isCancel) {
            try {
                Thread.sleep(500);
                System.out.println("Tik");
                Thread.sleep(500);
                System.out.println("Tak");
            }
            catch (InterruptedException e) { }
            this.i++;
        }
    }
}
