package com.khl.leetcode.problems.easy;

/**
 * 509. Fibonacci Number
 *
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the
 * Fibonacci sequence, such that each number is the sum of the two preceding
 * ones, starting from 0 and 1. That is,
 *
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 *
 * @author Kevin Lee
 */
public class FibonacciNumber {

    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int f1 = 0;
        int f2 = 1;

        for (int i = 2; i <= n; i++) {
            int sum = f1 + f2;
            f1 = f2;
            f2 = sum;
        }

        return f2;
    }

}
