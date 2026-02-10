public class Ramp {

    public int capacity;
    private int maxAngle = 0;
    private int minAngle;
    private boolean raised = false;
    private int angle = minAngle;

    public Ramp(int capacity, int maxAngle, int minAngle){
        this.capacity = capacity;
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
