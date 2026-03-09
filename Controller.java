import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//State/Controller
public class Controller {
    private final int delay = 50;
    private Timer timer = new Timer(delay, new TimerListener());
    //private ArrayList<Vehicle> cars = new ArrayList<>();
    Garage volvoWorkshops;
    Controller gs;
    GameLogic gl;
    GameView gv;
    MoveLogic ml;


    //Constructor gamestate
    public Controller(){
        gs = this;
        ml = new MoveLogic();
        gv = new GameView("Gamesim 2.0", ml);
        gl = new GameLogic(gs, ml);
        volvoWorkshops = new Garage(Volvo240.class, 300, 300, 10, 7 );
        timer.start();
    }

    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gl.update();
            gv.drawPanel.repaint();
        }
    }

    //public ArrayList<Vehicle> getArraylist(){return cars;}
}