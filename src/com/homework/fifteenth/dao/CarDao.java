package com.homework.fifteenth.dao;

import com.homework.fifteenth.model.Car;

import java.util.List;

public interface CarDao {

    void addCar(Car car);

    List<Car> getAllCar();
}
