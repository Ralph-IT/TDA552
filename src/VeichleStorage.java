import java.util.ArrayList;
import java.util.List;

public class VeichleStorage<T extends Car> {
    private int maxStorage;
    private List<T> storedVeichle = new ArrayList<>(); //GENERISK LISTA
    private UnloadOrder unloadOrder;

    enum UnloadOrder{
        FirstInFirstOut, LastInFirstOut, Selected
    }




    public VeichleStorage(int maxStorage, UnloadOrder unloadOrder) {
        this.maxStorage = maxStorage;
        this.unloadOrder = unloadOrder;
    }


    public void load(T car){
        storedVeichle.add(car);
    }

    public T unload(){
        if(unloadOrder == UnloadOrder.FirstInFirstOut) {
            return storedVeichle.remove(0);
        }
        else if(unloadOrder == UnloadOrder.LastInFirstOut){
            return storedVeichle.remove(storedVeichle.size() - 1);

        }
        else {
            return storedVeichle.remove(storedVeichle.size() - 1);
        }
    }

    public void updatePositions(double x, double y){ //använder setX och setY
        for(Car car : storedVeichle){
            car.setX(x);
            car.setY(y);
        }
    }

    /*
    Sista punkten
    Size/fixa så truck inte kan loada trucks
    Bilar kan inte köra medan de är pålastade.

     */

}