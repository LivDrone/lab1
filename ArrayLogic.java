import java.util.ArrayList;

public class ArrayLogic<T> {

    private Class<T> allowedType;
    private ArrayList<T> items;

    public ArrayLogic(Class<T> allowedType, ArrayList<T> items){
        this.allowedType = allowedType;
        this.items = items;
    }
}
