
public class GameLogic{
    PhysicsLogic pl = new PhysicsLogic();
    Controller cont;
    MoveLogic ml;

    public GameLogic(Controller cont, MoveLogic ml){
        this.cont = cont;
        this.ml = ml;
    }

    public void update(){
        for (Vehicle car : ml.getArraylist()){
            if(pl.inGarageTest(cont.volvoWorkshops, car)) {continue;}
            pl.turnAroundTest(car);
            car.move();
            pl.loadOnGarageIfClose(cont.volvoWorkshops, car);
        }
    }
}
