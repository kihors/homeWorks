package com.homework.fifteenth.factory;

import com.homework.fifteenth.dao.CarDao;
import com.homework.fifteenth.dao.CarDaoImpl;

public class CarDaoFactory {

    private static CarDao instance;

    public static CarDao getCarDao() {
        if (instance == null) {
            instance = new CarDaoImpl();
        }
        return instance;
    }
}
