import java.util.ArrayList;


public class GameLogic{
    MoveLogic ml = new MoveLogic();
    PhysicsLogic pl = new PhysicsLogic();
    GameState gs;

    public GameLogic(GameState gc){
        this.gs = gc;

    }

    public void update(){
        for (Vehicle car : gs.cars){
            if(pl.inGarageTest(gs.volvoWorkshops, car)) {continue;}
            pl.turnAroundTest(car);
            car.move(); //ska till gamelogic
            pl.loadOnGarageIfClose(gs.volvoWorkshops, car, gs.cars);
        }
    }

}


//add cars?

//methods move