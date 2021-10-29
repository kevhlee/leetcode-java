package com.khl.leetcode.problems.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 51. N-Queens
 *
 * The n-queens puzzle is the problem of placing `n` queens on an `n x n`
 * chessboard such that no two queens attack each other.
 *
 * Given an integer `n`, return all distinct solutions to the n-queens puzzle.
 * You may return the answer in any order.
 *
 * Each solution contains a distinct board configuration of the n-queens'
 * placement, where `'Q'` and `'.'` both indicate a queen and an empty space,
 * respectively.
 *
 * @author Kevin Lee
 */
public class NQueens {

    private List<List<String>> solutions;

    public List<List<String>> solveNQueens(int n) {
        this.solutions = new ArrayList<>();

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        solve(board, Integer.MAX_VALUE, 0);

        return solutions;
    }

    private void solve(char[][] board, int previousRow, int col) {
        if (col == board.length) {
            List<String> solution = new ArrayList<>();

            for (char[] row : board) {
                solution.add(new String(row));
            }

            solutions.add(solution);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (Math.abs(previousRow - row) < 2) {
                continue;
            }

            if (isValidPlacement(board, row, col)) {
                board[row][col] = 'Q';
                solve(board, row, col + 1);
                board[row][col] = '.';
            }
        }
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
