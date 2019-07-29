package com.ForIDE.DataBase;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLTest {
    private static String URL = "jdbc:mysql://localhost:3306/ForIDE?useSSL=false&serverTimezone=UTC";
    private static String username = "root";
    private static String password = "qweqweqwe";

    public static void main(String[] args) {
        Connection connection;
        try {
            connection = DriverManager.getConnection(URL, username, password);

            if (!connection.isClosed()) {
                System.out.println("not closed");
            }
            connection.close();

            if (connection.isClosed()) {
                System.out.println("is closed");
            }

        } catch (SQLException e) {
            System.err.println("Driver not use");
        }
    }
}
