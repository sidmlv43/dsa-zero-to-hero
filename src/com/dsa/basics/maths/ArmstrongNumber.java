package com.dsa.basics.maths;

/**
 *  An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
 *  Example 1:
 * Input:N = 153
 * Output:True
 * Explanation: 1^3+5^3+3^3 = 1 + 125 + 27 = 153
 *
 * Example 2:
 * {@code
 *  intput: n = 371
 *  outpit: True
 * }
 * Explanation: 3^3+7^3+1^3 = 27 + 343 + 1 = 371
 */
public class ArmstrongNumber {

    public static void main(String[] args) {
        System.out.println(solution(371));
    }

    public static boolean solution(int n) {
        int num = Math.abs(n);
        int digitCount = (int) Math.log10(num) + 1;
        int sum = 0;

        while (n > 0) {
            int ld = n % 10;

            sum = (int) (sum + Math.pow(ld, digitCount));
            System.out.println(sum);
            n /= 10;
        }

        return sum == num;
    }
}
