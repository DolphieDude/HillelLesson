package L8.com.cherevatyi.task7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Date date;
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar);
        calendar.add(Calendar.MONTH, 2);
        date = calendar.getTime();
        System.out.println(date);
        calendar.roll(Calendar.MONTH, 13);
        date = calendar.getTime();
        System.out.println(date);

    }
}
