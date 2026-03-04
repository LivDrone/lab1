import java.util.ArrayList;

public class MoveLogic {
    ArrayList<Vehicle> cars; // behöver kopplas till arraylist i Gamecontroller

    public MoveLogic(ArrayList cars){
        this.cars = cars;
    }


    public void gas(double amount) {
        double gas = ((double) amount) / 100;
        for (Vehicle car : cars) {
            car.gas(gas);

            iteration()
        }

    }

    public void brake(double amount) {
        double brake = ((double) amount) / 100;
        for (Vehicle car : cars) {
            car.brake(brake);
        }

        //model.breakeAllCars(breake)

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

