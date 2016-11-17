package de.commsult.sgu.basics.objects;

public abstract class AbstractCar implements Car {
    private String brand;
    private String color;
    private CarType type;
    private String name;

    private int price;
    private int horsePower;
    private MotorType motorType;

    protected int velocity;
    private DrivingBehaviour drivingBehaviour;

    public AbstractCar(String brand, String color, CarType type, String name, int price, int horsePower, MotorType motorType, DrivingBehaviour drivingBehaviour) {
        super();
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.name = name;
        this.price = price;
        this.horsePower = horsePower;
        this.motorType = motorType;
        this.drivingBehaviour = drivingBehaviour;
    }

    public void drive(int velocity) {
        this.drivingBehaviour.drive(velocity);
        System.out.println(brand + " " + name + " is driving with " + velocity + "mph");
    }
}
