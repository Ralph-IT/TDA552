import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

public class CarController {
    // member fields:

    // A list of cars, modify if needed
    CarView frame = new CarView("Potifar");
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    public CarController(){
        initListeners();
    }

    public void addCars(ArrayList<Vehicle> vehicleList){
        vehicles.addAll(vehicleList);
    }

    // Calls the gas method for each car once
    void gas(int amount) {
        double gas = ((double) amount) / 100;
        for (Vehicle vehicle : vehicles
                ) {
            vehicle.gas(gas);
        }
    }

    void brake(int amount) {
        double brake = ((double) amount) / 100;
        for (Vehicle vehicle : vehicles
        ) {
            vehicle.brake(brake);
        }
    }
    void turboOn() {
        for (Vehicle vehicle : vehicles) {
            if(vehicle instanceof Saab95){
                ((Saab95) vehicle).setTurboOn();
            }
        }
    }

    void turboOff() {
        for (Vehicle vehicle : vehicles) {
            if(vehicle instanceof Saab95){
                ((Saab95) vehicle).setTurboOff();
            }
        }
    }
    void liftBed() {
        for (Vehicle vehicle : vehicles) {
            if(vehicle instanceof Scania){
                ((Scania) vehicle).raiseFlatbed();
            }
        }
    }
    void lowerBed() {
        for (Vehicle vehicle : vehicles) {
            if(vehicle instanceof Scania){
                ((Scania) vehicle).lowerFlatbed();
            }
        }
    }
    void startAllCars(){
        for(Vehicle vehicle : vehicles){
            vehicle.startEngine();
        }
    }
    void stopAllCars(){
        for(Vehicle vehicle : vehicles){
            vehicle.stopEngine();
        }
    }

    void initListeners() {
        frame.gasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gas(frame.gasAmount);
            }
        });
        frame.brakeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                brake(frame.gasAmount);
            }
        });
        frame.turboOnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                turboOn();
            }
        });
        frame.turboOffButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                turboOff();
            }
        });
        frame.liftBedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liftBed();
            }
        });
        frame.lowerBedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lowerBed();
            }
        });
        frame.startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startAllCars();
            }
        });
        frame.stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stopAllCars();
            }
        });

    }
}