package com.dsa.basics.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EncodeStrings {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(solution(s));
    }

    public static String solution(String str) {

        Map<Character, Integer> charFreqMap = new HashMap<>();

        for (Character ch: str.toCharArray()) {
            charFreqMap.put(ch, charFreqMap.getOrDefault(ch, 0) + 1);
        }


        List<Character> chars = new ArrayList<>(charFreqMap.keySet());

        StringBuilder ans = new StringBuilder();
        for (char ch: chars) {
            ans.append(ch).append(charFreqMap.get(ch));
        }
        return ans.toString();
    }
}
