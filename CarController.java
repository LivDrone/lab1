import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class CarController {
    private final int delay = 50;// The delay (ms) corresponds to 20 updates a sec (hz)
    private Timer timer = new Timer(delay, new TimerListener());// The timer is started with a listener (see below) that executes the statements// each step between delays.
    CarView frame;// The frame that represents this instance View of the MVC pattern
    ArrayList<Vehicle> cars = new ArrayList<>(); //List for cars in game
    Garage volvoWorkshops;
    Gamelogic gamelogic;

    //methods:
    public static void main(String[] args) {// Instance of this class

        CarController cc = new CarController();
        //Cars in game:
        cc.cars.add(new Volvo240());
        cc.cars.add(new Volvo240());
        cc.cars.add(new Saab95());
        cc.cars.add(new Scania());
        cc.cars.add(new Scania());
        cc.placeVehicles(cc.cars);

        cc.volvoWorkshops = new Garage(Volvo240.class, 300, 300, 10, 7 );
        cc.gamelogic = new Gamelogic();// Start a new view and send a reference of self
        cc.frame = new CarView("CarSim 1.0", cc);
        cc.timer.start();// Start the timer
    }
    /* Each step the TimerListener moves all the cars in the list and tells the
     * view to update its images. Change this method to your needs.
     * */
    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (Vehicle car : cars) {
                if(gamelogic.inGarageTest(volvoWorkshops, car)) {continue;}
                gamelogic.turnAroundTest(car);
                car.move();
                frame.drawPanel.repaint();
                gamelogic.loadOnGarageIfClose(volvoWorkshops, car, cars);
            }
        }
    }

    public ArrayList<Vehicle> getArraylist() {
        return cars;
    }

    private void placeVehicles(ArrayList<Vehicle> vehicles){
        int i = 1;
        for (Vehicle v : vehicles){
            v.setY(i);
            i += 100;
        }
    }

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

