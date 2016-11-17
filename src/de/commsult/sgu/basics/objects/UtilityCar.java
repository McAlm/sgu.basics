package de.commsult.sgu.basics.objects;

public class UtilityCar extends AbstractCar {

    public UtilityCar(String brand, String color, CarType type, String name, int price, int horsePower, MotorType motorType) {
        super(brand, color, type, name, price, horsePower, motorType, new SlowDrivingBehaviour());
    }
}
