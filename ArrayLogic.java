import java.util.ArrayList;

public class ArrayLogic {

    private ArrayList<Vehicle> cars;

    public ArrayLogic(ArrayList<Vehicle> cars){
        this.cars = cars;
    }

    public void addCar(String model) {
        if (model == "Saab95") {
            cars.add(new Saab95());
        } else if (model == "Volvo240") {
            cars.add(new Volvo240());
        } else if (model == "Scania") {
            cars.add(new Scania());
        }
    }

    public void removeCar(){
        if (!cars.isEmpty()) {
            cars.remove(cars.size() - 1);
        }
    }
}
