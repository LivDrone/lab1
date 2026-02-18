import javax.imageio.ImageIO;
import java.awt.*;
import java.util.ArrayList;

public class Gamelogic {

    public void turnAroundTest(Vehicle car){
        int carX = (int) car.getX();
        int carY = (int) car.getY();
        int carW = 100;
        int carH = 50;

        int maxX = 800;
        int maxY = 550;
        int minX = 0;
        int minY = 0;

        if (carX + carW >= maxX ||
            carY + carH >= maxY ||
            carX <= minX ||
            carY <= minY){
            car.turnLeft();
            car.turnLeft();
        }
    }

    public void loadOnGarageIfClose(Garage workshop, Vehicle car, ArrayList<Vehicle> cars){
        int carX = (int) car.getX();
        int carY = (int) car.getY();
        int carW = 80;
        int carH = 50;

        int garX = (int) workshop.getX();
        int garY = (int) workshop.getY();
        int garW = 100;
        int garH = 100;

        if (carX < garX + garW &&
            carX + carW > garX &&
            carY < garY + garH &&
            carY + carH > garY){
            workshop.loadOn(car);
            putInGarage(workshop, car);
            }
        }
    
    
    public boolean inGarageTest(Garage workshop, Vehicle car){
        return workshop.getLoader().getLoaded().contains(car);
    }
        
    public void putInGarage(Garage workshop, Vehicle car){
        if (inGarageTest(workshop, car)){
            car.setX(workshop.getX());
            car.setY(workshop.getY());
            }
        }
}


