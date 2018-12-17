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
            System.out.println(l);
            return l;
        }
        return 1;

    }

    public static long fibonacci(long n) {

        long p = 0;
        while (p < n){
            long sum = p + fibonacci(n-p);
            p++;

        }

        return 0;
    }



    public static int lowestCommonDivisor(int firstNumber, int secondNumber) {
        //TODO
        return -1;
    }

    public static int greatestCommonDivisor(int firstNumber, int secondNumber) {
        //TODO
        return -1;
    }
}
