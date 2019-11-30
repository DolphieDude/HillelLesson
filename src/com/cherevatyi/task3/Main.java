package com.cherevatyi.task3;

import java.io.*;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        String name;
        int quantity;
        double price, discount;
        PriorityQueue<Order> ordersQueue = new PriorityQueue<Order>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter orders");
        while(true) {
            System.out.print("Enter name of your order or stop: ");
            name = input.readLine();
            if (name.equals("stop")) break;
            System.out.print("Enter needed quantity: ");
            quantity = Integer.parseInt(input.readLine());
            System.out.print("Enter needed price: ");
            price = Double.parseDouble(input.readLine());
            System.out.print("Enter discount(0 if none): ");
            discount = Double.parseDouble(input.readLine());
            ordersQueue.add(new Order(quantity, name, price, discount));
        }
        Order doOrder;
        while(!ordersQueue.isEmpty()) {
            doOrder = ordersQueue.remove();
            System.out.println("Order #" + doOrder.getNumber());
            System.out.println("Send/Do \"" + doOrder.getName() + "\" in quantity of " + doOrder.getQuantity());
            System.out.println("Need to pay " + (doOrder.getPrice() * doOrder.getQuantity() - doOrder.getDiscount() * doOrder.getQuantity()));
            System.out.println(doOrder.getDate());
        }
    }
}
