import java.awt.*;

/**
 * A class for Scania Trucks
 */

public class Scania extends Truck {

    public Scania() {
        super(2, 100, Color.red, "Scania", 4);
    }

    /**
     * Method for calculating the trucks speed factor using its engine power
     * @return the trucks speed factor
     */

    public double speedFactor(){
        if(getFlatbed().getAngle() == 0){
            return getEnginePower() * 0.01;
        }
        return 0;
    }

    /**
     * Raises the flatbed by increasing its angle
     */
    public void raiseFlatbed(){
        if(getFlatbed().getAngle() < 70 && getCurrentSpeed() < 0.001){
            getFlatbed().setAngle(getFlatbed().getAngle() + 2);
        }
    }

    /**
     * Lowers the flatbed by decreasing its angle
     */

    public void lowerFlatbed(){
        if(getFlatbed().getAngle() > 0 && getCurrentSpeed() < 0.001){
            getFlatbed().setAngle(getFlatbed().getAngle() - 2);
        }
    }

}
