package com.dsa.basics.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {4, 3, -1, 5, 2};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static int findPartition(int[] arr, int si, int ei) {

        int pivot = arr[ei];

        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }

        i++;

        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i;
    }

    public static void sort(int[] arr, int si, int ei) {

        if (si >= ei) return;

        int pivotIndex = findPartition(arr, si, ei);

        sort(arr, si, pivotIndex - 1);
        sort(arr, pivotIndex + 1, ei);

    }
}
