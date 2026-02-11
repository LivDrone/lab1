import java.awt.*;

public class Transport extends Vehicle implements Raiseable {

    private Ramp ramp;
    private Loader<Vehicle> loader;


    public Transport(){
        super("Mack", 2, 67, Color.red, 10);
        ramp = new Ramp(1, 1,0);
        this.loader = new Loader<>(10, 6);
    }

    @Override
    public void raise() {
        if (getCurrentSpeed() == 0) {
            ramp.setAngle(ramp.getMinAngle());
        }
    }

    @Override
    public void lower(){
        if (getCurrentSpeed() == 0) {
            ramp.setAngle(ramp.getMaxAngle());
        }
    }

    @Override
    public void startEngine(){
        if(ramp.getAngle() == ramp.getMinAngle()){
            super.startEngine();
        }
    }

    @Override
    public void move(){
        if(ramp.getAngle() == ramp.getMinAngle()){
            super.move();
            loader.updatePos(getX(), getY());
        }
    }

    public void loadOn(Vehicle vehicle){
        if(getCurrentSpeed() == 0) {
            loader.loadOn(vehicle, getX(), getY());

        }
    }

    public Vehicle loadOff(){
        if(getCurrentSpeed() == 0) {
            return loader.loadOff();
        }
        return null;
    }

    public Loader<Vehicle> getLoader(){return loader;}


}

