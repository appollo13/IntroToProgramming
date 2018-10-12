package algorithms.basicmath;

import java.util.ArrayList;
import java.util.List;

/*
4 (1.1.1) Basic mathematical concepts

  - task: Count the number of digits in an integer, for a given integer
  - task: Calculate n! (https://en.wikipedia.org/wiki/Factorial), for a given n
  - task: Calculate LCD (https://en.wikipedia.org/wiki/Lowest_common_denominator), for given n and m
  - task: Calculate GCD (https://en.wikipedia.org/wiki/Greatest_common_divisor), for given n and m
 */
public class Basics {

    public static final int[] PRIMES = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61,
            67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173,
            179, 181, 191, 193, 197, 199};

    public static int countNumberOfDigits(int providedInteger) {
        int result = 1;

        while (true) {
            providedInteger = providedInteger / 10;
            if (providedInteger != 0) {
                result++;
            } else {
                break;
            }
        }

        return result;
    }

    public static long factorial(int factorialNumber) {
        long result = 1;

        for (long i = factorialNumber; i >= 1; i--) {
            result *= i;
        }

        return result;
    }

    public static int lowestCommonDivisor(int firstNumber, int secondNumber) {

        int firstResult;
        int multiply;
        int result = 0;
        if (firstNumber >= secondNumber) {
            multiply = firstNumber;
        } else {
            multiply = secondNumber;
        }

        for (int i = 1; i < multiply; i++) {
            firstResult = firstNumber * i;
            if (firstResult % secondNumber == 0) {
                result = firstResult;
                System.out.println("LCD is: " + result);
                break;
            }
        }
        if (result == 0) {
            result = firstNumber * secondNumber;
            System.out.println("LCD is: " + result);
        }

        return result;
    }

    public static int greatestCommonDivisor(Integer firstNumber, Integer secondNumber) {

        Integer[] firstNumberArray;
        Integer[] secondNumberArray;
        firstNumberArray = extractCommonMultipliers(firstNumber);
        secondNumberArray = extractCommonMultipliers(secondNumber);
        List<Integer> results = new ArrayList<>();
        int gcd=1;
        int j = 0;

        for (int i = 0; i < firstNumberArray.length; i++) {
            inner:
            for (; j < secondNumberArray.length; j++) {

                if (firstNumberArray[i] == secondNumberArray[j]) {
                    results.add(firstNumberArray[i]);
                    j++;
                    break;
                }
                break inner;
            }
        }
        for(int i: results){
            gcd *=i;

        }
        return gcd;
    }

    static Integer[] extractCommonMultipliers(int number) {
        List<Integer> arrayOfMultipliers = new ArrayList<>();
        int localNumber = number;

        for (int i = 0; i < PRIMES.length; i++) {
            while (localNumber % PRIMES[i] == 0) {

                localNumber = localNumber / PRIMES[i];
                arrayOfMultipliers.add(PRIMES[i]);
            }
        }

        return arrayOfMultipliers.toArray(new Integer[arrayOfMultipliers.size()]);
    }
}

