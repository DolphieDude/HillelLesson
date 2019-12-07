package L8.com.cherevatyi.task8;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Date date;
        SimpleDateFormat format = new SimpleDateFormat("EEEE, d MMMM yyyy");
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar);
        calendar.add(Calendar.MONTH, 2);
        date = calendar.getTime();
        System.out.println(date);
        calendar.roll(Calendar.MONTH, 13);
        date = calendar.getTime();
        System.out.println(date);
        System.out.println(format.format(calendar.getTime()));
    }
}
