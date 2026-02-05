import java.awt.*;

public class Scania extends Car implements Movable{

    private int bedAngle;

    public Scania(){
        super("Scania", 2, 5000, new Color(9, 205, 218), 1);

    }

    //flak
    public void raise(int amount) {
        if (getCurrentSpeed() == 0) {
            bedAngle += amount;

            if (bedAngle > 70) {
                bedAngle = 70;
            }

            if (bedAngle < 0) {
                bedAngle = 0;
            }
        }
    }

    public void lower(int amount){
            if (getCurrentSpeed() == 0) {
                bedAngle -= amount;

                if (bedAngle > 70) {
                    bedAngle = 70;
                }
                if (bedAngle < 0) {
                    bedAngle = 0;
                }
            }
        }

        public int getAngle(){
        return bedAngle;
    }

    @Override
    public void startEngine(){

            if(getAngle() == 0){
                setCurrentSpeed(0.1);
            }


    }

    @Override
    public void move(){ //Kolla med TA fredag, finns det bättre sätt? skriv getDirection
        if(getAngle() == 0){
            if(getDirection() % 4 == 0){
                double y = getY() + getCurrentSpeed();
                setY(y);
            }
            else if(getDirection() % 4 == 1){
                double x = getX() + getCurrentSpeed();
                setX(x);
            }
            else if(getDirection() % 4 == 2){
                double y = getY() - getCurrentSpeed();
                setY(y);
            }
            else if(getDirection() % 4 == 3){
                double x =  getX() - getCurrentSpeed();
                setX(x);
            }
        }
    }
    
}


