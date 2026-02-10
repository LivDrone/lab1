import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class WorkshopTest {

    @Test
    void loadWorkshop(){
        var testShop = new Workshop();
        var testSaab95 = new Saab95();
        var testVolvo240 = new Volvo240();

        testSaab95.setX(8);
        testSaab95.setY(14);
        testVolvo240.setX(11);
        testVolvo240.setY(16);

        testShop.loadOn(testSaab95);
        testShop.loadOn(testVolvo240);


    }


}