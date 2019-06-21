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

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", fuel='" + fuel + '\'' +
                ", speed=" + speed +
                ", power=" + power +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Car myCar = new Car("Toyota", "red", "gas", 240, 150);
        Car otherCar = new Car("BMW", "black", "diesel", 210, 110);

        Car cloneMyCar = (Car) myCar.clone();
        Car cloneOtherCar = (Car) otherCar.clone();

        cloneOtherCar.setColor("blue");
        cloneMyCar.setPower(120);

        System.out.println(myCar);
        System.out.println(cloneMyCar);
        System.out.println("//////////////////////////////////////////////////////////////////");
        System.out.println(otherCar);
        System.out.println(cloneOtherCar);
    }
}
