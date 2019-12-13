import Modell.Saab95;
import Modell.Volvo240;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void startEngine() {
        Volvo240 car = new Volvo240();
        car.startEngine();
        assertTrue(car.getCurrentSpeed() == 1);
    }

    @Test
    public void stopEngine() {
        Volvo240 car = new Volvo240();
        car.startEngine();
        car.stopEngine();
        assertTrue(car.getCurrentSpeed() == 0);

    }

    @Test
    public void move() {
        Volvo240 car1 = new Volvo240();
        car1.startEngine();
        car1.move();
        assertTrue(0.9 < car1.getY() && 1.1 > car1.getY());

    }

    @Test
    public void turnLeft() {
        Saab95 car2 = new Saab95();
        car2.turnLeft();
        assertEquals(car2.getDirection(),1);
    }

    @Test
    public void turnRight() {
        Saab95 car3 = new Saab95();
        car3.turnRight();
        assertEquals(car3.getDirection(),3);
    }

    @Test
    public void gas() {
        Volvo240 car = new Volvo240();
        car.startEngine();
        car.gas(1.1);
        assertTrue(car.getCurrentSpeed() == 1);
        car.gas(0.3);
        assertTrue(car.getCurrentSpeed() > 1.374 && car.getCurrentSpeed() < 1.376);
    }

    @Test
    public void brake() {
        Saab95 car = new Saab95();
        car.startEngine();
        car.brake(1.1);
        assertTrue(car.getCurrentSpeed() == 1);
        car.brake(0.3);
        assertTrue(car.getCurrentSpeed() > 0.624 && car.getCurrentSpeed() < 0.626);
    }
}