package com.homework.fifteenth.dao;


import com.homework.fifteenth.model.Bet;

import java.util.List;

public interface BetDao {

    void add(Bet bet);

    List<Bet> getAll();

}
