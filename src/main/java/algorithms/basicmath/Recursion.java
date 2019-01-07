package algorithms.basicmath;

/*
7 (1.2) Recursion

  - task: Calculate n! (https://en.wikipedia.org/wiki/Factorial), for a given n, using recursion
  - task: Calculate Fibonacci number (https://en.wikipedia.org/wiki/Fibonacci_number), for a given n, using recursion
  - task: Calculate LCD (https://en.wikipedia.org/wiki/Lowest_common_denominator), for given n and m, using recursion
  - task: Calculate GCD (https://en.wikipedia.org/wiki/Greatest_common_divisor), for given n and m, using recursion
 */
public class Recursion {

    public static long factorial(int n) {

        if (n >= 2) {
            long l = n * factorial(n - 1);
            return l;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }

    public static long fibonacci(long n) {
        System.out.println(n);
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int lowestCommonDivisor(int firstNumber, int secondNumber) {

        if (secondNumber == 2) {
            return firstNumber;
        } else
            return (firstNumber*secondNumber)/(greatestCommonDivisor(secondNumber,secondNumber));
    }

    public static int greatestCommonDivisor(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        } else
            return greatestCommonDivisor(secondNumber, firstNumber % secondNumber);
    }
}
