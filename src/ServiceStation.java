/**
 * Class for a car service station
 * @param <T> Typeparameter that extends the abstract class Car
 */
public class ServiceStation<T extends Vehicle> {
    private VehicleStorage storage; //new VeichleStorage<Volvo240>(8, VeichleStorage.UnloadOrder.FirstInFirstOut);



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
        ServiceStation<Volvo240> test = new ServiceStation<>(8);
        test.loadCar(new Volvo240());
        test.loadCar(new Saab95());

        VeichleStorage<Volvo240> test2 = new VeichleStorage<Volvo240>(8, VeichleStorage.UnloadOrder.FirstInFirstOut);
        test2.load(new Saab95());
    }

     */




}
