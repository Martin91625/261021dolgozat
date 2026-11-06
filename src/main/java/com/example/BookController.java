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
