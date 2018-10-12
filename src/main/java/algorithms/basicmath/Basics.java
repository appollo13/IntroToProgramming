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

        for (long i = factorialNumber; i > 1; i--) {
            result *= i;
        }

        return result;
    }

    public static int lowestCommonDivisor(int firstNumber, int secondNumber) {
        int biggestNumber;
        if (firstNumber >= secondNumber) {
            biggestNumber = firstNumber;
        } else {
            biggestNumber = secondNumber;
        }

        for (int i = 1; i <= biggestNumber; i++) {
            int result = firstNumber * i;
            if (result % secondNumber == 0) {
                return result;
            }
        }

        throw new RuntimeException("Impossible !!!");
    }

    public static int greatestCommonDivisor(Integer firstNumber, Integer secondNumber) {
        Integer[] firstNumberArray = extractCommonMultipliers(firstNumber);
        Integer[] secondNumberArray = extractCommonMultipliers(secondNumber);

        int result = 1;

        int i = 0;
        int j = 0;
        for (; i < firstNumberArray.length; i++) {
            for (; j < secondNumberArray.length; j++) {
                if (firstNumberArray[i].intValue() == secondNumberArray[j].intValue()) {
                    result *= firstNumberArray[i];

                    j++;// next j
                    break;// next i
                }

                if (firstNumberArray[i] < secondNumberArray[j]) {
                    // same j
                    break;// next i
//                } else {
//                    // same i
//                    // next j
                }
            }
        }

        return result;
    }

    private static Integer[] extractCommonMultipliers(int number) {
        List<Integer> arrayOfMultipliers = new ArrayList<>();

        for (int prime : PRIMES) {
            while (number % prime == 0) {
                number = number / prime;
                arrayOfMultipliers.add(prime);
            }
        }

        return arrayOfMultipliers.toArray(new Integer[0]);
    }
}

