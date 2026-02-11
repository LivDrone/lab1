import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class WorkshopTest { //Workshop typ som tas in avgörs i worksshop klassen.

   /* @Test
    void loadWorkshop(){
        var testShop = new Workshop();
        var car1 = new Saab95("Alex");
        var car2 = new Saab95("Anthon");
        var car3 = new Saab95("Liv");
        var car4 = new Volvo240("Volvo240");



        car1.setX(8);
        car1.setY(14);

        car2.setX(11);
        car2.setY(16);

        car3.setX(5);
        car3.setY(20);

        car4.setY(14);
        car4.setX(11);


        testShop.loadOn(car1);
        testShop.loadOn(car2);
        testShop.loadOn(car3);
        //testShop.loadOn(car4); går då fel typ, ger statiskt fel

        //testShop.loadOff("Anthon");

        assertTrue(testShop.getLoader().getLoaded().contains(car2));


    }*/

    /*@Test
    void testCapacity(){
        var testWorkshop = new Workshop(10,10,2,7);
        var car1 = new Saab95("Alex");
        var car2 = new Saab95("Liv");
        var car3 = new Saab95("Anthon");

        car1.setX(8);
        car1.setY(12);

        car2.setX(11);
        car2.setY(11);

        car3.setX(9);
        car3.setY(12);

        testWorkshop.loadOn(car1);
        testWorkshop.loadOn(car2);
        testWorkshop.loadOn(car3);

        assertTrue(testWorkshop.getLoader().getLoaded().contains(car1));
        assertTrue(testWorkshop.getLoader().getLoaded().contains(car2));
        assertFalse(testWorkshop.getLoader().getLoaded().contains(car3));



    }*/

    @Test
    public void testMaxsize(){
        var testShop = new Workshop(10, 10, 2, 7);
        var testScania = new Scania();

        testScania.setX(11);
        testScania.setY(11);
        testShop.loadOn(testScania);

        assertFalse(testShop.getLoader().getLoaded().contains(testScania));



    }



}