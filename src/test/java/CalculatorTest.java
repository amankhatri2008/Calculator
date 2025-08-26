import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class CalculatorTest {

    private final RunCalculation calculator = new RunCalculation();

    @Test
    public void testAddition() throws Exception {
        assertEquals(BigDecimal.valueOf(6), calculator.returnResult(4, 2, '+'));
    }

    @Test
    public void testSubtraction() throws Exception {
        assertEquals(BigDecimal.valueOf(7), calculator.returnResult(10, 3, '-'));
    }

    @Test
    public void testMultiplication() throws Exception {
        assertEquals(BigDecimal.valueOf(15), calculator.returnResult(3, 5, '*'));
    }

    @Test
    public void testDivision() throws Exception {
        assertEquals(BigDecimal.valueOf(2.6666666666666665), calculator.returnResult(8, 3, '/'));
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(Exception.class, () -> calculator.returnResult(5, 0, '/'));
    }

    @Test
    public void testInvalidOperator() {
        assertThrows(Exception.class, () -> calculator.returnResult(4, 2, '%'));
    }
}
