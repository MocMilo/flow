package com.example.demo.leet.issue001;

import java.util.Arrays;

// int k = 4
// int[] target = {1, 2, 3, 4, 5, 6, 7};
// int[] rotated = {5, 6, 7, 1, 2, 3, 4};
public class RotateArray {

    // solution 1 "intermediate table"
    public static int[] rotate(int[] nums, int k) {

        if (k > nums.length) {
            k = k % nums.length;
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < k; i++) {
            result[i] = nums[nums.length - k + i];
        }
        int j = 0;
        for (int i = k; i < nums.length; i++) {
            result[i] = nums[j];
            j++;
        }

        System.arraycopy(result, 0, nums, 0, nums.length);
        return nums;
    }

    // solution 2 "Bubble rotate" (simmilar to bubble sorting
    public static void rotate2(int[] arr, int k) {

        for (int i = 0; i < k; i++) {

            // jedziesz po indeksie ale od tyłu
            for (int j = arr.length - 1; j > 0; j--) {

                int temp = arr[j];              // swapping element with previous element
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
    }

    public static void main(String[] args) {

        int k = 4;
        int[] target = {1, 2, 3, 4, 5, 6, 7};
        rotate2(target, k);
        Arrays.stream(target).forEach(System.out::println);
    }


    // solution 3 "reverse of table"

/*    public static void main(String[] args) {

        int k = 4;
        int[] target = {1, 2, 3, 4, 5, 6, 7};
        rotate3(target, k);
        Arrays.stream(target).forEach(System.out::println);
    }*/

    public static int[] rotate3(int[] arr, int k) {
        //            target: {1,2,3,4, 5,6,7}
        reverse(arr, 0, k - 1);            // reverse first part: {4,3,2,1, 5,6,7}
        reverse(arr, k, arr.length - 1);            // reverse second part: {4,3,2,1, 7,6,5}
        reverse(arr, 0, arr.length - 1);  // reverse whole table: {5,6,7,1,2,3,4}
        return arr;
    }

    public static void reverse(int[] arr, int startIndex, int endIndex) {

        if (arr == null || arr.length == 1)
            return;

        while (startIndex < endIndex) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }

    // libs for reverse array:
    // 1) org.apache.commons.lang3.ArrayUtils ArrayUtils.reverse(array);

    // 2) java.util.Collections;
    //    java.util.Arrays;
    // Collections.reverse(Arrays.asList(array));

}
