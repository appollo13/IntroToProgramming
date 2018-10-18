package algorithms.basicmath;

import java.util.ArrayList;

/*
5 (1.1.3) Basic mathematical concepts

  - task: Check if a given n is a prime number (https://en.wikipedia.org/wiki/Prime_number)
  - task: Check if a given n is a prime number using the Sieve of Eratosthenes
  - task: Find all prime factors of a given n
  - task: Calculate the Number of Zeros a Multiplication Ends With
 */
public class PrimeNumbers {

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeByTheSieveOfEratosthenes(int n) {
        boolean[] isComposite = new boolean[n + 1];
        isComposite[0] = true;
        isComposite[1] = true;

        for (int i = 2; i <= n / 2; i++) {
            if (!isComposite[i]) {
                int s = i * i;
                while (s <= n) {
                    isComposite[s] = true;
                    s += i;
                }
            }
        }

        return !isComposite[n];
    }

    public static int[] getPrimeFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n = n / i;
            }
        }

        if (factors.size() == 0) {
            return new int[]{1};
        }

        int[] primeFactors = new int[factors.size()];
        for (int i = 0; i < factors.size(); i++) {
            primeFactors[i] = factors.get(i);
        }
        return primeFactors;
    }

    public static int getTheNumberOfZerosAMultiplicationEndsWith(int n, int... array) {
        int multi = n;
        for (int i = 0; i < array.length; i++) {
            multi *= array[i];
        }

        if (multi == 0) {
            return 0;
        }

        int result = 0;
        while (multi % 10 == 0) {
            multi /= 10;
            result++;
        }
        return result;
    }
}

