package com.dsa.basics.hashing;

import java.util.HashMap;
import java.util.Map;

public class HighestOccurringElement {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 2, 1, 2, 3, 1, 4, 2, 2, 1, 3, 3, 3};
        System.out.println(solution(numbers));
    }


    public static int solution(int[] arr) {
        int ans = Integer.MIN_VALUE;

        Map<Integer, Integer> counter = new HashMap<>();

        for (int num: arr) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }

        int maxCount = Integer.MIN_VALUE;
        for (int key: counter.keySet()) {
            int count = counter.get(key);
            if (count > maxCount) {
                maxCount = count;
                ans = key;
            }
        }

        return ans;
    }
}
