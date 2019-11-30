package com.cherevatyi.task3;

import java.util.Date;
import java.util.Objects;

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
    public Order(Integer quantity, String name, Double price, Double discount) {
        ORDER_COUNT++;
        this.number = ORDER_COUNT;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.date = new Date();
    }

//    System.out.println("Send/Do \"" + doOrder.getName() + "\" in quantity of " + doOrder.getQuantity());
//            System.out.println("Need to pay " + (doOrder.getPrice() * doOrder.getQuantity() - doOrder.getDiscount() * doOrder.getQuantity()));
//            System.out.println(doOrder.getDate());
    //overriden methods
    @Override
    public int compareTo (Order o) {
        if (this.quantity > o.getQuantity()) return 1;
        else if (this.quantity < o.getQuantity()) return -1;
        else return 0;
//        if (this.quantity >= o.getQuantity()) return this.quantity;
//        else return o.getQuantity();
    }
    @Override
    public String toString () {
        return new StringBuilder("Order #").append(this.number).append("\n")
                .append("Send/Do \"").append(this.name).append("\" in quantity of ").append(this.quantity).append("\n")
                .append("Need to pay ").append(this.price * this.quantity - this.discount * this.quantity).append("\n")
                .append(this.date).append("\n").toString();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return this.number.equals(order.number);
    }
    @Override
    public int hashCode() { return Objects.hash(this.number); }

    //<b>only<//b> getters
    int getNumber () { return number; }
    Integer getQuantity() { return quantity; }
    String getName() { return name; }
    Double getPrice() { return price; }
    Double getDiscount() { return discount; }
    Date getDate() { return date; }
}
