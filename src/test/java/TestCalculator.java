import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestCalculator {

    private int x;
    private int y;

    @BeforeEach
    public void setUp(){
        x = 10;
        y = 3;
    }

    @Test
    public void testAddition(){
        assertEquals(x + y, 13);
    }

    @Test
    public void testSubtraction(){
        assertEquals(x - y, 7);
    }

    @Test
    public void testMultiplication(){
        assertEquals(x * y, 30);
    }

    @Test
    public void testDivisionThenGivenDecimal(){
        assertEquals(x / y, 3);
    }

    @Test
    public void testWhenAddingTwoZeros(){
        y = 0;
        x = 0;
        assertEquals(y + x, 0);
    }

    @Test
    public void testWhenMultiplyingByZero(){
        assertEquals(x * 0, 0);
    }

    @Test
    public void testMultipleOperatons(){
        assertEquals(x * y + x, 40);
    }

}
