import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Saab95Test {
    @Test
    void positionSaabAfterMove(){
        var testSaab = new Saab95();

        testSaab.startEngine();
        testSaab.incrementSpeed(10);
        testSaab.move();
        testSaab.turnRight();
        testSaab.move();
        testSaab.turnLeft();
        testSaab.move();
        double x = testSaab.getX();
        double y = testSaab.getY();

        assertEquals(12.6, x);
        assertEquals(25.2, y);
    }

    @Test
    void positionSaabAfterMoveWithTurbo(){
        var testSaab = new Saab95();

        testSaab.startEngine();
        testSaab.setTurboOn();

        double speed = testSaab.speedFactor();
        assertEquals(1.625, speed);

    }
}