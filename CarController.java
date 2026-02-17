import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in an appropriate manner by
* modifying the model state and the updating the view.
 */

public class CarController { // member fields:// The delay (ms) corresponds to 20 updates a sec (hz)
    private final int delay = 50;// The timer is started with a listener (see below) that executes the statements// each step between delays.
    private Timer timer = new Timer(delay, new TimerListener());
    // The frame that represents this instance View of the MVC pattern
    CarView frame;// A list of cars, modify if needed
    ArrayList<Vehicle> cars = new ArrayList<>();
    Garage volvoWorkshops;
    Gamelogic gamelogic;

    //methods:
    public static void main(String[] args) {// Instance of this class

        CarController cc = new CarController();
        //Cars in game:
        cc.cars.add(new Volvo240());
        cc.cars.add(new Saab95());
        cc.cars.add(new Scania());

        cc.volvoWorkshops = new Garage(Volvo240.class, 300, 300, 10, 7 );
        cc.gamelogic = new Gamelogic();// Start a new view and send a reference of self
        cc.frame = new CarView("CarSim 1.0", cc);

        // Start the timer
        cc.timer.start();
    }

    public ArrayList<Vehicle> getArraylist() {
        return cars;
    }
    /* Each step the TimerListener moves all the cars in the list and tells the
     * view to update its images. Change this method to your needs.
     * */

    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (Vehicle car : cars) {
                gamelogic.turnAroundTest(car);
                car.move();
                int x = (int) Math.round(car.getX());
                int y = (int) Math.round(car.getY());
                frame.drawPanel.moveit(x, y);
                frame.drawPanel.repaint();
                gamelogic.loadOnGarageIfClose(volvoWorkshops, car, cars);
                gamelogic.inGarageTest(volvoWorkshops, car);
            }
        }
    }

    // Calls the gas method for each car once
    public void gas(double amount) {
        double gas = ((double) amount) / 100;
        for (Vehicle car : cars) {
            car.gas(gas);
        }
    }

    public void brake(double amount) {
        double brake = ((double) amount) / 100;
        for (Vehicle car : cars) {
            car.brake(brake);
        }
    }

    public void saabTurboOn() {
        for (Vehicle car : cars) {
            if (car instanceof Saab95) {
                ((Saab95) car).setTurboOn();
            }
        }
    }

    public void saabTurboOff() {
        for (Vehicle car : cars) {
            if (car instanceof Saab95) {
                ((Saab95) car).setTurboOn();
            }
        }
    }

    public void scaniaLiftBed() {
        for (Vehicle car : cars) {
            if (car instanceof Scania)
                ((Scania) car).raise();
        }
    }

    public void lowerLiftBed() {
        for (Vehicle car : cars) {
            if (car instanceof Scania) {
                ((Scania) car).lower();
            }

        }
    }

    public void startAllCars() {
        for (Vehicle car : cars) {
            car.startEngine();
        }
    }

    public void stopAllCars() {
        for (Vehicle car : cars) {
            car.stopEngine();
        }
    }

    public void turnLeft() {
        for (Vehicle car : cars) {
            car.turnLeft();
        }
    }

    public void turnRight() {
        for (Vehicle car : cars) {
            car.turnRight();
        }
    }
}

