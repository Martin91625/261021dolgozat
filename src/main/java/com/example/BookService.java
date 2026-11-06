/*
* File: BookService.java
* Author: El Miri Martin
* Copyright: 2026, El Miri Martin
* Group: Szoft II/N
* Date: 2026-11-06
* Github: https://github.com/Martin91625
* Licenc: MIT
*/

package com.example;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookService {
    
    Database database;

    public BookService(Database database) {
        this.database = database;
    }

    public List<Book> getBooks() {
        try {
            return tryGetBooks();
        } catch (Exception e) {
            System.err.println("Hiba történt");
            e.getMessage();
            return null;
        }
    }

    private List<Book> tryGetBooks() throws SQLException{
        Connection connection = this.database.connect();
        String sql = "SELECT * FROM books";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        List<Book> bookList = new ArrayList<>();

        while(resultSet.next()) {
            Book book = new Book(
                resultSet.getInt("id"),
                resultSet.getString("title"),
                resultSet.getString("author"),
                resultSet.getInt("year"),
                resultSet.getInt("pages")
            );
            bookList.add(book);
        }

        connection.close();
        return bookList;
    }
}
