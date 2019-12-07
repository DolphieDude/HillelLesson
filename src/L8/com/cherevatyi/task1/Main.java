package L8.com.cherevatyi.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        first();
    }
    public static void first () {
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        second();
    }
    public static void second () {
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        third();
    }
    public static void third () {
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        fourth();
    }
    public static void fourth () {
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
    }
}
