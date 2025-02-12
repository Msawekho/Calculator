import org.example.Main;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddingTwoNumbers() {
        // Arrange
        int num1 = 15;
        int num2 = 15;

        // Act
        int result = Main.add(num1, num2);

        // Assert
        assertEquals(30, result);

        // Arrange
        num1 = -3;
        num2 = -2;

        // Act
        result = Main.add(num1, num2);

        // Assert
        assertEquals(-5, result);
    }

    @Test
    public void testAddingManyNumbers() {
        // Arrange
        int[] numbers1 = {1, 2, 3, 4, 5};

        // Act
        int result = Main.add(numbers1);

        // Assert
        assertEquals(15, result);

        // Arrange
        int[] numbers2 = {11, 9};

        // Act
        result = Main.add(numbers2);

        // Assert
        assertEquals(20, result);

        // Arrange
        int[] numbers3 = {-1, -2};

        // Act
        result = Main.add(numbers3);

        // Assert
        assertEquals(-3, result);
    }

    @Test
    public void testMultiplyingTwoNumbers() {
        // Arrange
        int num1 = 2;
        int num2 = 4;

        // Act
        int result = Main.multiply(num1, num2);

        // Assert
        assertEquals(8, result);

        // Arrange
        num1 = -1;
        num2 = 3;

        // Act
        result = Main.multiply(num1, num2);

        // Assert
        assertEquals(-3, result);
    }
}
