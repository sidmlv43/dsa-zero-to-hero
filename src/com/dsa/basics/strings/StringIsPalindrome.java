package com.dsa.basics.strings;

import java.util.Locale;

public class StringIsPalindrome {

    public static void main(String[] args) {
        String s = "Racecar";
        System.out.println(solution(s));
        System.out.println(recursiveSolution(s, 0, s.length() - 1));
    }

    public static boolean solution(String s) {
        s = s.toLowerCase();
        int n = s.length();
        int mid = n / 2;

        for (int i = 0; i < mid; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static boolean recursiveSolution(String s, int si, int ei) {
        s = s.toLowerCase();
        if (si >= ei) {
            return true;
        }

        return (s.charAt(si) == s.charAt(ei)) && recursiveSolution(s, si + 1, ei - 1);
    }
}
