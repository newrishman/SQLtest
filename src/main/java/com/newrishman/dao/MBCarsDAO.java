package com.newrishman.dao;

import com.newrishman.vo.MBCars;

import java.util.Set;


public interface MBCarsDAO {

     void insert(MBCars MBCars);

     Set<MBCars> select();

}
