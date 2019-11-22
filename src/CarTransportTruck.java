import java.awt.*;

public class CarTransportTruck extends Car {
    Flatbed flatbed = new Flatbed();
    VeichleStorage carStorage = new VeichleStorage(6, VeichleStorage.UnloadOrder.FirstInFirstOut);
    State rampState = State.HIGH;
    enum State{
        HIGH,
        LOW
    }

    public CarTransportTruck(String modelName) {
        super(2, 100, Color.blue, "Brunte", 5);
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

    public void loadCar(Car car){ //Måste checka storleken / Lägga till Weight i Car
        if(car.getSizeClass() < 4 && rampState == State.LOW && Math.abs(this.getX() - car.getX()) < 5 && Math.abs(this.getY() - car.getY()) < 5){
            carStorage.load(car);
            car.setCargo(true);
        }
    }

    public void unloadCar(){
        if(rampState == State.LOW && getCurrentSpeed() < 0.001){
            Car car = carStorage.unload();
            car.setX(getX()); // behövs inte om bilarnas position är samma som CarTransportTrucken
            car.setY(getY() - 5);
        }
    }

    public void moveWithFlatbed(){
        move();
        carStorage.updatePositions(getX(),getY());
    }






    public double speedFactor(){
        return getEnginePower() * 0.01;
    }

}
