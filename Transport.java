import java.awt.*;

public class Transport extends Vehicle implements Raiseable {

    private Ramp ramp;
    private LoaderLifo<Vehicle> loaderLifo;


    public Transport(){
        super("Mack", 2, 67, Color.red, 1, 10);
        ramp = new Ramp(1, 1,0);
        LoaderLifo<Vehicle> loaderLifo = new LoaderLifo<>(10, 6);
    }

    @Override
    public void raise() {
        if (getCurrentSpeed() == 0) {
            ramp.setAngle(ramp.getMaxAngle());
        }
    }

    @Override
    public void lower(){
        if (getCurrentSpeed() == 0) {
            ramp.setAngle(ramp.getMinAngle());
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
        }
    }

    public void LoaderLifo(Vehicle vehicle){
        loaderLifo.loadOn(vehicle, getX(), getY());


    }

}
