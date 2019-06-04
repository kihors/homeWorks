package homewokrSixth;

public class Car implements Cloneable {
    private String model;
    private String color;
    private String fuel;
    private int speed;
    private int power;

    public Car(String model, String color, String fuel, int speed, int power) {
        this.model = model;
        this.color = color;
        this.fuel = fuel;
        this.speed = speed;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
