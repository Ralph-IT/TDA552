public class VehicleFactory {

    public static Volvo240 createVolvo(){
        return new Volvo240();
    }

    public static Volvo240 createVolvo(int y){
        Volvo240 volvo = new Volvo240();
        volvo.setY(y);
        return volvo;

    }

    public static Saab95 createSaab(int y){
        Saab95 saab = new Saab95();
        saab.setY(y);
        return saab;
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
