package com.example.demo.basefeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForLoop {

    /**
     * FOR LOOP:
     *  - known and fixed number of iterations
     *  - needed pointer to iteration number
     */
    public static void main(String[] args) {

        List<Integer> unsorted = new ArrayList<>();
        unsorted.add(2);
        unsorted.add(5);
        unsorted.add(12);
        unsorted.add(8);

        indexAscendingIteration(unsorted);
        indexDescendingIteration(unsorted);
        foreachLoop(unsorted);
        whileLoop(unsorted);

    }

    static void indexAscendingIteration(List<Integer> myList) {

        for (int i = 0; i < myList.size(); i++) {
            System.out.println("ascending, for iteration: " + i + " value: " + myList.get(i));
        }
    }

    static void indexDescendingIteration(List<Integer> myList) {

        for (int i = myList.size() - 1; i >= 0; i--) {
            System.out.println("descending, for iteration: " + i + " value: " + myList.get(i));
        }
    }

    static void foreachLoop(List<Integer> myList) {

        // foreach loop
        for (Integer value : myList) {
            System.out.println("foreach: " + value);
        }
    }

    static void whileLoop(List<Integer> myList) {

        int count = 0;
        while (count < 5) {
            System.out.println("whileLoop - simple counter, Count: " + count);
            count++;
        }

        int a = 10;
        int b = 0;

        while (a >= b) {
            System.out.println("whileLoop - external variables, a: " + a + " b: " + b);
            a--;
            b++;
        }

        Scanner input = new Scanner(System.in);
        String userInput = "";
        while (!userInput.equalsIgnoreCase("exit")) {
            System.out.println("whileLoop - infinite until condition, example for command line");
            System.out.print("Enter a command (or 'exit' to exit): ");
            userInput = input.nextLine();
            // Process user input or perform actions
            System.out.println("Executing command: " + userInput);
        }

/*      boolean isRunning = true;
        while (isRunning) {
            // Perform some actions
            if (*//* Some condition *//*) {
                isRunning = false; // Exit the loop
            }
        }*/


    }


}
