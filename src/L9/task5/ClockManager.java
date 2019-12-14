package L9.task5;

import java.util.concurrent.*;

public class ClockManager {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Clock clock = new Clock(), clock1 = new Clock();
//        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(10);
//        Executor executor = new ThreadPoolExecutor(2, 2, 2000, TimeUnit.MILLISECONDS, queue);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> future = executor.submit(clock);
        Future<Integer> future1 = executor.submit(clock1);
        Thread.sleep(10000);
        future.cancel(true);
        future1.cancel(true);
        System.out.println(future.get());
        System.out.println(future1.get());
    }
}
