package com.khl.leetcode.problems.medium;

/**
 * 48. Rotate Image
 *
 * You are given an `n` x `n` 2D `matrix` representing an image, rotate the
 * image by 90 degrees (clockwise).
 *
 * <p>
 * You have to rotate the image in-place, which means you have to modify the
 * input 2D matrix directly. DO NOT allocate another 2D matrix and do the
 * rotation.
 * </p>
 *
 * @author Kevin Lee
 */
public class RotateImage {

    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transpose matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row of matrix
        for (int[] row : matrix) {
            for (int i = 0; i < n / 2; i++) {
                int j = n - (i + 1);

                int temp = row[i];
                row[i] = row[j];
                row[j] = temp;
            }
        }
    }

}
