package com.example.demo.algorithms.recursion;

/**
 * For positive integers starting from number 1, every value in sequence is sum of two previous values.
 * Sequence goes from 1 to infinity.
 * Fibonacci sequence = { 1  1  2  3  5   8  13  21  34 ... }
 * n - number in sequence   1  2  3  4  5   6  7   8   9
 */
public class Fibonacci {

    public static int recursionFib(int n) {

        if (n == 1 || n == 2) {                                 // base condition
            return 1;
        }
        // fib(n) = fib(n-1) + fib(n-2)

        return recursionFib(n - 1) + recursionFib(n - 2); // recursion
    }

    public static int iterationFib(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("provide positive integer not less then 1");
        }

        int result = 1;

        if (n == 1 || n == 2) {
            return result;
        }

        int prev1 = 1; // previous value (n-2)
        int prev2 = 1; // previous value (n-1)

        for (int i = 3; i <= n; i++) {

            result = prev1 + prev2;
            prev1 = prev2;
            prev2 = result;
        }
        return result;
    }


    public static void main(String[] args) {

        int n = 8;
        System.out.println(String.format("recursion: for number %d in Fibonacci sequence, the value is %d", n, recursionFib(n)));
        System.out.println(String.format("iteration: For number %d in Fibonacci sequence, the value is %d", n, iterationFib(n)));
    }

}
