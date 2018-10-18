package algorithms.basicmath;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static algorithms.basicmath.Basics.PRIMES;
import static algorithms.basicmath.PrimeNumbers.*;
import static java.util.Arrays.stream;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class PrimeNumbersTest {

    @Test
    public void isPrime_from1to202() {
        List<Integer> ints = new ArrayList<>();

        for (int i : PRIMES)
            ints.add(i);

        for (int i = 1; i <= 202; i++) {

            int fI = i;
            boolean expected = stream(PRIMES).anyMatch(n -> n == fI);
            assertEquals("" + i, expected, isPrime(i));
        }
    }

    @Test
    public void isPrimeByTheSieveOfEratosthenes_from1to202() {
        for (int i = 1; i <= 202; i++) {
            int fI = i;
            boolean expected = stream(PRIMES).anyMatch(n -> n == fI);
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
    public void getPrimeFactors_of180_then22335() {
        // given
        int[] expected = new int[]{2, 2, 3, 3, 5};

        // when & then
        assertArrayEquals(expected, getPrimeFactors(180));
    }

    @Test
    public void getTheNumberOfZerosAMultiplicationEndsWith_of_0_and_10_then1() {
        assertEquals(0, getTheNumberOfZerosAMultiplicationEndsWith(0));
    }

    @Test
    public void getTheNumberOfZerosAMultiplicationEndsWith_of_2_and_10_then1() {
        assertEquals(1, getTheNumberOfZerosAMultiplicationEndsWith(2, 10));
    }

    @Test
    public void getTheNumberOfZerosAMultiplicationEndsWith_of_10_and_10_then1() {
        assertEquals(2, getTheNumberOfZerosAMultiplicationEndsWith(10, 10));
    }
}
