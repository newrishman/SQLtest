package com.newrishman.dao;

import com.newrishman.vo.MBCars;

import java.sql.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class JDBCMBCarsDAO implements MBCarsDAO {

    private final String URL = "jdbc:mysql://localhost:3306/ForIDE?useSSL=false&serverTimezone=UTC";
    private final String username = "root";
    private final String password = "qweqweqwe";

    Connection connection;

    public Connection getConnection() {
        try {
            if (connection == null) {
                connection = DriverManager.getConnection(URL, username, password);
            }
        } catch (SQLException e) {
            System.err.println("Driver not run!");
        }
        return connection;
    }

    @Override
    public void insert(MBCars MBCars) {
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement("insert  into  mercedescars (body, Engine, Model, Vin) values (?, ?, ?, ? )");
            preparedStatement.setString(1, MBCars.getBody());
            preparedStatement.setInt(2, MBCars.getEngine());
            preparedStatement.setString(3, MBCars.getModel());
            preparedStatement.setInt(4, MBCars.getVIN());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Set<MBCars> select() {
        Set<MBCars> mbCarsList = new LinkedHashSet<>();
        Statement statement;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM mercedescars");
            MBCars mbCars;
            while (resultSet.next()) {
                mbCars = new MBCars();
                mbCars.setId(resultSet.getInt("id"));
                mbCars.setBody(resultSet.getString("Body"));
                mbCars.setEngine(resultSet.getInt("Engine"));
                mbCars.setModel(resultSet.getString("Model"));
                mbCars.setVIN(resultSet.getInt("VIN"));

                mbCarsList.add(mbCars);
            }
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(mbCarsList);
        return mbCarsList;
    }

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
        }
    }


}
