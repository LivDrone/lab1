import java.util.ArrayList;

public class Loader<T extends Car> implements Loadable<T>{

    private ArrayList<T> loaded = new ArrayList<>();
    private T item;
    public int capacity;
    public int maxSize;
    int counter = 0;//Counter for loaded items

    public Loader(T item, int capacity, int maxSize) { //Konstruktor
        this.item = item;
        this.capacity = capacity; //amount of loadable items
        this.maxSize = maxSize; //Size of the loadable items
    }

    @Override
    public void loadOn(T item){
        if (counter < capacity && item.getSize() <= maxSize){
            loaded.add(item);
            counter += 1;
        }
    }

    @Override
    public void loadOff(T item){
        loaded.remove(item);
        counter -= 1;
    }




}
