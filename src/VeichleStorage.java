import java.util.ArrayList;
import java.util.List;

public class VeichleStorage {
    private int maxStorage;
    private List<Car> storedCars = new ArrayList<>(); //GENERISK LISTA


    public VeichleStorage(int maxStorage) {
        this.maxStorage = maxStorage;
    }


    public void load(Car car){
        storedCars.add(car);
    }

    public Car unload(){
        return storedCars.remove(storedCars.size() - 1); //Tar bort den senast inlaggda
    }

    public void updatePositions(double x, double y){ //använder setX och setY
        for(Car car : storedCars){
            car.setX(x);
            car.setY(y);
        }
    }

}