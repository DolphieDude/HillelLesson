package com.cherevatyi.task3;

import java.util.Date;

public class Order implements Comparable<Order> {
    //<b>static</b> vars
    private static int ORDER_COUNT;

    //variables
    private Integer quantity, number;
    private String name;
    private Double price, discount;
    private Date date;

    //constructors. Default one is <b>private</b>
    private Order() { }
    Order(Integer quantity, String name, Double price, Double discount) {
        ORDER_COUNT++;
        this.number = ORDER_COUNT;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.date = new Date();
    }

    //overriden methods
    @Override
    public int compareTo (Order o) { return 0; }

    //<b>only<//b> getters
    int getNumber () { return number; }
    Integer getQuantity() { return quantity; }
    String getName() { return name; }
    Double getPrice() { return price; }
    Double getDiscount() { return discount; }
    Date getDate() { return date; }
}
