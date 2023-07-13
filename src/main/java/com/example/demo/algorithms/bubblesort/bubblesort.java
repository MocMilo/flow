package com.example.demo.algorithms.bubblesort;

import java.util.Arrays;

public class bubblesort {


    static int[] sort(int[] arr) {

        int length = arr.length;


        for (int j = 0; j < length; j++) {

            // TODO fix this it doesn't have be like this
            // moves biggest number to end
            for (int i = length - 1; i > 0; i--) {

                int temp = arr[i];
                if (arr[i] < arr[i - 1]) {
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] unsorted = {1, 4, 3, 7, 6, 2, 9};

        System.out.println("unsorted:");
        Arrays.stream(unsorted).forEach(System.out::println);

        int[] sorted = sort(unsorted);

        System.out.println("sorted:");
        Arrays.stream(sorted).forEach(System.out::println);
    }
}
