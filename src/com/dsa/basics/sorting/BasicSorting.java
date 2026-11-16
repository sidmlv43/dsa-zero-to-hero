package com.dsa.basics.sorting;

import java.util.Arrays;

public class BasicSorting {

    public static void main(String[] args) {
        int[] a = {1, 4, 3, 2, 5, 2, 7, 2, 1, 8};
//        bubbleSort(a);
//        selectionSort(a);
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }


    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }


    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] =  arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }


}
