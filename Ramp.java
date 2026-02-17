public class Ramp {

    private int maxAngle = 0;
    private int minAngle;
    private int angle = minAngle;

    public Ramp(int maxAngle, int minAngle){
        this.maxAngle = maxAngle;
        this.minAngle = minAngle;
        angle = getMinAngle();
    }

    public int getMaxAngle(){return maxAngle;}
    public int getMinAngle(){return minAngle;}
    public int getAngle(){return angle;}
    public void setAngle(int amount){
        if(amount >= getMinAngle() && amount <= getMaxAngle()){
            angle = amount;
        }


    }
}
