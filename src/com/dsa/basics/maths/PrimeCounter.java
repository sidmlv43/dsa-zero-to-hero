package com.dsa.basics.maths;

import java.util.Arrays;

public class PrimeCounter {
    private static final int maxLimit = 1000000;
    private static int[] prefixCount = new int[maxLimit + 1];

    public static void preComputePrimes () {
        boolean[] isPrime = new boolean[maxLimit + 1];
        Arrays.fill(isPrime, true);
        if (maxLimit >= 0) isPrime[0] = false;
        if (maxLimit >= 1) isPrime[1] = false;

        for (int p = 2; p * p <= maxLimit; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= maxLimit; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        int currentCount = 0;
        for (int i = 0; i <= maxLimit; i++) {
            if (isPrime[i]) {
                currentCount++;
            }
            prefixCount[i] = currentCount;
        }

        
    }
}
