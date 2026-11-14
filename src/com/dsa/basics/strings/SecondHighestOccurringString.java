package com.dsa.basics.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SecondHighestOccurringString {

    public static void main(String[] args) {
        String str = "iddkdk";
        System.out.println(solution(str));
    }

    public static String solution(String str) {

        // create freq count
        Map<Character, Integer> charFrequency = new HashMap<>();

        for (Character ch: str.toCharArray()) {
            charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
        }

        int max = 0, secMax = Integer.MIN_VALUE;
        Character maxCharacter = '_', secMaxCharacter = '_';
        for (char ch: charFrequency.keySet()) {
            int count = charFrequency.get(ch);

            if (count > max) {
                secMax = max;
                secMaxCharacter = maxCharacter;
                max = count;
                maxCharacter = ch;
            }
            else {
                if (count > secMax) {
                    secMax = count;
                    secMaxCharacter = ch;
                }
            }

        }
        return secMaxCharacter.toString();
    }
}
