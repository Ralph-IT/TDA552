import static org.junit.Assert.*;
import org.junit.Test;

public class ScaniaTest {
    @Test
    public void raiseFlatbed() {
        Scania truck = new Scania();
        truck.startEngine();
        truck.gas(1);
        truck.raiseFlatbed();
        assertTrue(truck.getFlatbed().getAngle() < 0.001); //Vinkeln ska ej ökas medan lastbilen kör
        truck.stopEngine();
        truck.raiseFlatbed();
        assertTrue(truck.getFlatbed().getAngle() > 1.9);
    }

}