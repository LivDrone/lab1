import java.awt.*;

//Basklass
abstract class Car implements Movable{ //Abstract pga vi vill extenda från den, inte public
                                        //implements Movable för alla cars
    //Publika variabler
    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name
    protected double xPos; //kanske point istället??
    protected double yPos; //x/y separat för lättare hantering än Point
    protected int direction = 0; // börjar peka y- positivt

    //Metoder för interface: Movable
    @Override
    public void move() { //Modulär räkning annorlund från python
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

    //Metoder
    public int getNrDoors(){ //Private?
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    } //Private?

    public double getCurrentSpeed(){
        return currentSpeed;
    } //Private?

    public Color getColor(){
        return color;
    } //Private?

    public void setColor(Color clr){
	    color = clr;
    } //Private?

    public double getX(){
        return xPos;
    } //Private?
    
    public double getY(){ //Private?
        return yPos;
    }
        
    public void startEngine(){
	    currentSpeed = 0.1;
    }

    public void stopEngine(){
	    currentSpeed = 0;
    }

    public void incrementSpeed(double amount){
	    currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }

    public void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }

    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }

}
