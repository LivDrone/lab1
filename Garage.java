abstract class Garage<T extends Vehicle> {

    private Loader<T> loader;
    private double xPos;
    private double yPos;

    public Garage(double xPos, double yPos, int capacity, int maxSize) { //Constructor
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

    public T loadOff(String modelName) {

        for (T v: loader.loaded) {
            if (v.getModelName().equals(modelName)) {
                loader.loaded.remove(v);
                return v;
            }
        }
        return null;
    }

    public void loadOn(T item){
        loader.loadOn(item, getX(), getY());
    }

}
