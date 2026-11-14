package com.dsa.basics.recursion;

import java.util.Arrays;

public class BasicRecursionProblems {

    public static void main(String[] args) {
        System.out.println("Sum of 1 to 12 = " + sumOf1ToN(12));
        System.out.println("Factorial of 5 = " + factorial(5));
        String t = "Negan";
        System.out.println(reverseAString(t, t.length()));
        System.out.println(isStringPalindrome(t, 0, t.length() - 1));
        System.out.println(isStringPalindrome("racecar", 0, "racecar".length() -1));
        int[] nums = {1, 3, 5, 6};
        reverseArray(nums, 0, nums.length -1);
        System.out.println(Arrays.toString(nums));

        System.out.println(fibonacci(4));

        int[] newNums = {1, 2, 3, 4, 5};
        System.out.println(isArraySorted(newNums, 0));
    }

    public static int sumOf1ToN(int n) {
        if (n == 1) return n;

        return n + sumOf1ToN(n - 1);
    }

    public static int factorial(int n) {
        if (n == 0) return 1;

        return n * factorial(n - 1);

    }

    public static String reverseAString(String s, int n) {
        if (n == 1) return String.valueOf(s.charAt(0));
        return s.charAt(n - 1) + reverseAString(s, n - 1);
    }

    public static boolean isStringPalindrome (String s, int si, int ei) {
        if (si >= ei) return true;

        return (s.charAt(si) == s.charAt(ei)) && isStringPalindrome(s, si + 1, ei - 1);
    }


    public static void reverseArray(int[] arr, int si, int ei) {
        if (si >= ei) return;

        int temp = arr[si];
        arr[si] = arr[ei];
        arr[ei] = temp;

        reverseArray(arr, si + 1, ei - 1);
    }


    public static int fibonacci(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;

        return fibonacci(n - 1) + fibonacci(n -2);
    }

    public static boolean isArraySorted (int[] arr, int counter) {
        if (counter >= arr.length - 2) return true;
        return arr[counter] < arr[counter + 1] && isArraySorted(arr, counter + 1);
    }
}
