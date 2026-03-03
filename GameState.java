import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class GameState {
    private final int delay = 50;
    private Timer timer = new Timer(delay, new TimerListener());
    ArrayList<Vehicle> cars = new ArrayList<>();
    Garage volvoWorkshops;
    GameLogic gl;
    GameView gv;
    GameController gc;
    GameState gs;

    public GameState(){
        gs = this;
        gl = new GameLogic(gs);
        gc = new GameController(gs);
        gv = new GameView("Gamesim 2.0", gs);
    }

    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gl.update();
            gv.drawPanel.repaint();
        }
    }

    public ArrayList<Vehicle> getArraylist(){return cars;}
}