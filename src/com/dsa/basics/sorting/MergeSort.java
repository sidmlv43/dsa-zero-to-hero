package com.dsa.basics.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] n = {4, 3, 2, 1, -4};
        sort(n, 0, n.length -1);
        System.out.println(Arrays.toString(n));
    }

    public static void sort(int[] arr, int si, int ei) {
        if (si >= ei) return;
        int mid = (si + ei) / 2;

        sort(arr, si, mid);
        sort(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
    }

    private static void merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];

        int i = si;
        int j = mid + 1;

        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            }

            else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }


}
