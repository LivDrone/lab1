import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Logik för kopplig mellan knappar och logik/metoder
public class GameController{

    GameState gs;
    GameView gv;
    MoveLogic ml;
    ArrayLogic al;
    PhysicsLogic pl;

    public GameController(GameState gs, GameView gv) {
        this.gs = gs;
        this.gv = gv;
        this.ml = new MoveLogic(gs.getArraylist());
        this.al = new ArrayLogic(gs.getArraylist());
        this.pl = new PhysicsLogic();
        initComponants();
    }

    //Actionslisteners för JFrame knapper samt delegering till metoder att kalla för knapparna.
    public void initComponants () {
        gv.gasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ml.gas(gv.gasAmount);
            }
        });
        gv.brakeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ml.brake(gv.brakeAmount);
            }
        });
        gv.turboOnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ml.saabTurboOn();
            }
        });
        gv.liftBedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ml.scaniaLiftBed();
            }
        });
        gv.turboOffButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ml.saabTurboOff();
            }
        });
        gv.lowerBedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ml.lowerLiftBed();
            }
        });
        gv.startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ml.startAllCars();
            }
        });
        gv.stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ml.stopAllCars();
            }
        });
        gv.turnLeftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ml.turnLeft();
            }
        });
        gv.turnRightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ml.turnRight();
            }
        }); /////////////////
        gv.addCarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                al.addCar(gv.model);
                pl.placeVehicle(gs.getArraylist());
            }
        });/////////////////
        gv.removeCarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                al.removeCar();
            }
        });
    }
}
