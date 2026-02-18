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
    BufferedImage vehicleImage;

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
            volvoWorkshopImage = ImageIO.read(DrawPanel.class.getResourceAsStream("pics/VolvoBrand.jpg"));
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }


        public void carImages(ArrayList<Vehicle> vehicles, Graphics g){
            for (Vehicle v: vehicles){
                try {
                    vehicleImage = ImageIO.read(DrawPanel.class.getResourceAsStream(v.getImage()));
                    g.drawImage(vehicleImage, (int) v.getX(), (int) v.getY(), null);
                }
                catch (IOException ex)
                {
                    ex.printStackTrace();
                }
            }
        }

    // This method is called each time the panel updates/refreshes/repaints itself
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        carImages(cc.getArraylist(), g);
        g.drawImage(volvoWorkshopImage, volvoWorkshopPoint.x, volvoWorkshopPoint.y, null);
    }
}
