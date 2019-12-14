package L9.task5;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

public class Clock implements Callable<Integer> {
    private int i = 0;

    @Override
    public Integer call() throws Exception {
        try {
            Thread thread = Thread.currentThread();
            while (!thread.isInterrupted()) {
                try {
                    Thread.sleep(500);
                    System.out.println("Tik Thread: " + thread.getName());
                    Thread.sleep(500);
                    System.out.println("Tak Thread: " + thread.getName());
                } catch (InterruptedException e) {
                }
                this.i++;
            }
        }
        catch (Exception e) {
        }
        return i;
    }
}
