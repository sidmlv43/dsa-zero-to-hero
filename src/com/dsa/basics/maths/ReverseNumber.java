package com.dsa.basics.maths;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(solution(n));
    }

    public static int solution(int num) {
        int reversed = 0;
        while (num > 0) {
            int ld = num % 10;
            reversed = reversed * 10 + ld;
            num /= 10;
        }
        return reversed;
    }
}
