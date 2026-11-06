/*
* File: Sqlite.java
* Author: El Miri Martin
* Copyright: 2026, El Miri Martin
* Group: Szoft II/N
* Date: 2026-11-06
* Github: https://github.com/Martin91625
* Licenc: MIT
*/

package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sqlite implements Database {
    
    @Override 
    public Connection connect() {
        try {
            return tryConnect();
        } catch (Exception e) {
            System.err.println("Hiba történt");
            return null;
        }
    }

    private Connection tryConnect() throws SQLException {
        String url = "jdbc:sqlite:database.db";
        return DriverManager.getConnection(url);
    }
}
