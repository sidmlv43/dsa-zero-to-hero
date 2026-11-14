package com.dsa.basics.strings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public static void main(String[] args) {

    }

    public static boolean solution(String s1, String s2) {

        // TODO

        if (s1.length() != s2.length()) return false;

        Map<Character, Character> charMap = new HashMap<>();

        for (Character ch: s1.toCharArray()) {
            Character mapped = charMap.get(ch);
            if(mapped == null) {
                charMap.put(ch, s2.charAt(s2.indexOf(ch)));
            }

            else {
//                if (mapped)
            }
        }

        return true;
    }
}
