import java.awt.*;

public class Saab95 extends Car{

    public double turbo = 1;
    
    public Saab95(){ //Konstruktor aka typ __init__, ger defaultvärden
        setNrDoors(2);
        setColor(Color.RED);
        setEnginePower(125);
        setModelName("Saab95");
        setX(0);
        setY(0);
        setTrim(turbo);
        stopEngine();
    }
    
    public void setTurboOn(){
        turbo = 1.3;
        trim = turbo;
    }
    public void setTurboOff(){
	    turbo = 1;
        trim = turbo;
    }


      /*public double speedFactor(){
         double turbo = 1;
      if(turboOn) turbo = 1.3;
      return enginePower * 0.01 * turbo;
   }*/

}
