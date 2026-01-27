import java.awt.*;
//hej

public class Saab95 extends Cars implements Movable{

    public boolean turboOn;
    
    public Saab95(){ //Konstruktor aka typ __init__, ger defaultvärden
        nrDoors = 2;
        color = Color.red;
        enginePower = 125;
	    turboOn = false;
        modelName = "Saab95";
        pos = new Point(xPos, yPos);

        stopEngine();
    }
    
    public void setTurboOn(){
	    turboOn = true;
    }

    public void setTurboOff(){
	    turboOn = false;
    }
    
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }
    
}
