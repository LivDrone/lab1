import java.awt.*;

public class Scania extends Car implements Movable{

    private int bedAngle;

    public Scania(){
        super("Scania", 2, 5000, new Color(9, 205, 218), 1);

    }

    //flak
    public void raise(int amount){
        if (getCurrentSpeed() == 0){
            bedAngle += amount;

            if(bedAngle>70){
                bedAngle=70;
            }

            if(bedAngle<0){
                bedAngle=0;
            }
        }

    }

    public void lower(){

    }

    public int getAngle(){
        return bedAngle;
    }
}
