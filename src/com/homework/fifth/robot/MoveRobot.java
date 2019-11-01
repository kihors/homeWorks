package com.homework.fifth.robot;

/*
 * task from Stepik
 * https://stepik.org/lesson/12773/step/7?unit=3121
 * solution with try-catch-finally
 */

public class MoveRobot {

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        RobotConnection robotConnection;
        for (int i = 0; i < 3; i++) {
            try {
                robotConnection = robotConnectionManager.getConnection();
            } catch (RobotConnectionException e) {
                continue;
            }
            try {
                robotConnection.moveRobotTo(toX, toY);
                return;
            } catch (RobotConnectionException e) {
            } finally {
                try {
                    robotConnection.close();
                } catch (RobotConnectionException e) {
                }
            }
        }
        throw new RobotConnectionException("Help me!");
    }
}
