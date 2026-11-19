package com.dsa.medium;

import java.util.*;

public class ArrayProblems {
    public static void main(String[] args) {
        int[] nums = {1, 1, 3, 1, 2, 3, 2, 4, 1, 1, 1, 1, 1};
        System.out.println(majorityElement(nums));

        System.out.println(findLeadersInArray(nums));

        int[] randoms = {1, 4, 2, 4, 10, 4};
//        System.out.println(Arrays.toString(twoSum(randoms, 6)));

        int[] twoSumAns = twoSumIndices(randoms, 3);
        System.out.println("-----");
        System.out.println(Arrays.toString(twoSumAns));

        System.out.println(Arrays.toString(threeSumProblem(randoms, 16)));

    }

    public static int majorityElement(int[] arr) {
        int candidate = arr[0];
        int count = 1;


        for (int i = 1; i < arr.length; i++) {

            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
            else if (arr[i] == candidate) {
                count++;
            }
            else {
                count--;
            }
        }

        int actualCount = 0;

        for (int n: arr) {
            if (n == candidate) {
                actualCount++;
            }
        }


        if (actualCount > arr.length / 2) {
            return candidate;
        }

        return Integer.MIN_VALUE;

    }

    public static List<Integer> findLeadersInArray(int[] arr) {
        int n = arr.length;

        List<Integer> leaders = new ArrayList<>();
        int currentLeader = arr[n - 1];
        leaders.add(arr[n -1]);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > currentLeader) {
                leaders.add(arr[i]);
                currentLeader = arr[i];
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }


    public static int[] twoSum (int[] arr, int target) {

        Arrays.sort(arr);

        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int sum = arr[low] + arr[high];

            if (sum == target) {
                return new int[] {arr[low], arr[high]};
            }

            else if (sum > target) {
                high--;
            }
            else {
                low++;
            }
        }

        return new int[] {-1, -1};
    }


    public static int[] twoSumIndices(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            int required = target - n;
            System.out.println("n = " + n);
            System.out.println("required = " + required);

            if (map.containsKey(required)) {
                return new int[] {map.get(required), i};
            }

            map.put(arr[i], i);
        }

        return new int[] {-1, -1};
    }



    // [1, 2, 4, 5, 7, 9, 10], target 10

    public static int[] threeSumProblem(int[] arr, int target) {
        int[] arrCopy = arr.clone();

        int[] result = {-1, -1, -1};

        int n = arrCopy.length;

        for (int i = 0; i < n - 3; i++) {

            if (arrCopy[i] > target) {
                return new int[] {-1, -1, -1}; // if current element is greater than sum, as it is sorted, answer is not present
            }

            int left = i + 1, right = n - 1;

            while (left < right) {
                int currentSum = arrCopy[i] + arrCopy[left] + arrCopy[right];

                if (currentSum == target) {
                    result = new int[] {arrCopy[i], arrCopy[left], arrCopy[right]};

                    // skip the duplicates
                    while((left < right) && (arrCopy[left] == arrCopy[left - 1])) {
                        left++;
                    }

                    while (left < right && arrCopy[right] < arrCopy[right - 1]) {
                        right--;
                    }
                }

                else if (currentSum < target) {
                    left++;
                }

                else {
                    right--;
                }
            }
        }

        return result;

    }
}
