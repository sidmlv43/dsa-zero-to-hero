package com.dsa.basics.maths;

public class LCM {
    public static void main(String[] args) {
        System.out.println(solution(8, 14));
    }

    public static int solution(int a, int b) {
        return (a * b) / HCF(a, b);
    }

    private static int HCF(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0){
            return b;
        }
        if (b == 0) {
            return a;
        }

        if (a > b) {
            return HCF(a % b, b);
        }
        else {
            return HCF(b % a, a);
        }
    }
}
