import org.junit.Test;

import static org.junit.Assert.*;

public class Saab95Test {

    @Test
    public void speedFactor() {
        Saab95 car = new Saab95();
        double turbo = 1;
        if(car.turboOn) turbo = 1.3;
        assertTrue(car.getEnginePower() * 0.01 * turbo > 1.24 && car.getEnginePower() * 0.01 * turbo < 1.26);
    }
}