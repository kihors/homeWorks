package com.homework.fifteenth.factory;

import com.homework.fifteenth.dao.BetDao;
import com.homework.fifteenth.dao.BetDaoImpl;

public class BetDaoFactory {

    private static BetDao instance;

    public static BetDao getBetDao() {
        if (instance == null) {
            instance = new BetDaoImpl();
        }
        return instance;
    }
}
