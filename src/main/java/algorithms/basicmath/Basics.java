package algorithms.basicmath;

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

    public static void main(String[] args) {
        // System.out.println(countNumberOfDigits(555));
        //System.out.println("Facotrial is:  "+factorial(17));
        System.out.println(greatestCommonDivisorOfTwoNumbers(54, 24));
    }

    public static String countNumberOfDigits(int providedInteger) {
        String result = null;

        if (providedInteger <= 9) {
            result = "ther is 1 digit in the number";
        } else if (providedInteger >= 10 && providedInteger <= 99) {
            result = "ther is 2 digit in the number";
        } else if (providedInteger >= 100 && providedInteger <= 999) {
            result = "ther is 3 digit in the number";
        } else if (providedInteger >= 1000 && providedInteger <= 9999) {
            result = "ther is 3 digit in the number";
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

    public static int greatestCommonDivisorOfTwoNumbers(int firstNumber, int secondNumber) {

        int gcd = 0;
        int i = 0;
        int y = 0;

        for (i = firstNumber; i >= 1; i--) {
            if (firstNumber % i != 0)
                continue;
            System.out.print(i + ", ");
        }
        System.out.println();
        for (y = secondNumber; y >= 1; y--) {
            if (secondNumber % y != 0) {
                continue;
            }
            System.out.print(y + ", ");
        }

        if (i == y) {
            gcd = i;
        }

        return gcd;
    }
}
