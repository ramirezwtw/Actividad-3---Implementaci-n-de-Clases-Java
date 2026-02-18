package com.example;

public class Book {
    private String id;
    private String title;
    private double price;
    private int stock;

    public Book() {
        this.id = "N/A";
        this.title = "Unknown";
        this.price = 0.0;
        this.stock = 0;
    }

    public Book(String id, String title, double price, int stock) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.stock = stock;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    public void setId(String id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setPrice(double price) {
        if (price >= 0) this.price = price;
        else System.out.println("Error: Precio negativo.");
    }
    public void setStock(int stock) {
        if (stock >= 0) this.stock = stock;
        else System.out.println("Error: Stock negativo.");
    }

    @Override
    public String toString() {
        return "Book [ID: " + id + ", Title: " + title + ", Price: " + price + ", Stock: " + stock + "]";
    }
}