package de.commsult.sgu.basics.objects;

public class SlowDrivingBehaviour extends DrivingBehaviour {

    @Override
    protected void accelerate() {
        this.velocity = this.velocity + 2;
        System.out.println("accelerated to " + this.velocity);
    }
}
