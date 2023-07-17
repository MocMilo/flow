package com.example.demo.algorithms.recursion;


/**
 * The factorial of a non-negative integer n, denoted as n!, is the product of all positive integers less than or equal to n.
 * In mathematical notation, it can be expressed as:
 * n! = n * (n - 1) * (n - 2) * ... * 2 * 1
 * For example:
 * 5! = 5 * 4 * 3 * 2 * 1 = 120
 */
public class Factorial {
    public static int recursiveFactorial(int n) {
        if (n == 0 || n == 1) {   // proper exit condition
            return 1;
        } else {
            return n * recursiveFactorial(n - 1);  // inner call of function itself
        }
    }
/*
// next recursive calls do create "chain":
        1) The initial call is factorial(5). Since 5 is not 0 or 1, the function proceeds to the else block.
        2) The function evaluates "n * factorial(n - 1)". In this case , it is "5 * factorial(4)".
        3) The recursive call is made to "factorial(4)". Again, 4 is not 0 or 1, so the function proceeds to the else block.
        4) It evaluates "n * factorial(n - 1)" as "4 * factorial(3)".
        5) Another recursive call is made to factorial(3). Similarly, 3 is not 0 or 1, so it proceeds to the else block.
        6) It evaluates "n * factorial(n - 1)" as "3 * factorial(2)".
        7) A recursive call is made to factorial(2). Again, 2 is not 0 or 1, so it proceeds to the else block.
        8) It evaluates "n * factorial(n - 1)" as "2 * factorial(1)".
        9) Another recursive call is made to factorial(1).
        This time, the base case is met, as 1 is equal to 1. The function immediately returns 1.

// now propagation up the "chain":
        10) ->  The value of factorial(1) is propagated back up the chain.
                The expression "2 * factorial(1)" becomes 2 * 1, resulting in 2.
            ->  Similarly, "3 * factorial(2)" becomes 3 * 2, resulting in 6.
            ->  "4 * factorial(3)" becomes 4 * 6, resulting in 24.
            ->  Finally (last element of chain), "5 * factorial(4)" becomes "5 * 24", resulting in 120.
*/


    public static int iterationFractional(int n) {

        int result = 1;   // minimal valid result for any factorial

        for (int i = 2; i <= n; i++) {  // start from 2 because 0 and 1 are irrelevant, always give 1
            result = result * i;

            //     n = 5

            //     0! is just 1   // irrelevant pointer 0, omitted in loop
            //     1 = 1 * 1      // irrelevant pointer 1, omitted in loop
            // iteration 1   1 = 1 * 2           // updated result = 2
            // iteration 2   2 = 2 * 3           // updated result = 6
            // iteration 3   6 = 6 * 4           // updated result = 24
            // iteration 4   24 = 24 * 5         // last iteration result = 120 (exit loop and return result)
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        int recursiveResult = recursiveFactorial(number);
        System.out.println("Recursive: The factorial of: " + number + " is: " + recursiveResult);

        int iterationResult = iterationFractional(number);
        System.out.println("Iteration: The factorial of: " + number + " is: " + iterationResult);
    }
}
