package com.dsa.basics.arrays;

public class ArrayIsSorted {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(solution(arr));
        System.out.println(solution(new int[] {3, 4, 2, 7}));
        System.out.println(solution(new int[]{1}));
    }

    public static boolean solution(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }
}
