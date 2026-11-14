package com.dsa.basics.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram", t = "granaasm";
        System.out.println(solution(s, t));
    }

    public static boolean solution(String s1, String s2) {

        if (s1.length() != s2.length()) return false;

       char[] chars1 = s1.toCharArray();
       char[] chars2 = s2.toCharArray();

       Arrays.sort(chars1);
       Arrays.sort(chars2);


       return new String(chars1).equals(new String(chars2));

    }
}
