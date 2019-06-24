package com.homework.fifteenth.dao;

import com.homework.fifteenth.db.Storage;
import com.homework.fifteenth.lib.Dao;
import com.homework.fifteenth.model.Bet;

import java.util.List;

//НАШ КЛАСС ДЛЯ РАБОТЫ С БАЗОЙ ДАННЫХ И ТАБЛИЦОЙ СТАВОК
@Dao
public class BetDaoImpl implements BetDao {

    @Override
    public void add(Bet bet) {
        Storage.bets.add(bet);
    }

    @Override
    public List<Bet> getAll() {
        return Storage.bets;
    }

}
