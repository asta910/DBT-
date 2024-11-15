package com.demo.bean;

public class Product {
    private int pid;
    private String pName;
    private int quantity;
    private int price;
    private double discount;
    private String description;

    public Product(int pid, String pName, int quantity, int price, double discount, String description) {
        this.pid = pid;
        this.pName = pName;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
        this.description = description;
    }

    public Product() {}
}
