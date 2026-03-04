import java.util.ArrayList;

public class AvailableModels {

    private ArrayList<String> modelName;

    public AvailableModels(){
        this.modelName = new ArrayList<String>();
        modelName.add("Saab95");
        modelName.add("Volvo240");
        modelName.add("Scania");

    }

    public ArrayList<String> getArrayList(){return modelName;}
}

