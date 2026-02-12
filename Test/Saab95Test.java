import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class Saab95Test {
    @Test
    void positionSaabAfterMove(){
        var testSaab = new Saab95();

        testSaab.startEngine();
        testSaab.gas(1);
        testSaab.move();
        testSaab.turnRight();
        testSaab.move();
        testSaab.turnLeft();
        testSaab.move();
        double x = testSaab.getX();
        double y = testSaab.getY();

        assertEquals(1.35, x);
        assertEquals(2.7, y);
    }

    @Test
    void saabSpeedWithTurbo(){
        var testSaab = new Saab95();

        testSaab.startEngine();
        testSaab.setTurboOn();

        double speed = testSaab.speedFactor();
        assertEquals(1.625, speed);

    }
}