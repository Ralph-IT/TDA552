package View;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.*;

// This panel represent the animated part of the view with the car images.

public class DrawPanel extends JPanel{



    // Just a single image, TODO: Generalize
    private BufferedImage volvoImage;
    private BufferedImage saabImage;
    private BufferedImage scaniaImage;

    private ArrayList<Point> positions = new ArrayList<>();
    private ArrayList<String> modelNames = new ArrayList<>();
    private Map<String, BufferedImage> imageMap;


    // TODO: Make this genereal for all cars
    public void moveIt(double x, double y, String modelName){
        positions.add(new Point((int) x, (int) y));
        modelNames.add(modelName);
    }

    // Initializes the panel and reads the images
    public DrawPanel(int x, int y) {
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(x, y));
        this.setBackground(Color.green);
        // Print an error message in case file is not found with a try/catch block
        try {
            // You can remove the "View.pics" part if running outside of IntelliJ and
            // everything is in the same main folder.
            // volvoImage = ImageIO.read(new File("Modell.Volvo240.jpg"));

            // Rememember to rightclick src New -> Package -> name: View.pics -> MOVE *.jpg to View.pics.
            // if you are starting in IntelliJ.
            volvoImage = ImageIO.read(DrawPanel.class.getResourceAsStream("pics/Volvo240.jpg"));
            saabImage = ImageIO.read(DrawPanel.class.getResourceAsStream("pics/Saab95.jpg"));
            scaniaImage = ImageIO.read(DrawPanel.class.getResourceAsStream("pics/Scania.jpg"));
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
        imageMap = new HashMap<>(){{
            put("Modell.Volvo240", volvoImage);
            put("Modell.Saab95", saabImage);
            put("Modell.Scania", scaniaImage);
        }};

    }

    // This method is called each time the panel updates/refreshes/repaints itself
    // TODO: Change to suit your needs.
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        /*g.drawImage(volvoImage, volvoPoint.x, volvoPoint.y, null); // see javadoc for more info on the parameters
        g.drawImage(saabImage, saabPoint.x, saabPoint.y, null);
        g.drawImage(scaniaImage, scaniaPoint.x, scaniaPoint.y, null);
         */

        for(int i = 0; i < positions.size(); i++){
            g.drawImage(imageMap.get(modelNames.get(i)), (int)positions.get(i).getX(), (int)positions.get(i).getY(), null);
        }
        modelNames.clear();
        positions.clear();
    }
}
