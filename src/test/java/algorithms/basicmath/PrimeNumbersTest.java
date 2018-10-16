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

//        Not Working
//        for (int i = 1; i <= 202; i++) {
//            boolean expected = Arrays.asList(PRIMES).contains(i);
//            System.out.println(PRIMES[i] + "is expected to be " + expected +"->"+ i);

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
    public void getPrimeFactors_of320_then22335() {
        // given
        int[] expected = new int[]{2, 2, 2, 2, 2, 2, 5};

        // when & then
        assertArrayEquals(expected, getPrimeFactors(320));
    }
}
