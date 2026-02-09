import java.awt.*;
import java.lang.String;

//Basklass
abstract class Vehicle implements Movable{ //Abstract pga vi vill extenda från den
                                        //implements Movable för alla cars
    //Publika variabler
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private double xPos = 0; //kanske point istället??
    private double yPos = 0; //x/y separat för lättare hantering än Point
    private int direction = 0; // börjar peka y- positivt
    private double trim = 1;
    private double size;

    public Vehicle(String modelName, int nrDoors, double enginePower, Color color, double trim, double size){
        this.modelName = modelName;
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.trim = trim;
        this.size = size;
        stopEngine();
    }

    //Metoder för interface: Movable
    @Override //specifik implementering för Car
    public void move() { //Modulär räkning annorlunda från python
        if(direction % 4 == 0){
            yPos += currentSpeed;
        }
        else if(direction % 4 == 1){
            xPos += currentSpeed;
        }
        else if(direction % 4 == 2){
            yPos -= currentSpeed;
        }
        else if(direction % 4 == 3){
            xPos -= currentSpeed;
        }
    }

    @Override
    public void turnLeft() {
        direction += 3;
    }

    @Override
    public void turnRight() {
        direction += 1;
    }

    public int getDirection(){
        return direction;
    }

    //Metoder--------------------------------------------------------
    public void setNrDoors(int doors){
        nrDoors = doors;
    }

    public int getNrDoors(){ //Private?
        return nrDoors;
    }

    public void setEnginePower(int power){enginePower = power;}

    public void setModelName(String model){modelName = model;}

    public double getEnginePower(){
        return enginePower;
    }

    public void setCurrentSpeed(double amount) {
        if (amount >= 0 && amount <= enginePower) {
            currentSpeed = amount;
        }
    }

    public double getCurrentSpeed(){
        if(currentSpeed > 0 && currentSpeed < enginePower){
        return currentSpeed;
        }
        else if(currentSpeed > enginePower){
            return enginePower;
        }
        else if(currentSpeed < 0){
            return 0;
        }
        return 0;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
	    color = clr;
    }

    public void setX(double x){
        xPos = x;
    }

    public double getX(){
        return xPos;
    }

    public void setY(double y){
        yPos = y;
    }

    public double getY(){ //Private?
        return yPos;
    }
        
    public void startEngine(){
	    currentSpeed = 0.1;
    }

    public void stopEngine(){
	    currentSpeed = 0;
    }

    public void setTrim(double tune){
        trim = tune;
    }

    public double speedFactor(){
        return enginePower * 0.01 * trim;
    }

    public double getSize(){ return size; }

    private void incrementSpeed(double amount){
        if (amount > 0 && Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower) > currentSpeed){
            currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
        }
    }

    private void decrementSpeed(double amount){
        if (amount > 0 && Math.max(getCurrentSpeed() - speedFactor() * amount,0) < currentSpeed){
            currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
        }
    }

    public void gas(double amount){
        if(amount >= 0 && amount <= 1){
            incrementSpeed(amount);
        }
    }

    public void brake(double amount){
        if(amount >= 0 && amount <= 1){
        decrementSpeed(amount);
        }
    }

}
