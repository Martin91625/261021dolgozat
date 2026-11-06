package com.example;

import java.util.List;

public class BookView {
    
    public void printBooks(List<Book> bookList) {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf(
            "%-3s | %-30s | %-30s | %-5s\n",
            "Id", "Cím", "Szerző ", "Év"
        );
        System.out.println("-----------------------------------------------------------------------------------");

        bookList.forEach(book -> {
            System.out.printf(
                "%-3d | %-30s | %-30s | %-5d \n",
                book.getId(), book.getTitle(), book.getAuthor(), book.getYear()
            );
        });
    }
}
