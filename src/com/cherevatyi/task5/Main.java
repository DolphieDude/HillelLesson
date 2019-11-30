package com.cherevatyi.task5;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("blabla");
        set.add("blabla");
        set.add("kuku");
        set.add("juju");
        set.add("hashset");
        for (String s: set) System.out.println(s);
        set.remove("juju");
        System.out.println(set.contains("kuku"));
        System.out.println(set.contains("juju"));
    }
}
