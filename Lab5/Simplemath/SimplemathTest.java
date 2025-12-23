package Lab5.Simplemath;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SimplemathTest {

    Simplemath math = new Simplemath();

    @Test
    public void testAddPositiveNumbers() {
        assertEquals(5, math.add(2, 3));
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-5, math.add(-2, -3));
    }

    @Test
    public void testSubtractPositiveNumbers() {
        assertEquals(2, math.subtract(5, 3));
    }

    @Test
    public void testSubtractNegativeNumbers() {
        assertEquals(-2, math.subtract(-5, -3));
    }

    @Test
    public void testMultiplyPositiveNumbers() {
        assertEquals(6, math.multiply(2, 3));
    }

    @Test
    public void testMultiplyNegativeNumbers() {
        assertEquals(6, math.multiply(-2, -3));
    }


    @Test
    public void testDividePositiveNumbers() {
        assertEquals(2, math.divide(6, 3));
    }

    @Test
    public void testDivideNegativeNumbers() {
        assertEquals(2, math.divide(-6, -3));
    }


    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        math.divide(5, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideZeroByZero() {
        math.divide(0, 0);
    }
}
