/*
* File: Main.java
* Author: El Miri Martin
* Copyright: 2026, El Miri Martin
* Group: Szoft II/N
* Date: 2026-11-06
* Github: https://github.com/Martin91625
* Licenc: MIT
*/

package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Könyvek");

        BookService bookService = new BookService(new Sqlite());
        BookView bookView = new BookView();
        new BookController(bookService, bookView);
    }
}