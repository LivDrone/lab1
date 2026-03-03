import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {

    CarController cc = new CarController();
    private final int delay = 50;// The delay (ms) corresponds to 20 updates a sec (hz)
    private Timer timer = new Timer(delay, new TimerListener());// The timer is started with a listener (see below) that executes the statements// each step between delays.
    CarView frame;// The frame that represents this instance View of the MVC pattern
    ArrayList<Vehicle> cars = new ArrayList<>(); //List for cars in game
    Garage volvoWorkshops;
    Gamelogic gamelogic;



    public void main(String[] args) {// Instance of this class

        cc.volvoWorkshops = new Garage(Volvo240.class, 300, 300, 10, 7 );
        cc.gamelogic = new Gamelogic();// Start a new view and send a reference of self
        cc.frame = new CarView("CarSim 1.0", cc);
        //Cars in game:
        cc.cars.add(new Volvo240());
        cc.cars.add(new Volvo240());
        cc.cars.add(new Saab95());
        cc.cars.add(new Scania());
        cc.cars.add(new Scania());
        cc.gamelogic.placeVehicles(cc.cars);
        timer.start();// Start the timer
    }

        private class TimerListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                for (Vehicle car : cars) {
                    if(gamelogic.inGarageTest(volvoWorkshops, car)) {continue;}
                    gamelogic.turnAroundTest(car);
                    car.move();
                    frame.drawPanel.repaint();
                    gamelogic.loadOnGarageIfClose(volvoWorkshops, car, cars);
                }
            }
        }




}


