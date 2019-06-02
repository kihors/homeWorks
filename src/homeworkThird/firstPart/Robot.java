package homeworkThird.firstPart;

public class Robot {

    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.UP);
        moveRobot(robot, 8, 4);
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    private Direction direction;
    private int x, y;

    Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        switch (direction) {
            case UP:
                direction = Direction.LEFT;
                break;
            case LEFT:
                direction = Direction.DOWN;
                break;
            case DOWN:
                direction = Direction.RIGHT;
                break;
            case RIGHT:
                direction = Direction.UP;
                break;
        }
        System.out.println("Turned left - current direction is " + direction.toString());

    }

    public void turnRight() {
        switch (direction) {
            case UP:
                direction = Direction.RIGHT;
                break;
            case RIGHT:
                direction = Direction.DOWN;
                break;
            case DOWN:
                direction = Direction.LEFT;
                break;
            case LEFT:
                direction = Direction.UP;
                break;
        }
        System.out.println("Turned right - current direction is " + direction.toString());
    }

    public void stepForward() {
        switch (getDirection()) {
            default:
            case RIGHT:
                x++;
                break;
            case LEFT:
                x--;
                break;
            case UP:
                y++;
                break;
            case DOWN:
                y--;
                break;
        }
        System.out.println("Stepped forward - current position: x=" + x + "; y=" + y + ";");
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        if (toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }
        if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        if (toY > robot.getY()) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
        }
        if (toY < robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
