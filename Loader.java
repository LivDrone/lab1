import java.util.ArrayDeque;

public class Loader<T extends Vehicle> implements Loadable<T> {

    public ArrayDeque<T> loaded = new ArrayDeque<>();
    public int capacity;
    public int maxSize;
    private boolean pickUp = false;

    public Loader(int capacity, int maxSize) { //Konstruktor
        this.capacity = capacity; //amount of loadable items
        this.maxSize = maxSize; //Size of the loadable items
    }

    private boolean calcDist(T item, double x, double y) {
        double deltaX = Math.abs(item.getX() - x);
        double deltaY = Math.abs(item.getY() - y);

        if (deltaX < 3 && deltaY < 3) {
            pickUp = true;
        } else {
            pickUp = false;
        }

        /*if ((Math.abs(x2)-Math.abs(x1)>3) && (Math.abs(y2)-Math.abs(y1))>3){
            pickUp=false;
        }
        if((Math.abs(x2)-Math.abs(x1)<3) && (Math.abs(y2)-Math.abs(y1))<3){
            pickUp=true;*/

        return pickUp;
    }




    public void updatePos(double x, double y){
       for (T v: loaded){
           v.setX(x);
           v.setY(y);
       }
    }

    @Override
    public void loadOn(T item, double x, double y) {
        boolean calc = calcDist(item, x,y);
        if (loaded.size() < capacity && item.getSize() <= maxSize && calc) {
            loaded.add(item);
        }
    }

    @Override
    public T loadOff() {
        if (!loaded.isEmpty()) {
            return loaded.removeLast();
        }
        return null;

    }

    public ArrayDeque<T> getLoaded(){return loaded;}

}
