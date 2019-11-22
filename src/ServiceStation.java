public class ServiceStation<T extends Car> {
    VeichleStorage storage; //new VeichleStorage<Volvo240>(8, VeichleStorage.UnloadOrder.FirstInFirstOut);


    /*
    Frågor: Fixa/ LÄR MIG github, Kan man ha metoder speficikt till enum eller liknande (vill ha compile error) KANSKE HA GENEISK LISTA I VEICHLESTORAGE,
    hur ska vi göra med updatePositions/moveWithFlatbed
    Hur ska vi bedömma att något är för stort? räcker weight?
     */

    public ServiceStation(int maxCars){
        this.storage = new VeichleStorage<T>(maxCars, VeichleStorage.UnloadOrder.FirstInFirstOut);
    }

    public void loadCar(T car){
        storage.load(car);
    }

    public void unloadCar(){
        storage.unload();

    }

    ServiceStation test = new ServiceStation<Volvo240>(8);
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
