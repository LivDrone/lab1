import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class GameState {
    private final int delay = 50;
    private Timer timer = new Timer(delay, new TimerListener());
    private ArrayList<Vehicle> cars = new ArrayList<>();
    Garage volvoWorkshops;
    GameState gs;
    GameLogic gl;
    GameView gv;
    //PhysicsLogic pl;

    public GameState(){
        gs = this;
        gv = new GameView("Gamesim 2.0", gs);
        gl = new GameLogic(gs);
        //pl = new PhysicsLogic();
        volvoWorkshops = new Garage(Volvo240.class, 300, 300, 10, 7 );
        //pl.placeVehicles(cars);//TA bort??
        timer.start();
    }

    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gl.update();
            gv.drawPanel.repaint();
            //pl.placeVehicles(gs.getArraylist());
        }
    }

    public ArrayList<Vehicle> getArraylist(){return cars;}
}