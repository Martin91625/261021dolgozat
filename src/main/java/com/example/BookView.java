/*
* File: BookView.java
* Author: El Miri Martin
* Copyright: 2026, El Miri Martin
* Group: Szoft II/N
* Date: 2026-11-06
* Github: https://github.com/Martin91625
* Licenc: MIT
*/

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
