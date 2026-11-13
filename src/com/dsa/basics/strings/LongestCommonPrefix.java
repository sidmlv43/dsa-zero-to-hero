package com.dsa.basics.strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] s = {"flowers" , "flow" , "fly", "flight"};
        System.out.println(solution(s));
        System.out.println(betterSolution(s));
    }

    public static String solution(String[] arr) {
        int n = arr.length;

        String prefix = arr[0];

        for (int i = 1; i < n; i ++) {
            while (!arr[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }

            if (prefix.isEmpty()) {
                return "";
            }
        }
        return prefix;
    }

    public static String betterSolution(String[] strings) {
        Arrays.sort(strings);
        int n = strings.length;

        String prefix = strings[0];

        for (int i = 1; i < n; i ++) {
            while (!strings[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }

            if (prefix.isEmpty()) {
                return "";
            }
        }
        return prefix;
    }
}
