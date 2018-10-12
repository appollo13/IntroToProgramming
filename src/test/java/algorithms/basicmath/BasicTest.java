package algorithms.basicmath;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static algorithms.basicmath.Basics.*;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class BasicTest {

    //Tests for finding how many digits does integer have
    @Test
    public void given1234_whenCountNumberOfDigits_then4() {
        assertEquals(4, countNumberOfDigits(1234));
    }

    @Test
    public void given0_whenCountNumberOfDigits_then1() {
        assertEquals(1, countNumberOfDigits(0));
    }

    @Test
    public void givenMinus12_whenCountNumberOfDigits_then2() {
        assertEquals(2, countNumberOfDigits(-12));
    }

    //Tests for finding Factorial
    @Test
    public void given0_whenFactorial_then1() {
        assertEquals(1, factorial(0));
    }

    @Test
    public void given1_whenFactorial_then1() {
        assertEquals(1, factorial(1));
    }

    @Test
    public void given7_whenFactorial_then5040() {
        assertEquals(5040, factorial(7));
    }

    @Test
    public void given10_whenFactorial_then3628800() {
        assertEquals(3628800, factorial(10));
    }

    @Test
    public void given17_whenFactorial_then5040() {
        assertEquals(355687428096000L, factorial(17));
    }

    //Tests for Lowest Common Divisor
    @Test
    public void given15And6_when_lowestCommonDivisor_then30() {
        assertEquals(30, lowestCommonDivisor(15, 6));
    }

    @Test
    public void given10And6_when_lowestCommonDivisor_then30() {
        assertEquals(30, lowestCommonDivisor(10, 6));
    }

    @Test
    public void given12And18_when_lowestCommonDivisor_then36() {
        assertEquals(36, lowestCommonDivisor(12, 18));
    }

    @Test
    public void given22And33_when_lowestCommonDivisor_then66() {
        assertEquals(66, lowestCommonDivisor(22, 33));
    }

    @Test
    public void given221And313_when_lowestCommonDivisor_then6144() {
        assertEquals(2048 * 3, lowestCommonDivisor(3, 2048));
    }

    //Tests for Greater Common Divisor

    @Test
    public void given48And180_when_greatestCommonDivisor_then12() {
        assertEquals(12, greatestCommonDivisor(48, 180));
        assertEquals(12, greatestCommonDivisor(180, 48));
    }

    @Test
    public void given1024And512_when_greatestCommonDivisor_then512() {
        assertEquals(512, greatestCommonDivisor(1024, 512));
        assertEquals(512, greatestCommonDivisor(512, 1024));
    }

    @Test
    public void given2And3_when_greatestCommonDivisor_then6() {
        assertEquals(1, greatestCommonDivisor(2, 3));
        assertEquals(1, greatestCommonDivisor(3, 2));
    }
}
