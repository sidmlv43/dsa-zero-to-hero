package com.dsa.basics.hashing;

import java.util.HashMap;
import java.util.Map;

public class SecondHighestOccuringElement {

    public static void main(String[] args) {
        int[] n = {1, 1, 2, 1, 2, 1, 2, 3, 3, 2, 3, 1, 3, 1, 3};
        System.out.println(solution(n));
    }


    public static int solution(int[] arr) {
        int highest = arr[0], secondHighest = Integer.MIN_VALUE;
        Map<Integer, Integer> counter = new HashMap<>();

        for (int num: arr) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }

        int maxCount = Integer.MIN_VALUE;
        int secMaxCount = 0;
        for (int key: counter.keySet()) {
            int count = counter.get(key);
            if (count > secMaxCount) {
                if (count > maxCount) {
                    secMaxCount = maxCount;
                    maxCount = count;
                    secondHighest = key;
                }
                else {
                    secMaxCount = count;
                    secondHighest = key;
                }
            }
        }

        System.out.println(counter);

        return secondHighest;
    }

}
