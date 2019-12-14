package L9.task3;

public class MyThread extends Thread {
    public long time = 500L;

    @Override
    public void run() {
         int i = 0;
         while (i < 5) {
             try {
                 this.sleep(time);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             System.out.println(this.getName() + ": i = " + i);
             i++;
         }
    }
}
