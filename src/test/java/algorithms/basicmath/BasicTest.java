package algorithms.basicmath;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static algorithms.basicmath.Basics.*;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class BasicTest {

    @Test
    public void countNumberOfDigits_with1234_then4() {
        assertEquals(4, countNumberOfDigits(1234));
    }

    @Test
    public void countNumberOfDigits_with0_then1() {
        assertEquals(1, countNumberOfDigits(0));
    }

    @Test
    public void countNumberOfDigits_withMinus12_then2() {
        assertEquals(2, countNumberOfDigits(-12));
    }

    @Test
    public void factorial_from0_then1() {
        assertEquals(1, factorial(0));
    }

    @Test
    public void factorial_from1_then1() {
        assertEquals(1, factorial(1));
    }

    @Test
    public void factorial_from7_then5040() {
        assertEquals(5040, factorial(7));
    }

    @Test
    public void factorial_from17_thenALong() {
        assertEquals(355687428096000L, factorial(17));
    }

    @Test
    public void lowestCommonDivisor_of2and3_then6() {
        assertEquals(6, lowestCommonDivisor(2, 3));
        assertEquals(6, lowestCommonDivisor(3, 2));
    }

    @Test
    public void lowestCommonDivisor_of6and15_then30() {
        assertEquals(30, lowestCommonDivisor(6, 15));
        assertEquals(30, lowestCommonDivisor(15, 6));
    }

    @Test
    public void greatestCommonDivisor_of2and3_then1() {
        assertEquals(1, greatestCommonDivisor(2, 3));
        assertEquals(1, greatestCommonDivisor(3, 2));
    }

    @Test
    public void greatestCommonDivisor_of48and180_then12() {
        assertEquals(12, greatestCommonDivisor(48, 180));
        assertEquals(12, greatestCommonDivisor(180, 48));
    }
}
