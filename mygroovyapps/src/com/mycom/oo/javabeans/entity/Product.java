package com.mycom.oo.javabeans.entity;

public class Product {
    //data - instance variables
    private int id;
    private String productName;
    private double price;
    private int qty;
    private boolean inStock;

    //constructor is special method through which you can initalize the data
    public Product(int id, String productName, double price, int qty, boolean inStock) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.qty = qty;
        this.inStock = inStock;
    }
    //


    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }


    //setters and getters


}
