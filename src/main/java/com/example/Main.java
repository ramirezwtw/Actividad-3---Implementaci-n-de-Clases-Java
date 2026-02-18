package com.example;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("B001", "Cien años de soledad", 25.50, 10);

        book1.setId("B002");
        book1.setTitle("Java Programming");
        book2.setStock(15);

        System.out.println("Título libro 1: " + book1.getTitle());
        System.out.println("Precio libro 2: " + book2.getPrice());

        System.out.println("\nResumen de libros:");
        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
}