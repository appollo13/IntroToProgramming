package algorithms.basicmath;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static algorithms.basicmath.Basics.countNumberOfDigits;
import static algorithms.basicmath.Basics.factorial;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class BasicTest {

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
}
