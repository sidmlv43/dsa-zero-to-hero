package com.dsa.intermediate.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayProblems {
    public static void main(String[] args) {
        int[] arr = {4, 2, -1, -3};
        System.out.println(linearSearch(arr, 4));

        int[] nums = {-2, 0, 2, 5, 7};

        System.out.println(binarySearch(nums, 5));

        System.out.println(findSecondLargest(nums));

        int[] x = {1, 1, 0, 0, 1, 1, 1, 0, 1, 1};
        System.out.println(maxConsecutiveOnes(x));

        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        leftRotateArrayByKPlace(ints, 20);
        System.out.println(Arrays.toString(ints));
        moveZeroesToEnd(x);
        System.out.println(Arrays.toString(x));

        int[] dups = {1, 1, 3, 4, 5, 5, 6, 6, 7, 7, 7, 8};

        System.out.println(Arrays.toString(removeDuplicatesFromSortedArray(dups)));
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }


    public static int binarySearch(int[] arr, int key) {

        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key){
                return mid;
            }

            else if (arr[mid] > key) {
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }

        return -1;

    }


    public static int findSecondLargest(int[] arr) {
        int n = arr.length;

        int max = arr[0], secMax = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            }

            else {
                if (arr[i] > secMax) {
                    secMax = arr[i];
                }
            }
        }
        return secMax;
    }

    public static int maxConsecutiveOnes(int[] arr) {
        int n = arr.length;

        int maxConsecutiveOnes = 0;
        int temp = 0;
        for (int a: arr) {

            if (a == 1) {
                temp++;
            }
            else {
                temp = 0;
            }

            if(temp > maxConsecutiveOnes) {
                maxConsecutiveOnes = temp;
            }
        }

        return maxConsecutiveOnes;
    }

    public static void leftRotateArrayByKPlace(int[] arr, int k) {
        int n = arr.length;
        if (k > n) {
            k = k % n;
        }

        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, n - 1);
        reverseArray(arr, 0, n -1);
    }

    private static void reverseArray(int[] arr, int si, int ei) {
        while (si <= ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }

    public static void moveZeroesToEnd(int[] arr) {
        int n = arr.length, low = 0, high = n - 1;


        while (arr[high] == 0) {
            high--;
        }

        while (low < high && (low < n && high > 0)) {
            if (arr[low] == 0) {
                arr[low] = arr[high];
                arr[high] = 0;
                high--;
            }

            if (arr[high] == 0) {
                high--;
            }

            low++;

        }
    }


    public static int[] removeDuplicatesFromSortedArray(int[] arr) {
        int n = arr.length;
        int[] temp =  new int[n];

        int counter = 0;

        temp[0] = arr[0];
        counter++;

        for (int i = 1; i < n; i++) {
            if (arr[i] != temp[counter - 1]) {
                temp[counter++] = arr[i];
            }
        }

        int[] uniques = new int[counter];

        System.arraycopy(temp, 0, uniques, 0, counter);
        return uniques;
    }
    
}
