public class ServiceStation {
    VeichleStorage storage;
    Type stationType;

    enum Type{
        ALL, //Kan man göra metoder specifika till enums?
        VOLVO
    }

    /*
    Frågor: Fixa/ LÄR MIG github, Kan man ha metoder speficikt till enum eller liknande (vill ha compile error) KANSKE HA GENEISK LISTA I VEICHLESTORAGE,
    hur ska vi göra med updatePositions/moveWithFlatbed
    Hur ska vi bedömma att något är för stort? räcker weight?

     */

    public ServiceStation(int maxCars, Type type){
        this.storage = new VeichleStorage(maxCars);
        stationType = type;
    }

    public void loadCar(Car car){
        if(stationType == Type.VOLVO && car instanceof Volvo240){
            storage.load(car);
        }
        else if(stationType == Type.ALL){
            storage.load(car);
        }
    }
    public void loadCar(Volvo240 volvo){

    }



}
