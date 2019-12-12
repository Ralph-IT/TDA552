import java.awt.*;

public abstract class Truck extends Vehicle {
    private Flatbed flatbed = new Flatbed();

    public Truck(int nrDoors, double enginePower, Color color, String modelName, int sizeClass) {
        super(nrDoors, enginePower, color, modelName, sizeClass);
    }

    /**
     * An abstract method to be inherited by subclasses
     *
     * @return nada
     */
    abstract double speedFactor();

    abstract void raiseFlatbed();

    abstract void lowerFlatbed();

    public Flatbed getFlatbed() {
        return flatbed;
    }
}
