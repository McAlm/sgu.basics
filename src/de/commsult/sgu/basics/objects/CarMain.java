package de.commsult.sgu.basics.objects;

public class CarMain {
    
    public static void main(String[] args){
        Car bmw = new SportsCar("BMW","green",CarType.SEDAN, "320i", 45000, 200, MotorType.GAS);
        Car mercedes = new UtilityCar("Mercedes", "silver",  CarType.SEDAN, "SLK500", 65000, 230, MotorType.GAS);
        
        MotorBike honda = new MotorBikeImpl("Honda", "blue","650CBS",23000, 90, new FastDrivingBehaviour());
        bmw.drive(80);
        mercedes.drive(90);
        honda.drive(120);
        bmw.drive(0);
        mercedes.drive(0);
        honda.drive(0);
    }
}
