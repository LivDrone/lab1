import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageTest {

    @Test
    public void loadGarage(){
        var testgarage = new Garage(Saab95.class,10,10,2, 7);
        var testSaab = new Saab95();
        var testVolvo = new Volvo240();

        testSaab.setX(9);
        testSaab.setY(9);
        testVolvo.setX(8);
        testVolvo.setY(8);
        //testgarage.loadOn(testSaab);
        //testgarage.loadOn(testVolvo); //shouldnt be able to load


    }


}