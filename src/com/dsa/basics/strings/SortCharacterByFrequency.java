package com.dsa.basics.strings;

import java.util.*;

public class SortCharacterByFrequency {

    public static void main(String[] args) {
        String s = "free";
        System.out.println(solution(s));
    }

    public static String solution(String str) {


        // 1. Count frequency

        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch: str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        List<Character> chars = new ArrayList<>(freqMap.keySet());

        chars.sort(Comparator.comparingInt(freqMap::get));

        return String.join("", chars.stream().map(String::valueOf).toList());
    }


}
