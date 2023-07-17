package com.example.demo.algorithms.binarysearch;


/**
 * In given int table, search for target int.
 * Return as result table index of target value.
 *
 * int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
 * int target = 14;
 * int index = binarySearch(arr, target);
 */
public interface BinarySearchInterface {

    int binarySearch(int[] arr, int target);
}
