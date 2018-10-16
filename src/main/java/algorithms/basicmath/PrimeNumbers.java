package algorithms.basicmath;

import java.util.ArrayList;
import java.util.LinkedList;

/*
5 (1.1.3) Basic mathematical concepts

  - task: Check if a given n is a prime number (https://en.wikipedia.org/wiki/Prime_number)
  - task: Check if a given n is a prime number using the Sieve of Eratosthenes
  - task: Find all prime factors of a given n
  - task: Calculate the Number of Zeros a Multiplication Ends With
 */
public class PrimeNumbers {

    public static boolean isPrime(int n) {

        int count = 0;

        if (n == 1) {
            return false;
        }

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
            if (count >= 2) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeByTheSieveOfEratosthenes(int n) {

        boolean[] isComposite = new boolean[n + 1];
        LinkedList<Integer> Primes = new LinkedList<>();
        int sqrt = (int) Math.sqrt(n);

        for (int i = 2; i <= sqrt; i++) {
            if (!isComposite[i]) {
                int s = i * i;
                while (s <= n) {
                    isComposite[s] = true;
                    s += i;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) {
                Primes.add(i);
            }
        }

        return Primes.contains(n);
    }

    public static int[] getPrimeFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if (n % i != 0) {
                    break;
                }else {
                    factors.add(i);
                    n =n/i;
                }
            }

        }
        if(factors.size() !=0) {
            int[] primeFactors = new int[factors.size()];
            for (int i = 0; i < factors.size(); i++) {
                primeFactors[i] = factors.get(i);
                System.out.println(primeFactors[i]);
            }

            return primeFactors;
        }else{
            return new int[]{1};
        }
    }


    public static int getTheNumberOfZerosAMultiplicationEndsWith(int n, int... array) {
        //TODO
        return -1;
    }
}

