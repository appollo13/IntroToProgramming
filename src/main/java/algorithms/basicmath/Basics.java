package algorithms.basicmath;

/*
4 (1.1.1) Basic mathematical concepts

  - task: Count the number of digits in an integer, for a given integer
  - task: Calculate n! (https://en.wikipedia.org/wiki/Factorial), for a given n
  - task: Calculate LCD (https://en.wikipedia.org/wiki/Lowest_common_denominator), for given n and m
  - task: Calculate GCD (https://en.wikipedia.org/wiki/Greatest_common_divisor), for given n and m
 */
public class Basics {
    public static void main(String[] args) {
        System.out.println(countNumberOfDigits(555));
        System.out.println("Facotrial is:  "+factorial(17));
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
}
