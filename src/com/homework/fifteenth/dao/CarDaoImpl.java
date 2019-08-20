package com.homework.fifteenth.dao;

import com.homework.fifteenth.db.Storage;
import com.homework.fifteenth.lib.Dao;
import com.homework.fifteenth.model.Car;

import java.util.List;

@Dao
public class CarDaoImpl implements CarDao {

    @Override
    public void addCar(Car car) {
        Storage.cars.add(car);
    }

    @Override
    public List<Car> getAllCar() {
        return Storage.cars;
    }
}
