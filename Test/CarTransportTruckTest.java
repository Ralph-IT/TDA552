/*import static org.junit.Assert.*;
import org.junit.Test;
public class CarTransportTruckTest {
    @Test
    public void lowerRampAndRaiseRamp() {
        CarTransportTruck transportTruck = new CarTransportTruck("Lamborghini");
        assertTrue(transportTruck.getFlatbed().getAngle() < 0.001);
        transportTruck.raiseFlatbed();
        assertTrue(transportTruck.getFlatbed().getAngle() > 69.9);
        transportTruck.lowerFlatbed();
        assertTrue(transportTruck.getFlatbed().getAngle() < 0.001);

    }

   @Test
    public void loadCar() {
        CarTransportTruck transportTruck = new CarTransportTruck("Lamborghini");
        transportTruck.loadCar(new CarTransportTruck());
        assertTrue(transportTruck.getCarStorage().getStoredVehicle().size() == 0); //Ska INTE ha lastat in transportLast
        transportTruck.loadCar(new Volvo240());
        assertTrue(transportTruck.getCarStorage().getStoredVehicle().size() == 0); //Rampen är inte nere
        transportTruck.lowerFlatbed();
        transportTruck.loadCar(new Volvo240());
        assertTrue(transportTruck.getCarStorage().getStoredVehicle().size() == 1); //Nu ska den laddas


    }

    @Test
    public void unloadCar() {
        CarTransportTruck transportTruck = new CarTransportTruck("McLaren");
        transportTruck.lowerFlatbed();
        transportTruck.loadCar(new Volvo240());
        transportTruck.startEngine();
        transportTruck.gas(1);
        transportTruck.unloadCar();
        assertTrue(transportTruck.getCarStorage().getStoredVehicle().size() == 1); //Bilen ska INTE lastas av
        transportTruck.stopEngine();
        transportTruck.unloadCar();
        assertTrue(transportTruck.getCarStorage().getStoredVehicle().size() == 0); //Bilen ska INTE lastas av


    }

    @Test
    public void moveWithFlatbed() {
        CarTransportTruck transportTruck = new CarTransportTruck("Bugatti");
        transportTruck.lowerFlatbed();
        Volvo240 volvo = new Volvo240();
        transportTruck.loadCar(volvo);
        transportTruck.startEngine();
        transportTruck.gas(1);
        transportTruck.move();
        assertTrue(transportTruck.getX() > volvo.getX() - 0.001);
        assertTrue(transportTruck.getY() < volvo.getY() + 0.001);
    }
}*/