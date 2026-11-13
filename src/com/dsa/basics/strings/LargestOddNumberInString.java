package com.dsa.basics.strings;

public class LargestOddNumberInString {

    public static void main(String[] args) {
        // 02145921

        System.out.println(solution("0214592"));
    }

    public static String solution(String s) {

        int n = s.length();

        // find the index of rightmost odd
        int rightMostOddIndex = -1;
        for (int i = n - 1; i >= 0 ; i--) {
            int a = s.charAt(i) - '0';

            if (a % 2 != 0) {
                rightMostOddIndex = i;
                break;
            }
        }

        if (rightMostOddIndex == -1) {
            return "";
        }

        return s.substring(0, rightMostOddIndex + 1);
    }

}
