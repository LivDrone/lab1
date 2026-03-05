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
        if (model == "Random") {
            rand = (int)(Math.random() * amlist.size()-1)+2;
            model = amlist.get(rand);
        }

        if (cars.size() < 10) {
            if (model == "Saab95") {
                cars.add(new Saab95());
            } else if (model == "Volvo240") {
                cars.add(new Volvo240());
            } else if (model == "Scania") {
                cars.add(new Scania());

            }
        }
    }

    public void removeCar () {
        if (!cars.isEmpty()) {
            cars.remove(cars.size() - 1);
        }
    }
}
