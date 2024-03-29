package Modell;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for a vehicle storage
 * @param <T> Typeparameter that extends the abstract class Modell.Car
 */
public class VehicleStorage<T extends Vehicle> {
    private int maxStorage;
    private List<T> storedVehicle = new ArrayList<>(); //GENERISK LISTA
    private UnloadOrder unloadOrder;

    /**
     * Enum for the order in which the vehicles are unloaded from the storage
     */
    enum UnloadOrder{
        FirstInFirstOut, LastInFirstOut, Selected
    }

    public VehicleStorage(int maxStorage, UnloadOrder unloadOrder) {
        this.maxStorage = maxStorage;
        this.unloadOrder = unloadOrder;
    }

    /**
     * method for loading a vehicle into a storage
     * @param vehicle the car that is being loaded into the storage
     */
    public void load(T vehicle){
        if(!vehicle.isStored()) {
            storedVehicle.add(vehicle);
        }
    }

    /**
     * Method for unloading a vehicle out of the storage
     * @return the vehicle that is getting unloaded
     */
    public T unload(){
        if(unloadOrder == UnloadOrder.FirstInFirstOut) {
            return storedVehicle.remove(0);
        }
        else if(unloadOrder == UnloadOrder.LastInFirstOut){
            return storedVehicle.remove(storedVehicle.size() - 1);

        }
        else {
            return storedVehicle.remove(storedVehicle.size() - 1);
        }
    }

    /**
     * Method for updating the positions of the vehicles in the storage when the storage itself is on the move
     * @param x the storage's position on the x-axis
     * @param y the storage's position on the y-axis
     */
    public void updatePositions(double x, double y){ //använder setX och setY
        for(Vehicle vehicle : storedVehicle){
            vehicle.setX(x);
            vehicle.setY(y);
        }
    }

    public List<T> getStoredVehicle() {
        return storedVehicle;
    }


}