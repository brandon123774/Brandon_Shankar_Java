package com.company;

//        import org.junit.Before;
        import org.junit.Test;

        import static org.junit.Assert.*;

public class CalculatorAppTest {
    private static CalculatorObject calc = new CalculatorObject();

//    @Before
//    public void setUp() {
//        calc = new CalculatorObject();
//    }

    @Test
    public void shouldAddTwoIntegers() {
        assertEquals(2, calc.add(1,1));
    }

    @Test
    public void shouldSubtractTwoIntegers()  {
        assertEquals(-29, calc.subtract(23,52));
    }

    @Test
    public void shouldMultiplyTwoIntegers()  {
        assertEquals(68, calc.multiply(34,2));
    }
    @Test
    public void shouldDivideTwoIntegers()  {
        assertEquals(4, calc.divide(12,3));
    }
    @Test
    public void shouldDivideTwoDouble()  {
        assertEquals(1.7142, calc.divideDouble(12d,7d), .0001);
    }
    @Test
    public void shouldAddTwoDouble()  {
        assertEquals(5.7d, calc.addDouble(3.4d,2.3d), .0001);
    }
    @Test
    public void shouldMultiplyTwoDouble()  {
        assertEquals(29.48, calc.multiplyDouble(6.7, 4.4),.0001);
    }
    @Test
    public void shouldSubtractTwoDouble()  {
        assertEquals(5, 5.5,.5);
    } @Test
    public void shouldDivideTwoDoubleToo()  {
        assertEquals(4.91d, calc.divideDouble(10.8d, 2.2d),.001);
    }


}