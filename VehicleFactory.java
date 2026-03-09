public class VehicleFactory {

    public static Vehicle createVolvo240() {
        return new Volvo240();
    }

    public static Vehicle createSaab() {
        return new Saab95();
    }

    public static Vehicle createScania() {
        return new Scania();
    }

    public static Vehicle createRandom() {
        int rand = (int) (Math.random() * 2);
        switch (rand) {
            case (0):
                return createVolvo240();
            case (1):
                return createSaab();
            case (2):
                return createScania();
            default:
                return null;
        }
    }
}

