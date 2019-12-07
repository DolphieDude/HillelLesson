package L8.com.cherevatyi.task9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        TimeZone timeZone = calendar.getTimeZone();
        System.out.println(timeZone.getOffset(new Date().getTime()));
        System.out.println(timeZone.getID());
    }
}
