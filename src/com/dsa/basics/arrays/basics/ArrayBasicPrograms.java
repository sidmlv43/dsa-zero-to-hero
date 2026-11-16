package com.dsa.basics.arrays.basics;

import java.util.Arrays;

public class ArrayBasicPrograms {
    public static void main(String[] args) {
        System.out.println(countOdds(new int[] {1, 4, 2, 5, 7, 2}));
        int[] arr = {1, 2, 3, 4};
        System.out.println(isArraySorted(arr));
        System.out.println(isArraySorted(new int[] {3, 4, 2, 7}));
        System.out.println(isArraySorted(new int[]{1}));

        int[] a = {3, 1, 2, 3};
        reverseArray(a);
        System.out.println(Arrays.toString(a));

        System.out.println(sumOfElements(a));
    }

    public static boolean isArraySorted(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }

    public static int countOdds(int[] arr) {
        int counts = 0;

        for(int n: arr) {
            if (n % 2 != 0) {
                counts++;
            }
        }

        return counts;
    }

    public static void reverseArray(int[] arr) {
        int n = arr.length;
        int mid = n / 2;

        for (int i = 0; i < mid; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }


    public static int sumOfElements(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}
