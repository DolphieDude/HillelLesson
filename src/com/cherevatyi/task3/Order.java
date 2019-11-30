package com.cherevatyi.task3;

import java.util.Date;

public class Order {
    //<b>static</b> vars
    private static int ORDER_COUNT;

    //variables
    private Integer number, quantity, amount;
    private String name;
    private Double price, discount;
    private Date date;

    //constructors. Default one is <b>private</b>
    private Order() { }
    public Order(Integer quantity, Integer amount, String name, Double price, Double discount) {
        ORDER_COUNT++;
        this.quantity = quantity;
        this.amount = amount;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    //<b>only<//b> getters
    public Integer getNumber() { return number; }
    public Integer getQuantity() { return quantity; }
    public Integer getAmount() { return amount; }
    public String getName() { return name; }
    public Double getPrice() { return price; }
    public Double getDiscount() { return discount; }
    public Date getDate() { return date; }
}
