
public class GameLogic{
    PhysicsLogic pl = new PhysicsLogic();
    Controller cont;

    public GameLogic(Controller cont){
        this.cont = cont;

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
