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

        //testTransport.loadOn(Vehicle );
    }
}