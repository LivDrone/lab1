import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransportTest {
    @Test
    void raiseRampWhenSpeed(){
        var testTransport = new Transport();

        testTransport.startEngine();
        testTransport.gas(1);
        testTransport.raise();
        //testTransport.ramp.int getAngle();
    }

    @Test
    void loadOnAndOff(){
        var testTransport = new Transport();
        var testSaab95 = new Saab95();

        testTransport.loadOn(testSaab95);

        //testTransport.loadOn(Vehicle );
    }

    @Test
    void loadScania(){

        var scania = new Scania();
        var testTransport2 = new Transport();

        testTransport2.loadOn(scania);
        assertFalse(testTransport2.getLoader().getLoaded().contains(scania));
    }

    @Test
    void driveRaised(){

        var testTransport3 = new Transport();

        testTransport3.lower();
        testTransport3.startEngine();
        double speed=testTransport3.getCurrentSpeed();

        assertEquals(0, speed);
    }

    @Test
    void carMoveWithTransport(){
        var testTransport = new Transport();
        var testSaab = new Saab95();

        testTransport.lower();
        testTransport.loadOn(testSaab);
        testTransport.raise();
        testTransport.startEngine();
        testTransport.gas(1);
        testTransport.move();
        testTransport.brake(1);
        testTransport.move();
        testTransport.lower();
        testTransport.loadOff();
        double x = testSaab.getX();
        double y = testSaab.getY();
        double x1 = testTransport.getX();
        double y1 = testTransport.getY();

        //assertTrue(testTransport.getLoader().getLoaded().contains(testSaab));

        assertEquals(0, x1 );
        assertEquals(0.77, y1);

        assertEquals(0, x );
        assertEquals(0.77, y);


    }
}