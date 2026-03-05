
public class GameLogic{
    PhysicsLogic pl = new PhysicsLogic();
    GameState gs;

    public GameLogic(GameState gs){
        this.gs = gs;

    }

    public void update(){
        for (Vehicle car : gs.getArraylist()){
            if(pl.inGarageTest(gs.volvoWorkshops, car)) {continue;}
            pl.turnAroundTest(car);
            car.move();
            pl.loadOnGarageIfClose(gs.volvoWorkshops, car);
        }
    }
}
