import org.example.Main;
import org.junit.Test;
import static java.awt.AWTEventMulticaster.add;
import static org.example.Main.multiply;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddingTwoNumbers() {
        assertEquals(30, Main.add(15, 15));
        assertEquals(-5, Main.add(-3, -2));
    }

    @Test
    public void testAddingManyNumbers() {
        assertEquals(15, Main.add(1, 2, 3, 4, 5));
        assertEquals(20, Main.add(11, 9));
        assertEquals(-3, Main.add(-1, -2));
    }
    @Test
    public void testMultiplyingTwoNumbers() {
        assertEquals(8, multiply(2, 4));
        assertEquals(-3, multiply(-1, 3));
    }


    @Test
    public void testMultiplyingMultipleNumbers() {
        assertEquals(120, multiply(1, 2, 3, 4, 5));
        assertEquals(3, multiply(1, 3));
        assertEquals(-3, multiply(-1, 3));
    }
}
