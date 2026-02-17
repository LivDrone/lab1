import java.awt.*;

public class Saab95 extends Vehicle {

    public double turbo = 1;
    
    public Saab95(){ //Konstruktor aka typ __init__, ger defaultvärden
        super("Saab95", 2, 125, Color.red,5, "pics/Saab95.jpg");
    }
    
    public void setTurboOn(){turbo = 1.3;}

    public void setTurboOff(){turbo = 1;}

    @Override
    public double speedFactor(){
        return getEnginePower() * 0.01 * turbo;
    }



}
