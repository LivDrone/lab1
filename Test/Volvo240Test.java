import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Volvo240Test {
    @Test
    void positionVolvoAfterMove(){
        var testVolvo = new Volvo240();

        testVolvo.startEngine();
        testVolvo.incrementSpeed(10);
        testVolvo.move();
        testVolvo.turnRight();
        testVolvo.move();
        testVolvo.turnLeft();
        testVolvo.move();
        double x = testVolvo.getX();
        double y = testVolvo.getY();

        assertEquals(12.6, x);
        assertEquals(25.2, y);
    }

    @Test
    void volvoSpeed(){
        var testVolvo = new Volvo240();

        testVolvo.startEngine();

        double speed = testVolvo.speedFactor();
        assertEquals(1.25, speed);

    }
    @Test
    void VolvoBreak(){
        var testVolvo = new Volvo240();

        testVolvo.startEngine();
        testVolvo.incrementSpeed(1);


    }

    @Test
    void volvoGas(){
        var testVolvo = new Volvo240();

        testVolvo.startEngine();
        testVolvo.gas(0.5);
        double speed = testVolvo.getCurrentSpeed();

        assertEquals(0.725,speed);



    }
}