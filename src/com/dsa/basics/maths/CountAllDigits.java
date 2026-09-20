package com.dsa.basics.maths;

public class CountAllDigits {
    public static void main(String[] args) {
        int c = 3102931;
        int count = bruteForceSolution(c);
        System.out.println(count);
        System.out.println(optimalSolution(c));
    }

    public static int bruteForceSolution(int num) {

        if (num == 0) return 1;

        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static int optimalSolution(int num) {
        if (num == 0) return 1;
        return (int) Math.log10(Math.abs(num)) + 1;
    }
}
