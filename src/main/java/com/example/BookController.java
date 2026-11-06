/*
* File: BookController.java
* Author: El Miri Martin
* Copyright: 2026, El Miri Martin
* Group: Szoft II/N
* Date: 2026-11-06
* Github: https://github.com/Martin91625
* Licenc: MIT
*/

package com.example;

import java.util.List;

public class BookController {
    
    BookService bookService;
    BookView bookView;

    public BookController(BookService bookService, BookView bookView) {
        this.bookService = bookService;
        this.bookView = bookView;
        initTable();
    }

    private void initTable() {
        List<Book> bookList = bookService.getBooks();
        bookView.printBooks(bookList);
    }

}
