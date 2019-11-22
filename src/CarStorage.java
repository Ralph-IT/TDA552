import java.util.ArrayList;
import java.util.List;

/**
 * Class for a car storage
 */
public class CarStorage {
    /**
     * Enum for what order the storage should be emptied
     */
    enum UnloadOrder{
        FirstInFirstOut, LastInFirstOut, Selected;
    }
    private final int maxSpaces;
    UnloadOrder unloadOrder;
    List<Car> storedCars = new ArrayList<>();

    public CarStorage(int maxSpaces, UnloadOrder unloadOrder) {
        this.maxSpaces = maxSpaces;
        this.unloadOrder = unloadOrder;
    }

    /**
     * Method for loading another car into the storage
     * @param car the car that is being loaded into the storage
     */
    public void load(Car car){
        storedCars.add(car);
    }

    /**
     * Method for taking a car out of the storage
     * @return the car that is being unloaded from the storage
     */
    public Car unload(){
        if(unloadOrder == UnloadOrder.FirstInFirstOut){
            return storedCars.remove(0);
        }
        else if( unloadOrder == UnloadOrder.LastInFirstOut){
            return storedCars.remove(storedCars.size()-1);
        }
        else{
            return storedCars.remove(0);
        }
    }

    /**
     * method for updating the positions of the vehicles in a moving storage
     * @param x the storages position on the x-axis
     * @param y the storages position on the y-axis
     */
    public void updatePositions(double x, double y){
        for(Car car : storedCars){
            car.setX(x);
            car.setY(y);
        }
    }
}
