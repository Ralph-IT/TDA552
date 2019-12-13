package Modell;

/**
 * Class for a car service station
 * @param <T> Typeparameter that extends the abstract class Modell.Car
 */
public class ServiceStation<T extends Vehicle> {
    private VehicleStorage storage; //new VeichleStorage<Modell.Volvo240>(8, VeichleStorage.UnloadOrder.FirstInFirstOut);



    public ServiceStation(int maxVehicles){
        this.storage = new VehicleStorage<T>(maxVehicles, VehicleStorage.UnloadOrder.FirstInFirstOut);
    }

    /**
     * method for loading a car into the service station
     * @param vehicle the car that needs service
     */
    public void loadVehicle(T vehicle){
        storage.load(vehicle);
    }

    /**
     * method for unloading a car from the service station
     */
    public void unloadVehicle(){
        storage.unload();

    }

    /*
    public static void main(String[] args){
        Modell.ServiceStation<Modell.Volvo240> test = new Modell.ServiceStation<>(8);
        test.loadCar(new Modell.Volvo240());
        test.loadCar(new Modell.Saab95());

        VeichleStorage<Modell.Volvo240> test2 = new VeichleStorage<Modell.Volvo240>(8, VeichleStorage.UnloadOrder.FirstInFirstOut);
        test2.load(new Modell.Saab95());
    }

     */




}
