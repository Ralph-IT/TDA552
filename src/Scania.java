import java.awt.*;

/**
 * A class for Scania Trucks
 */

public class Scania extends Car {
    Flatbed flatbed = new Flatbed();

    public Scania(int nrDoors, double enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
    }



    public double speedFactor(){
        return getEnginePower() * 0.01;
    }

    /**
     * Raises the flatbed by increasing its angle
     */
    public void raiseFlatbed(){
        if(flatbed.getAngle() < 70 && getCurrentSpeed() < 0.001){
            flatbed.setAngle(flatbed.getAngle() + 2);
        }
    }

    /**
     * Lowers the flatbed by decreasing its angle
     */

    public void lowerFlatbed(){
        if(flatbed.getAngle() > 0 && getCurrentSpeed() < 0.001){
            flatbed.setAngle(flatbed.getAngle() - 2);
        }
    }
}
