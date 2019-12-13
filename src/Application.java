import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Application {
    // member fields:

    // The delay (ms) corresponds to 20 updates a sec (hz)
    private final int delay = 50;
    // The timer is started with an listener (see below) that executes the statements
    // each step between delays.
    private Timer timer = new Timer(delay, new Application.TimerListener());

    CarController cc;

    // A list of cars, modify if needed
    ArrayList<Vehicle> vehicles;


    public CarController getCc() {
        return cc;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public Application(CarController cc) {
        this.cc = cc;
    }

    //methods:

    public static void main(String[] args) {
        // Instance of this class
        Application app = new Application(new CarController());
        app.vehicles = app.cc.vehicles;

        app.vehicles.add(VehicleFactory.createVolvo());
        Saab95 saab = VehicleFactory.createSaab();
        saab.setY(100);
        app.vehicles.add(saab);
        Scania scania = VehicleFactory.createScania();
        scania.setY(200);
        app.vehicles.add(scania);


        // Start the timer
        app.timer.start();
    }

    /* Each step the TimerListener moves all the cars in the list and tells the
     * view to update its images. Change this method to your needs.
     */
    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (Vehicle vehicle : vehicles) {
                vehicle.move();
                if(vehicle.getX() > 685 || vehicle.getX() < 0 || vehicle.getY() > 350 || vehicle.getY() < 0){
                    vehicle.setDirection(vehicle.getDirection() + 2);
                }
                cc.frame.drawPanel.moveIt(vehicle.getX(), vehicle.getY(), vehicle.getModelName());
                cc.frame.addLabel(vehicle.getModelName(), vehicle.getCurrentSpeed());
                // repaint() calls the paintComponent method of the panel
            }
            cc.frame.drawPanel.repaint();
            cc.frame.updateSpeedLabels();

        }
    }

}
