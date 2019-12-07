package L8.com.cherevatyi.task6;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Date date = new Date();
        Thread.sleep(1000);
        Date date2 = new Date();
        if (date.compareTo(date2) < 0) {
            System.out.println("date2 is later");
        }
        else {
            System.out.println("date is later```````````````````````````````");
        }
    }
}
