import java.awt.*;
/**
*Abstract class that holds common variables and methods shared by subclasses Volvo240 and Saab95
 */
public abstract class Car extends Vehicle {

    public Car(int nrDoors, double enginePower, Color color, String modelName, int sizeClass) {
        super(nrDoors, enginePower, color, modelName, sizeClass);
    }

    /**
     * An abstract method to be inherited by subclasses
     *
     * @return nada
     */
    abstract double speedFactor();

}