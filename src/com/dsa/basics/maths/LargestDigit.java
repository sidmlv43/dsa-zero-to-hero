package com.dsa.basics.maths;

public class LargestDigit {
    public static void main(String[] args) {
        int num = 10921;
        System.out.println(solution(num));
    }

    public static int solution(int n) {
        n = Math.abs(n);
        if (n < 10 && n >= 0) return n;

        int largest = Integer.MIN_VALUE;

        while (n > 0) {
            int ld = n % 10;
            largest = Math.max(ld, largest);
            n /= 10;
        }

        return largest;
    }
}
