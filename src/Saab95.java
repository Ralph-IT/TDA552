import java.awt.*;

/**
*Class for Saab95
 */
public class Saab95 extends Car{

    /**
     * True if turbo is on, otherwise false
     */
    public boolean turboOn;

    public Saab95(){
        super(2, 125, Color.red, "Saab95");
    }

    /**
     * Method that turns on the turbo function of the car
     */
    public void setTurboOn(){
	    turboOn = true;
    }

    /**
     * Method that turns off the turbo function of the car
     */
    public void setTurboOff(){
	    turboOn = false;
    }
    /**
     * Returns the Speed Factor of the car depending on the Engine power and trim factor of the car
     * @return
     */
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

}
