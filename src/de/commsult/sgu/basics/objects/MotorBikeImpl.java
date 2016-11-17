package de.commsult.sgu.basics.objects;

public class MotorBikeImpl implements MotorBike {

    private String brand;
    private String color;
    private String name;

    private int price;
    private int horsePower;

    protected int velocity;
    private DrivingBehaviour drivingBehaviour;
    
    public MotorBikeImpl(String brand, String color, String name, int price, int horsePower, DrivingBehaviour drivingBehaviour) {
        super();
        this.brand = brand;
        this.color = color;
        this.name = name;
        this.price = price;
        this.horsePower = horsePower;
        this.drivingBehaviour = drivingBehaviour;
    }

    @Override
    public void drive(int velocity) {
        this.drivingBehaviour.drive(velocity);
        System.out.println(brand + " " + name + " is driving with " + velocity + "mph");
    }

}
