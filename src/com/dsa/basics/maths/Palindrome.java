package com.dsa.basics.maths;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(solution(21));
    }

    public static boolean solution(int n) {
        int num = n;
        int reversed = 0;
        while (n > 0) {
            reversed = (reversed * 10) + (n % 10);
            n /= 10;
        }
        return reversed == num;
    }
}
