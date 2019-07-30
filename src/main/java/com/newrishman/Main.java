package com.newrishman;

import com.newrishman.dao.JDBCMBCarsDAO;
import com.newrishman.vo.MBCars;

public class Main {
    public static void main(String[] args) {
        /*MBCars mbCars = new MBCars();
        mbCars.setBody("G-class");
        mbCars.setEngine(278);
        mbCars.setModel("GL500");
        mbCars.setVIN(166);*/
        JDBCMBCarsDAO jdbcmbCarsDAO = new JDBCMBCarsDAO();
        jdbcmbCarsDAO.getConnection();
        //jdbcmbCarsDAO.insert(mbCars);
        jdbcmbCarsDAO.select();
        jdbcmbCarsDAO.closeConnection();
    }
}
