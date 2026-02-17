import java.awt.*;

class Scania extends Vehicle implements Raiseable{

    public Ramp ramp;

    public Scania(){
        super("Scania", 2, 200, new Color(9, 205, 218), 50,"pics/Scania.jpg" );
        ramp = new Ramp(2, 70,0);
    }
    //flak
    @Override
    public void raise() {
        if (getCurrentSpeed() == 0) {
            ramp.setAngle(ramp.getAngle() + 1);
        }
    }

    @Override
    public void lower(){
        if (getCurrentSpeed() == 0) {
                ramp.setAngle(ramp.getAngle() - 1);
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
}
    



