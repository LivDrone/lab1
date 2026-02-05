import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScaniaTest {
    @Test
    void startWhenOpenBed() {
        var testScania = new Scania();

        testScania.raise(5);
        testScania.startEngine();
        double speed = testScania.getCurrentSpeed();
        assertEquals(0, speed);
    }

    @Test
    void MoveWhenOpen(){
        var testScania = new Scania();

        testScania.startEngine();
        testScania.gas(0.5);
        testScania.raise(5);
        int angle = testScania.getAngle();
        assertEquals(0,angle);

    }

    @Test
    void raiseAndLower(){
        var testScania = new Scania();

        testScania.raise(15);
        testScania.lower(10);
        int angle = testScania.getAngle();
        assertEquals(5, angle);
    }

    @Test
    void raiseWhileMoving(){
        var testScania = new Scania();
        testScania.startEngine();
        testScania.raise(10);
        int angle= testScania.getAngle();

        assertEquals(0, angle);


    }



}

