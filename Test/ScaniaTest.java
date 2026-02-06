import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScaniaTest  {
    @Test
    void startWhenOpenBed() {
        var testScania = new Scania();

        testScania.raise();
        testScania.startEngine();
        double speed = testScania.getCurrentSpeed();
        assertEquals(0, speed);
    }

    @Test
    void MoveWhenOpen(){
        var testScania = new Scania();

        testScania.startEngine();
        testScania.gas(0.5);
        testScania.raise();
        int angle = testScania.ramp.getAngle();
        assertEquals(0,angle);

    }

    @Test
    void raiseAndLower(){
        var testScania = new Scania();

        testScania.raise();
        testScania.raise();
        testScania.raise();
        testScania.raise();
        testScania.raise();
        testScania.raise();
        testScania.raise();
        testScania.lower();
        int angle = testScania.ramp.getAngle();
        assertEquals(6, angle);
    }

    @Test
    void raiseWhileMoving(){
        var testScania = new Scania();
        testScania.startEngine();
        testScania.raise();
        int angle= testScania.ramp.getAngle();

        assertEquals(0, angle);



    }



}

