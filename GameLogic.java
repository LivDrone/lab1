import java.util.ArrayList;


public class GameLogic{
    // MoveLogic ml = new MoveLogic();
    PhysicsLogic pl = new PhysicsLogic();
    GameState gs;

    public GameLogic(GameState gs){
        this.gs = gs;

    }

    public void update(){
        for (Vehicle car : gs.getArraylist()){
            if(pl.inGarageTest(gs.volvoWorkshops, car)) {continue;}
            pl.turnAroundTest(car);
            car.move(); //ska till gamelogic
            pl.loadOnGarageIfClose(gs.volvoWorkshops, car);
        }
    }

}


//add cars?

//methods move