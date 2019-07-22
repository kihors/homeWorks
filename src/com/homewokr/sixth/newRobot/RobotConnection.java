package com.homewokr.sixth.newRobot;

public interface RobotConnection extends AutoCloseable {

    void moveRobotTo(int x, int y);

    @Override
    void close();
}
