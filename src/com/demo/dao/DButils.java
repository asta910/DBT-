package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButils {
    private static Connection connection;

    static {
        try {
            String url = "jdbc:mysql://localhost:3306/pr";
            connection = DriverManager.getConnection(url, "root", "asta@4527");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Connection getConnectionMy() {
        if (connection == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/pr";
                connection = DriverManager.getConnection(url, "root", "asta@4527");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return connection;
    }

    public static void closeConnectionMy() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}
