package com.khl.leetcode.problems.easy;

/**
 * 1137. N-th Tribonacci Number
 *
 * The Tribonacci sequence Tn is defined as follows:
 *
 * T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
 *
 * Given n, return the value of Tn.
 *
 * @author Kevin Lee
 */
public class NthTribonacciNumber {

    public int tribonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        else if (n == 2) {
            return 1;
        }

        int t0 = 0;
        int t1 = 1;
        int t2 = 1;

        for (int i = 3; i <= n; i++) {
            int sum = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = sum;
        }

        return t2;
    }

}
