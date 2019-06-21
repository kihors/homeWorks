package com.homewokr.sixth.newRobot;

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
