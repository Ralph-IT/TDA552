import org.junit.Test;

import static org.junit.Assert.*;

public class Volvo240Test {

    @Test
    public void speedFactor() {
        Volvo240 car = new Volvo240();
        assertTrue(car.getEnginePower() * 0.01 * 1.25 > 1.24 && car.getEnginePower() * 0.01 * 1.25 < 1.26);
    }
}