package com.dsa.basics.maths;


/**
 * The GCD of two numbers is the largest number that divides both of them without leaving a remainder.
 */
public class GCD {
    public static void main(String[] args) {
        System.out.println(bruteForceSolution(24, 36));
        System.out.println(optimalSolution(16, 36));
        System.out.println(recursiveSolution(16, 36));
    }


    // GCD will always be less than or equals to the Minimum of n1 and n2
    public static int bruteForceSolution(int n1, int n2) {

        n1 = Math.abs(n1);
        n2 = Math.abs(n2);
        int min = Math.min(n1, n2);

        int gcd = 1;
        for (int i = 2; i <= min; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    /**
     *  The Euclidean Algorithm is a method for finding the greatest common divisor (GCD) of two numbers. It operates on the principle that the GCD of two numbers remains the same even if the smaller number is subtracted from the larger number.
     *
     * To find the GCD of n1 and n2 where n1 > n2:
     *
     *     Repeatedly subtract the smaller number from the larger number until one of them becomes 0.
     *     Once one becomes 0, the other is the GCD of the original numbers.
     */
    public static int optimalSolution(int n1, int n2) {
        n1 = Math.abs(n1);
        n2 = Math.abs(n2);
        while (n1 > 0 && n2 > 0) {
            if (n1 > n2) {
                n1 = n1 % n2;
            }
            else {
                n2 = n2 % n1;
            }
        }

        return n1 == 0 ? n2 : n1;
    }

    public static int recursiveSolution(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0){
            return b;
        }
        if (b == 0) {
            return a;
        }

        if (a > b) {
            return recursiveSolution(a % b, b);
        }
        else {
            return recursiveSolution(b % a, a);
        }
    }
}
