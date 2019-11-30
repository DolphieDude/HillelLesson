package com.cherevatyi.task3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) throws InterruptedException {
        Set<Order> set = new TreeSet<>();
        set.add(new Order(1233221, "fdsfs", 123132.0, 324.0));
        set.add(new Order(12312321, "dsfss", 123132.0, 324.0));
        set.add(new Order(12342321, "gsgfsgfsesfs", 123132.0, 324.0));
        Thread.sleep(1000);
        set.add(new Order(12321, "fdfbsudb82346236477sfs", 123132.0, 324.0));
        for (Order o : set) System.out.println(o);
    }
}
