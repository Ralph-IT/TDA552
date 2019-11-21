import java.awt.*;

public class CarTransportTruck extends Car {
    Flatbed flatbed = new Flatbed();
    VeichleStorage cars = new VeichleStorage(8);
    State rampState = State.HIGH;
    enum State{
        HIGH,
        LOW
    }

    public CarTransportTruck(int nrDoors, double enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
    }

    public void raiseRamp(){
        rampState = State.HIGH;
        flatbed.setAngle(0);
    }
    public void lowerRamp(){ //Kanske göra till boolean? ger false om inte lyckas
        if(getCurrentSpeed() < 0.001) {
            rampState = State.LOW;
            flatbed.setAngle(-70);
        }
    }

    public void loadCar(Car car, double weight){ //Måste checka storleken / Lägga till Weight i Car
        if(weight < 5000 && rampState == State.LOW && Math.abs(this.getX() - car.getX()) < 5 && Math.abs(this.getY() - car.getY()) < 5){
            cars.load(car);
        }
    }

    public void unloadCar(){
        if(rampState == State.LOW && getCurrentSpeed() < 0.001){
            Car car = cars.unload();
            car.setX(getX()); // behövs inte om bilarnas position är samma som CarTransportTrucken
            car.setY(getY() - 5);
        }
    }

    public void moveWithFlatbed(){
        move();
        cars.updatePositions(getX(),getY());
    }






    public double speedFactor(){
        return getEnginePower() * 0.01;
    }

}
