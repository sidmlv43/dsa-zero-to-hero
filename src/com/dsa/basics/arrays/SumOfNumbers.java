package com.dsa.basics.arrays;

public class SumOfNumbers {
    public static void main(String[] args) {

    }

    public static int solution(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

}
