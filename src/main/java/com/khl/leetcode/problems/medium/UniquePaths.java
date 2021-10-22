package com.khl.leetcode.problems.medium;

/**
 * 62. Unique Paths
 *
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in
 * the diagram below).
 *
 * The robot can only move either down or right at any point in time. The robot
 * is trying to reach the bottom-right corner of the grid (marked 'Finish' in
 * the diagram below).
 *
 * How many possible unique paths are there?
 *
 * @author Kevin Lee
 */
public class UniquePaths {

    public int uniquePaths(int m, int n) {
        int N = m + n - 2;
        int r = Math.min(m - 1, n - 1);

        double result = 1;

        for (int i = 1; i <= r; i++) {
            result = result * (N - r + i) / i;
        }

        return (int) result;
    }

}
