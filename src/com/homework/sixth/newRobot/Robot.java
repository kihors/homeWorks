package com.homework.sixth.newRobot;

/*
 * task from Stepik
 * https://stepik.org/lesson/12773/step/7?unit=3121
 * solution try with resources
 */

public class Robot {

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        boolean success = false;
        for (int i = 0; !success && i < 3; i++) {
            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                success = true;
            } catch (RobotConnectionException e) {
            }
        }
        if (!success) {
            throw new RobotConnectionException("Help me!");
        }
    }
}
