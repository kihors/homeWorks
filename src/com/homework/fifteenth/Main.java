package com.homework.fifteenth;

import com.homework.fifteenth.controller.ConsoleHandler;
import com.homework.fifteenth.dao.BetDao;
import com.homework.fifteenth.dao.BetDaoImpl;
import com.homework.fifteenth.lib.Injector;

public class Main {

    static {
        try {
            Injector.injectDependency();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Если хотите сделать ставку, введите \n" +
                "сумму и риск через пробел");
        ConsoleHandler.handle();
        BetDao betDao = new BetDaoImpl();
        System.out.println(betDao.getAll());

    }


}




