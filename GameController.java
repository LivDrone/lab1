import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GameController {
    private final int delay = 50;
    private Timer timer = new Timer(delay, new CarController.TimerListener());
    ArrayList<Vehicle> cars = new ArrayList<>();
    Garage volvoWorkshops;
    GameLogic gl;
    GameView gv;

    public void GameController(GameLogic gl, GameView gv){
        this.gl = gl;
        this.gv = gv;

    }

    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (Vehicle car : cars) {
                gl.update();
                if(gamelogic.inGarageTest(volvoWorkshops, car)) {continue;}
                gamelogic.turnAroundTest(car);
                car.move(); //ska till gamelogic
                gv.drawPanel.repaint();
                gamelogic.loadOnGarageIfClose(volvoWorkshops, car, cars);
            }
        }
    }
    //Actionlisteners
        gv.gasButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cc.gas(gasAmount);
        }
    });
        brakeButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cc.brake(brakeAmount);
        }
    });
        turboOnButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {cc.saabTurboOn();
        }
    });
        liftBedButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cc.scaniaLiftBed();
        }
    });
        turboOffButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {cc.saabTurboOff();
        }
    });
        lowerBedButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cc.lowerLiftBed();
        }
    });
        startButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {cc.startAllCars();
        }
    });
        stopButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cc.stopAllCars();
        }
    });
        turnLeftButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cc.turnLeft();
        }
    });
        turnRightButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cc.turnRight();
        }
    });







}
