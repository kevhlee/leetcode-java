package com.khl.leetcode.problems.hard;

import java.util.Arrays;

/**
 * 52. N-Queens II
 *
 * The n-queens puzzle is the problem of placing `n` queens on an `n x n`
 * chessboard such that no two queens attack each other.
 *
 * Given an integer `n`, return the number of distinct solutions to the
 * n-queens puzzle.
 *
 * @author Kevin Lee
 */
public class NQueensII {

    public int totalNQueens(int n) {
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        return solve(board, Integer.MAX_VALUE, 0);
    }

    private int solve(char[][] board, int previousRow, int col) {
        if (col == board.length) {
            return 1;
        }

        int count = 0;

        for (int row = 0; row < board.length; row++) {
            if (Math.abs(previousRow - row) < 2) {
                continue;
            }

            if (isValidPlacement(board, row, col)) {
                board[row][col] = 'Q';
                count += solve(board, row, col + 1);
                board[row][col] = '.';
            }
        }

        return count;
    }

    private boolean isValidPlacement(char[][] board, int row, int col) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q' || board[row][i] == 'Q') {
                return false;
            }
        }

        int i = row - 1;
        int j = col - 1;

        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q') {
                return false;
            }

            i--;
            j--;
        }

        i = row + 1;
        j = col - 1;

        while (i < board.length && j >= 0) {
            if (board[i][j] == 'Q') {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

}
