import javax.imageio.ImageIO;
import java.awt.*;
import java.util.ArrayList;

public class Gamelogic {




    public void turnAroundTest(Vehicle car){
            if(car.getX() == 800 || car.getY() == 600 || car.getX() == 0 || car.getY() == 0) {
                car.turnLeft();
                car.turnLeft();
        }
    }

    public void loadOnGarageTest(Garage workshop, Vehicle car){
        if((car.getX() > workshop.getX() || car.getX() < (workshop.getX() + 100)
                && (car.getY() > workshop.getY() || car.getY() < (workshop.getY()) + 100))){
            workshop.loadOn(car);
        }
        if(((car.getX() + 80) > workshop.getX() || (car.getX() + 80) < (workshop.getY() + 100))
                && ((car.getY() + 50) > workshop.getY() || (car.getY() + 50) < (workshop.getY()) + 100)){
            workshop.loadOn(car);
        }
    }

    public boolean alreadyInGarageTest(Garage workshop, Vehicle car){
        if (workshop.getLoader().getLoaded().contains(car)){
            return true;
        }
        return false;
    }

}


