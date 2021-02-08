import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();

    }

    @Test
    public void add(){
        assertEquals(6, calculator.add(1, 5));
    }

    @Test
    public void subtract(){
        assertEquals(10, calculator.subtract(20, 10));
    }

    @Test
    public void multiply(){
        assertEquals(4, calculator.multiply(2, 2));
    }

    @Test
    public void divide(){
        assertEquals(5, calculator.divide(10, 2), 0.0 );
    }
}
