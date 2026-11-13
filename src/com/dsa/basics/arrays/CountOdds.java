package com.dsa.basics.arrays;

public class CountOdds {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 4, 2, 5, 7, 2}));
    }

    public static int solution(int[] arr) {
        int counts = 0;

        for(int n: arr) {
            if (n % 2 != 0) {
                counts++;
            }
        }

        return counts;
    }
}
