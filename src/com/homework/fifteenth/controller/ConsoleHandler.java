package com.homework.fifteenth.controller;

import com.homework.fifteenth.dao.BetDao;
import com.homework.fifteenth.dao.CarDao;
import com.homework.fifteenth.lib.Inject;
import com.homework.fifteenth.model.Bet;
import com.homework.fifteenth.model.Car;

import java.util.Scanner;

public class ConsoleHandler {

    @Inject
    private static BetDao betDao;

    @Inject
    private static CarDao carDao;

    private static Scanner scanner = new Scanner(System.in);

    static public void handleBet() {
        try {
            while (true) {
                String command = scanner.nextLine();
                if (command.equals("0")) {
                    return;
                }
                String[] data = command.split(" ");
                int value = Integer.parseInt(data[0]);
                double risk = Double.parseDouble(data[1]);
                Bet bet = new Bet(value, risk);
                betDao.add(bet);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Data entered incorrectly");
        }
    }

    static public void handleCar() {
        try {
            while (true) {
                String command = scanner.nextLine();
                if (command.equals("0")) {
                    return;
                }
                String[] data = command.split(" ");
                String name = data[0];
                int power = Integer.parseInt(data[1]);
                Car car = new Car(name, power);
                carDao.addCar(car);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Data entered incorrectly");
        }
    }
}
