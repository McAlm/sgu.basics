package de.commsult.sgu.basics.objects;

public class FastDrivingBehaviour extends DrivingBehaviour {

    @Override
    protected void accelerate() {
        this.velocity = this.velocity + 5;
        System.out.println("accelerated to " + this.velocity);
    }

}
