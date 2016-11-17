package de.commsult.sgu.basics.objects;

public abstract class DrivingBehaviour implements Driving {

    protected int velocity;

    @Override
    public void drive(int velocity) {
        if (this.velocity < velocity){
            do{
                accelerate();   
            }
            while(this.velocity < velocity);
        } else {
            do{
                brake();   
            }
            while(this.velocity > velocity);
        }
        this.velocity = velocity;
    }
    
    protected abstract void accelerate();

    private void brake() {
        this.velocity = this.velocity - 5;
        System.out.println("braked down to " + this.velocity);
    }
}
