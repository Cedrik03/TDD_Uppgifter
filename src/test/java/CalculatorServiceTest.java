import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    CalculatorService service = new CalculatorService();

    @Test
    void testAddition() {
        assertEquals(4, service.add(2, 2));
    }

    @Test
    void testSubtraction() {
        assertEquals(1, service.subtract(3, 2));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, service.multiply(3, 2));
    }

    @Test
    void testDivision() {
        assertEquals(2, service.divide(4, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> service.divide(5, 0));
    }

    @Test
    void testAddDoubles() {
        double result = service.add(0.1, 0.2);
        assertEquals(0.3, result, 0.000001);
    }

    @Test
    void testAddStrings() {
        assertEquals(5, service.add("2", "3"));
    }
}
