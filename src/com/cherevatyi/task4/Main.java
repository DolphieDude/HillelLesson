package com.cherevatyi.task4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();
        hm.put("And", 99);
        hm.put("triple FIVE", 555);
        hm.forEach( (key, value) -> System.out.println(String.format("%s got %s", key, value)));
    }
}
