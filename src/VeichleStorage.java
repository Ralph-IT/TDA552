import java.util.ArrayList;
import java.util.List;

public class VeichleStorage {
    private int maxStorage;
    private List<Car> storedCars = new ArrayList<>(); //GENERISK LISTA
    private UnloadOrder unloadOrder;

    enum UnloadOrder{
        FirstInFirstOut, LastInFirstOut, Selected
    }




    public VeichleStorage(int maxStorage, UnloadOrder unloadOrder) {
        this.maxStorage = maxStorage;
        this.unloadOrder = unloadOrder;
    }


    public void load(Car car){
        storedCars.add(car);
    }

    public Car unload(){
        if(unloadOrder == UnloadOrder.FirstInFirstOut) {
            return storedCars.remove(0);
        }
        else if(unloadOrder == UnloadOrder.LastInFirstOut){
            return storedCars.remove(storedCars.size() - 1);

        }
        else {
            return storedCars.remove(storedCars.size() - 1);
        }
    }

    public void updatePositions(double x, double y){ //använder setX och setY
        for(Car car : storedCars){
            car.setX(x);
            car.setY(y);
        }
    }

}