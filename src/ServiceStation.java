/**
 * Class for a car service station
 * @param <T> Typeparameter that extends the abstract class Car
 */
public class ServiceStation<T extends Car> {
    private VehicleStorage storage; //new VeichleStorage<Volvo240>(8, VeichleStorage.UnloadOrder.FirstInFirstOut);



    public ServiceStation(int maxCars){
        this.storage = new VehicleStorage<T>(maxCars, VehicleStorage.UnloadOrder.FirstInFirstOut);
    }

    /**
     * method for loading a car into the service station
     * @param car the car that needs service
     */
    public void loadCar(T car){
        storage.load(car);
    }

    /**
     * method for unloading a car from the service station
     */
    public void unloadCar(){
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
