package algorithms.basicmath;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static algorithms.basicmath.Basics.PRIMES;
import static algorithms.basicmath.PrimeNumbers.*;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class PrimeNumbersTest {

    @Test
    public void isPrime_from1to202() {
        for (int i = 1; i <= 202; i++) {
            boolean expected = asList(PRIMES).contains(i);
            assertEquals("" + i, expected, isPrime(i));
        }
    }

    @Test
    public void isPrimeByTheSieveOfEratosthenes_from1to202() {
        for (int i = 1; i <= 202; i++) {
            boolean expected = asList(PRIMES).contains(i);
            assertEquals("" + i, expected, isPrimeByTheSieveOfEratosthenes(i));
        }
    }

    @Test
    public void getPrimeFactors_of1_then1() {
        // given
        int[] expected = new int[]{1};

        // when & then
        assertArrayEquals(expected, getPrimeFactors(1));
    }

    @Test
    public void getPrimeFactors_of2_then2() {
        // given
        int[] expected = new int[]{2};

        // when & then
        assertArrayEquals(expected, getPrimeFactors(2));
    }

    @Test
    public void getPrimeFactors_of320_then22335() {
        // given
        int[] expected = new int[]{2, 2, 3, 3, 5};

        // when & then
        assertArrayEquals(expected, getPrimeFactors(320));
    }
}
