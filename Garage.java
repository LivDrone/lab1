public class Garage<T extends Vehicle> {

    private final Class<T> allowedType;
    private Loader<T> loader;
    private double xPos;
    private double yPos;

    public Garage(Class<T> allowedType, double xPos, double yPos, int capacity, int maxSize) { //Constructor
        this.allowedType = allowedType;
        this.loader = new Loader<>(capacity,maxSize);
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public double getX(){
        return xPos;
    }

    public double getY(){ //Private?
        return yPos;
    }

    public T loadOff(Vehicle vehicle) {

        for (T v: loader.loaded) {
            if (v.equals(vehicle)) {
                loader.loaded.remove(v);
                return v;
            }
        }
        return null;
    }

    public void loadOn(T item){
        loader.loadOn(item, getX(), getY());
    }

    public Loader<T> getLoader(){return loader;}

}
