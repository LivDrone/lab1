import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameController{

    GameState gs;

    public GameController(GameState gs) {
        this.gs = gs;
    }

    public void initComp() {
        gs.gv.gasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gs.gl.ml.gas(gs.gv.gasAmount);
            }
        });
        gs.gv.brakeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gs.gl.ml.brake(gs.gv.brakeAmount);
            }
        });
        gs.gv.turboOnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gs.gl.ml.saabTurboOn();
            }
        });
        gs.gv.liftBedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gs.gl.ml.scaniaLiftBed();
            }
        });
        gs.gv.turboOffButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gs.gl.ml.saabTurboOff();
            }
        });
        gs.gv.lowerBedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gs.gl.ml.lowerLiftBed();
            }
        });
        gs.gv.startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gs.gl.ml.startAllCars();
            }
        });
        gs.gv.stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gs.gl.ml.stopAllCars();
            }
        });
        gs.gv.turnLeftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gs.gl.ml.turnLeft();
            }
        });
        gs.gv.turnRightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gs.gl.ml.turnRight();
            }
        });
    }
}
