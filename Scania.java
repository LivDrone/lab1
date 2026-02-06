import java.awt.*;

abstract class Scania extends Car implements Raiseable{

    private int bedAngle;
    private Ramp ramp;

    public Scania(){
        super("Scania", 2, 5000, new Color(9, 205, 218), 1);
        ramp = new Ramp(2, 70,0);

    }

    //flak
    @Override
    public void raise() {
        if (getCurrentSpeed() == 0) {
            bedAngle+=1;

            if (bedAngle > 70) {
                bedAngle = 70;
            }

            if (bedAngle < 0) {
                bedAngle = 0;
            }
        }
    }
    @Override
    public void lower(){
            if (getCurrentSpeed() == 0) {
                bedAngle -= 1;

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
                super.startEngine();
            }


    }

    @Override
    public void move(){
        if(getAngle() == 0){
           super.move();
            }
        }
    }
    
}


