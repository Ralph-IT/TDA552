import java.awt.*;

/**
 * Class for a truck that transports cars
 */
public class CarTransportTruck extends Car {
    private Flatbed flatbed = new Flatbed();
    private VehicleStorage carStorage = new VehicleStorage(6, VehicleStorage.UnloadOrder.FirstInFirstOut);
    private State rampState = State.HIGH;

    /**
     * Enum for the angular state of the flatbed
     */
    private enum State{
        HIGH,
        LOW
    }

    public CarTransportTruck(String modelName) {
        super(2, 100, Color.blue, "Brunte", 5);
    }

    /**
     * Method for raising the ramp
     */
    public void raiseRamp(){
        rampState = State.HIGH;
        flatbed.setAngle(0);
    }

    /**
     * Method for lowering the ramp
     */
    public void lowerRamp(){ //Kanske göra till boolean? ger false om inte lyckas
        if(getCurrentSpeed() < 0.001) {
            rampState = State.LOW;
            flatbed.setAngle(-70);
        }
    }

    /**
     * Method for loading a car onto the flatbed
     * @param car the car that is being loaded onto the flatbed
     */
    public void loadCar(Car car){
        if(car.getSizeClass() < 4 && rampState == State.LOW && Math.abs(this.getX() - car.getX()) < 5 &&
                Math.abs(this.getY() - car.getY()) < 5 && car.isStored() == false){
            carStorage.load(car);
            car.setStored(true);
        }
    }

    /**
     * Method for unloading cars from the flatbed
     */
    public void unloadCar(){
        if(rampState == State.LOW && getCurrentSpeed() < 0.001){
            Car car = carStorage.unload();
            car.setY(getY() - 5);
        }
    }

    /**
     * Method that moves both the truck, and all the cars being transported on it
     */
    @Override
    public void move(){
        super.move();
        carStorage.updatePositions(getX(),getY());
    }

    /**
     * Method for the truck's speed factor
     * @return the truck's speed factor
     */
    public double speedFactor(){
        return getEnginePower() * 0.01;
    }

    public Flatbed getFlatbed() {
        return flatbed;
    }

    public VehicleStorage getCarStorage() {
        return carStorage;
    }
}
