package com.dsa.basics.strings;

public class ReverseAString {
    public static void main(String[] args) {
        String s = "Siddharth";
        System.out.println(solution(s));
        System.out.println(solution1(s));
    }

    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String solution1(String str) {
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }
}
