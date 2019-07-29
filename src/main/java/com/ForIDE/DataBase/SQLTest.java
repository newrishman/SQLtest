package com.ForIDE.DataBase;


import java.sql.*;

public class SQLTest {
    private static String URL = "jdbc:mysql://localhost:3306/ForIDE?useSSL=false&serverTimezone=UTC";
    private static String username = "root";
    private static String password = "qweqweqwe";

    public static void main(String[] args) {
        Connection connection;
        try {
            connection = DriverManager.getConnection(URL, username, password);
            Statement statement = connection.createStatement();

            statement.execute("insert  into  mercedescars (body, Engine, Model, Vin) values ('M-class', 642, 'ML350d', 166 )");

            String comand = "select * from mercedescars";
            ResultSet resultSet = statement.executeQuery(comand);

            while (resultSet.next()) {
                int one = resultSet.getInt("id");
                String two = resultSet.getString("Body");
                int three = resultSet.getInt("Engine");
                String four = resultSet.getString("Model");
                int five = resultSet.getInt("VIN");
                System.out.println("Car ID is: " + one + ", Body: " + two + ", Engine: " + three + ", Model: " + four + ", VIN: " + five);
            }

        } catch (SQLException e) {
            System.err.println("Driver not use");
        }
    }
}
