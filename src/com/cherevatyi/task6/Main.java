package com.cherevatyi.task6;

import com.cherevatyi.task3.Order;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order (12313, "adsad", 123132.0, 213.0);
        doSomething(order1);
        doSomething(12312);
    }

    public static <T> void doSomething (T arg) {
        System.out.println(arg);
        if (arg instanceof Integer) System.out.println("hello");
    }
}
