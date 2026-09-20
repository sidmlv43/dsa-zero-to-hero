package com.dsa.basics.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 3};
        solution(a);
        System.out.println(Arrays.toString(a));
    }

    public static void solution(int[] arr) {
        int n = arr.length;
        int mid = n / 2;

        for (int i = 0; i < mid; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }
}
