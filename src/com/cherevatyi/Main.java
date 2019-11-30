package com.cherevatyi;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println(stack.empty());
        stack.push(55);
        stack.push(0);
        System.out.println(stack.empty());
        System.out.println(stack.peek());
        for (Integer n: stack) System.out.println(n);
        Integer num = stack.pop();
        System.out.println(num);
    }
}
