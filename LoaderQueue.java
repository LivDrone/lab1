import java.util.ArrayDeque;

public class LoaderQueue<T extends Vehicle> implements Loadable<T> {

    public ArrayDeque<T> loaded = new ArrayDeque<>();
    private T item;
    public int capacity;
    public int maxSize;
    private boolean pickUp = false;

    public LoaderQueue(int capacity, int maxSize) { //Konstruktor
        this.capacity = capacity; //amount of loadable items
        this.maxSize = maxSize; //Size of the loadable items
    }

    private boolean dist(){
        double y1= item.getY();
        double x1 = item.getX();
        double y2 = dest.getY();
        double x2 = dest.getX();

        if ((Math.abs(x2)-Math.abs(x1)>3)&&(Math.abs(y2)-Math.abs(y1))>3){
            pickUp=false;
        }
        if((Math.abs(x2)-Math.abs(x1)<3)&&(Math.abs(y2)-Math.abs(y1))<3){
            pickUp=true;
        }
        return pickUp;

    }

    @Override
    public void loadOn(T item) {
        boolean calc = dist();

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

}
