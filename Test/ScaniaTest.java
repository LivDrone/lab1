import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScaniaTest {
    @Test
    void startOpenBed() {
        var testScania = new Scania();

        testScania.raise(5);
        testScania.startEngine();

    }


}

