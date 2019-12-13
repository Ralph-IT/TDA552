package Modell;

import java.awt.*;
/**
*Class for Modell.Volvo240
 */
public class Volvo240 extends Car{

    /**
     * The car's Trim Factor
     */
    private final static double trimFactor = 1.25;
    
    public Volvo240(){
        super(4, 100, Color.black, "Modell.Volvo240", 3);
    }

    /**
     * Returns the Speed Factor of the car depending on the Engine power and trim factor of the car
     * @return
     */
    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

}
