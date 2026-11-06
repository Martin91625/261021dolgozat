package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Könyvek");

        BookService bookService = new BookService(new Sqlite());
        BookView bookView = new BookView();
        new BookController(bookService, bookView);
    }
}