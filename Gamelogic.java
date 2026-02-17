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
        int maxY = 400;
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

    public void loadOnGarageTest(Garage workshop, Vehicle car){
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
        }
    }

    public boolean notInGarageTest(Garage workshop, Vehicle car){
        if (workshop.getLoader().getLoaded().contains(car)){
            return false;
        }
        return true;
    }

}


