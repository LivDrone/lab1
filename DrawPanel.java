import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;

// This panel represents the animated part of the view with the car images.

public class DrawPanel extends JPanel{

    Gamelogic logic;
    CarController cc;
    //ArrayList<Vehicle> vehicles;
    // Just a single image, TODO: Generalize
    BufferedImage vehicleImage;
    // To keep track of a single car's position
    Point vehiclePoint = new Point();

    //Do not change, we want a specific volvo workshop so it does not need to be generalized
    BufferedImage volvoWorkshopImage;
    Point volvoWorkshopPoint = new Point(300,300);

    // Initializes the panel and reads the images
    public DrawPanel(int x, int y, CarController cc) {
        this.cc = cc;
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(x, y));
        this.setBackground(Color.green);
        // Print an error message in case file is not found with a try/catch block
        try {
            // You can remove the "pics" part if running outside of IntelliJ and
            // everything is in the same main folder.
            // volvoImage = ImageIO.read(new File("Volvo240.jpg"));

            // Rememember to rightclick src New -> Package -> name: pics -> MOVE *.jpg to pics.
            // if you are starting in IntelliJ.
            //String image = wroom.getModelName();
            //vehicleImage = ImageIO.read(DrawPanel.class.getResourceAsStream("pics/Volvo240.jpg")); //"pics/Volvo240.jpg"
            volvoWorkshopImage = ImageIO.read(DrawPanel.class.getResourceAsStream("pics/VolvoBrand.jpg"));
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

        // TODO: Make this general for all cars
        void moveit(int x, int y){
            vehiclePoint.x = x;  // Kommentar: Gör points för vehicle koordinater och gör denna metod mer genrell.
            vehiclePoint.y = y;
        }

        public void carImages(ArrayList<Vehicle> vehicles, Graphics g){
            for (Vehicle v: vehicles){
                int i = 0;
                try {
                    vehicleImage = ImageIO.read(DrawPanel.class.getResourceAsStream(v.getImage()));
                    g.drawImage(vehicleImage, (int) v.getX(), (int) v.getY() + i, null);
                    i += 100;
                }catch (IOException ex)
                {
                    ex.printStackTrace();
                }
            }
            }

    // This method is called each time the panel updates/refreshes/repaints itself
    // TODO: Change to suit your needs.
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        carImages(cc.getArraylist(), g);
        //g.drawImage(vehicleImage, vehiclePoint.x, vehiclePoint.y, null);
        //g.drawImage(vehicleImage, vehiclePoint.x, vehiclePoint.y+100, null);
        //g.drawImage(vehicleImage, vehiclePoint.x, vehiclePoint.y+200, null);// see javadoc for more info on the parameters
        g.drawImage(volvoWorkshopImage, volvoWorkshopPoint.x, volvoWorkshopPoint.y, null);
    }
}
