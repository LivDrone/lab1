import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.ArrayList;

public class GameView extends JFrame {
    private static final int X = 800;
    private static final int Y = 800;

    // The controller member
    GameView gv;
    Controller cont;
    DrawPanel drawPanel;
    GameController gc;
    ArrayList<Vehicle> cars;
    AvailableModels am;
    ArrayList<String> as;
    MoveLogic ml;

    //Knappar i spel
    JPanel controlPanel = new JPanel();
    JPanel gasPanel = new JPanel();
    JPanel modelPanel = new JPanel();
    JSpinner gasSpinner = new JSpinner();
    JSpinner modelSpinner = new JSpinner(); //Spinner för val bilmodel

    String model = "";
    int gasAmount = 0;
    int brakeAmount = 0;
    JLabel gasLabel = new JLabel("Amount of gas");
    JLabel modelLabel = new JLabel("Model");

    final JButton gasButton = new JButton("Gas");
    JButton brakeButton = new JButton("Brake");
    JButton turboOnButton = new JButton("Saab Turbo on");
    JButton turboOffButton = new JButton("Saab Turbo off");
    JButton liftBedButton = new JButton("Scania Lift Bed");
    JButton lowerBedButton = new JButton("Lower Lift Bed");

    JButton startButton = new JButton("Start all cars");
    JButton stopButton = new JButton("Stop all cars");
    JButton turnLeftButton = new JButton("Turn Left");
    JButton turnRightButton = new JButton("Turn Right");

    JButton addCarButton = new JButton("Add car");
    JButton removeCarButton = new JButton("Remove car");

    // Constructor
    public GameView(String framename, MoveLogic ml) {
        gv = this;
        this.ml = ml;
        this.drawPanel = new DrawPanel(X, Y - 240, this.cont);
        this.gc = new GameController(gv);
        this.cars = ml.getArraylist();
        this.am = new AvailableModels();
        this.as = am.getArrayList();
        initComponents(framename);
    }

    // Sets everything in place and fits everything
    private void initComponents(String title) {
        this.setTitle(title);
        this.setPreferredSize(new Dimension(X, Y));
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        this.add(drawPanel);

        //Spinner Gas/break
        SpinnerModel spinnerModel =
                new SpinnerNumberModel(0, //initial value
                        0, //min
                        100, //max
                        1);//step
        gasSpinner = new JSpinner(spinnerModel);
        gasSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                gasAmount = (int) ((JSpinner) e.getSource()).getValue();
                brakeAmount = (int) ((JSpinner) e.getSource()).getValue();
            }
        });

        //Spinner add car:model
        SpinnerModel listModel = new SpinnerListModel(as);
            modelSpinner = new JSpinner(listModel);
            modelSpinner.addChangeListener(new ChangeListener(){
                public void stateChanged (ChangeEvent e){
                    model = (String)((JSpinner) e.getSource()).getValue();
            }
        });
        //Layout spinner för gas/break
        gasPanel.setLayout(new BorderLayout());
        gasPanel.add(gasLabel, BorderLayout.WEST);
        gasPanel.add(gasSpinner, BorderLayout.AFTER_LINE_ENDS);
        this.add(gasPanel);

        //Layout spinner för modell
        modelPanel.setLayout(new BorderLayout());
        modelPanel.add(modelLabel, BorderLayout.WEST);
        modelPanel.add(modelSpinner, BorderLayout.AFTER_LINE_ENDS);
        this.add(modelPanel);

        controlPanel.setLayout(new GridLayout(2, 4));

        controlPanel.add(gasButton, 0);
        controlPanel.add(turboOnButton, 1);
        controlPanel.add(liftBedButton, 2);
        controlPanel.add(brakeButton, 3);
        controlPanel.add(turboOffButton, 4);
        controlPanel.add(lowerBedButton, 5);
        controlPanel.add(turnLeftButton, 6);
        controlPanel.add(turnRightButton, 7);
        controlPanel.add(addCarButton, 8);
        controlPanel.add(removeCarButton, 9);
        controlPanel.add(startButton, 10);
        controlPanel.add(stopButton, 11);


        controlPanel.setPreferredSize(new Dimension((X / 2) + 250, 200));
        this.add(controlPanel);
        controlPanel.setBackground(Color.CYAN);

        //Gamla knapper för start/stopp
/*
        startButton.setBackground(Color.blue);
        startButton.setForeground(Color.green);
        startButton.setPreferredSize(new Dimension(X / 5 - 15, 200));
        this.add(startButton);


        stopButton.setBackground(Color.red);
        stopButton.setForeground(Color.black);
        stopButton.setPreferredSize(new Dimension(X / 5 - 15, 200));
        this.add(stopButton);
*/
        // Make the frame pack all it's components by respecting the sizes if possible.
        this.pack();
        // Get the computer screen resolution
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        // Center the frame
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        // Make the frame visible
        this.setVisible(true);
        // Make sure the frame exits when "x" is pressed
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}