import java.util.ArrayList;

public class availableModels {
    String saab = "Saab95";
    String volvo = "Volvo240";
    String scania = "Scania";
    ArrayList<String> modelName;

    public availableModels(){
        this.modelName= new ArrayList<>();
        modelName.add(saab);
        modelName.add(volvo);
        modelName.add(scania);
    }
}

