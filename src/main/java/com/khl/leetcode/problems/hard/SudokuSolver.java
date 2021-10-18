package com.khl.leetcode.problems.hard;

import java.util.Arrays;

/**
 * 37. Sudoku Solver
 *
 * Write a program to solve a Sudoku puzzle by filling the empty cells.
 *
 * A sudoku solution must satisfy all of the following rules:
 *
 * 1. Each of the digits `1-9` must occur exactly once in each row.
 * 2. Each of the digits `1-9` must occur exactly once in each column.
 * 3. Each of the digits `1-9` must occur exactly once in each of the 9 `3x3`
 *    sub-boxes of the grid.
 *
 * The '.' character indicates empty cells.
 *
 * @author Kevin Lee
 */
public class SudokuSolver {

    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    private boolean solve(char[][] board, int row, int col) {
        if (row == 9) {
            return true;
        }
        else if (col == 9) {
            return solve(board, row + 1, 0);
        }

        if (board[row][col] == '.') {
            for (char choice = '1'; choice <= '9'; choice++) {
                board[row][col] = choice;

                if (checkChoice(board, row, col) && solve(board, row, col + 1)) {
                    return true;
                }

                board[row][col] = '.';
            }

            return false;
        }
        else {
            return solve(board, row, col + 1);
        }
    }

    private boolean checkChoice(char[][] board, int row, int col) {
        // Check row
        for (int j = 0; j < 9; j++) {
            if (j == col) {
                continue;
            }

            if (board[row][j] == board[row][col]) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < 9; i++) {
            if (i == row) {
                continue;
            }

            if (board[i][col] == board[row][col]) {
                return false;
            }
        }

        // Check subgrid
        int rowOffset = 3 * (row / 3);
        int colOffset = 3 * (col / 3);

        for (int i = rowOffset; i < rowOffset + 3; i++) {
            for (int j = colOffset; j < colOffset + 3; j++) {
                if (i == row && j == col) {
                    continue;
                }

                if (board[i][j] == board[row][col]) {
                    return false;
                }
            }
        }

        return true;
    }

}
