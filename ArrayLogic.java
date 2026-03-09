import java.util.ArrayList;

//Logik för att lägga till/ta bort object in game
public class ArrayLogic {

    private ArrayList<Vehicle> cars;
    AvailableModels am;
    ArrayList<String> amlist;
    int rand;


    public ArrayLogic(ArrayList<Vehicle> cars) {
        this.cars = cars;
        this.am = new AvailableModels();
        this.amlist = am.getArrayList();
    }

    public void addCar(String model) {

        if (cars.size() < 10) {
            if (model.equals("Saab95")) {
                cars.add(VehicleFactory.createSaab());
            } else if (model.equals("Volvo240")) {
                cars.add(VehicleFactory.createVolvo240());
            } else if (model.equals("Scania")) {
                cars.add(VehicleFactory.createScania());
            } else if (model.equals("Random")) {
                cars.add(VehicleFactory.createRandom());
            }
        }
    }

    public void removeCar () {
        if (!cars.isEmpty()) {
            cars.remove(cars.size() - 1);
        }
    }
}
