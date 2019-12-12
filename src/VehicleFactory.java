public class VehicleFactory {

    public static Volvo240 createVolvo(){
        return new Volvo240();
    }
    public static Saab95 createSaab(){
        return new Saab95();
    }
    public static Scania createScania(){
        return new Scania();
    }
    public static CarTransportTruck createTransportTruck(){
        return new CarTransportTruck();
    }
}