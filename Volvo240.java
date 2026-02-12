import java.awt.*;

public class Volvo240 extends Vehicle {

    public final static double trimFactor = 1.25;

    public Volvo240(){
        super("Volvo240", 4, 100, Color.black, 4.9);
    }

    @Override
    public double speedFactor(){return getEnginePower() * 0.01 * trimFactor;}

}
