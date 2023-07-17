package com.example.demo.algorithms.binarysearch;

public class BinarySearch implements BinarySearchInterface {

    /*
     * Binary search requires the array to be sorted in ascending or descending order for accurate results.
     * If the array is not sorted, binary search may not provide correct results.
     * In such cases, you would need to sort the array first before performing a binary search.
     *
     * int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
     * int target = 14;
     * int index = binarySearch(arr, target)
     */
    @Override
    public int binarySearch(int[] arr, int target) {

        int size = arr.length;
        int startIndex = 0;
        int endIndex = size - 1;

        while (startIndex <= endIndex) {

            // universal formula of middle of index range
            // understand this! Hint Analyse: second iteration and next iterations...
            int halfIndex = startIndex + ((endIndex - startIndex) / 2);

            if (arr[halfIndex] == target) {

                System.out.println("condition 1 -> Success: element found!");
                return halfIndex;
            } else if (arr[halfIndex] < target) {

                System.out.println("condition 2 -> Fail: discard left half");
                startIndex = halfIndex + 1;
            } else if (arr[halfIndex] > target) {

                System.out.println("condition 3 -> Fail: discard right half");
                endIndex = halfIndex - 1;
            }
        }
        throw new RuntimeException("failed to find target value!");
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 9, 10, 11, 12, 14, 16, 18, 20, 21, 22, 23, 24, 25, 26};
        int target = 14;

        BinarySearch binarySearch = new BinarySearch();
        int foundIndex = binarySearch.binarySearch(arr, target);

        System.out.println(String.format("Binary search result: For target value %d found index is %d", target, foundIndex));
    }
}
