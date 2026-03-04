import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameController{

    GameState gs;
    GameView gv;
    MoveLogic ml = new MoveLogic(gs.getArraylist());
    //GameView frame;


    public GameController(GameView gv) {
        this.gv = gv;
        initComponants();
    }

    public void initComponants () {
        gv.gasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ml.gas(gs.gv.gasAmount);
            }
        });
        gs.gv.brakeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ml.brake(gs.gv.brakeAmount);
            }
        });
        gs.gv.turboOnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ml.saabTurboOn();
            }
        });
        gs.gv.liftBedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ml.scaniaLiftBed();
            }
        });
        gs.gv.turboOffButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ml.saabTurboOff();
            }
        });
        gs.gv.lowerBedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ml.lowerLiftBed();
            }
        });
        gs.gv.startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ml.startAllCars();
            }
        });
        gs.gv.stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ml.stopAllCars();
            }
        });
        gs.gv.turnLeftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ml.turnLeft();
            }
        });
        gs.gv.turnRightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ml.turnRight();
            }
        });
    }
}
