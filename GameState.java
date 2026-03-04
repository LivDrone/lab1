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
    GameController gc;



    public GameState(){
        gs = this;
        gv = new GameView("Gamesim 2.0", gs);
        gl = new GameLogic(gs);



        volvoWorkshops = new Garage(Volvo240.class, 300, 300, 10, 7 );

        cars.add(new Volvo240());
        cars.add(new Volvo240());
        cars.add(new Saab95());
        cars.add(new Scania());
        cars.add(new Scania());
        cars.add(new Saab95());
        cars.add(new Scania());
        cars.add(new Scania());
        gl.pl.placeVehicles(cars);

        timer.start();


    }

    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gl.update();
            gv.drawPanel.repaint();
        }
    }

    public ArrayList<Vehicle> getArraylist(){return cars;}
}