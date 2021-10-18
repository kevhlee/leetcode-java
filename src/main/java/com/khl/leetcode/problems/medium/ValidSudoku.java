package com.khl.leetcode.problems.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * 36. Valid Sudoku
 *
 * Determine if a `9 x 9` Sudoku board is valid. Only the filled cells need to
 * be validated according to the following rules:
 *
 * 1. Each row must contain the digits `1-9` without repetition.
 * 2. Each column must contain the digits `1-9` without repetition.
 * 3. Each of the nine `3 x 3` sub-boxes of the grid must contain the digits
 *    `1-9` without repetition.
 *
 * Note:
 * - A Sudoku board (partially filled) could be valid but is not necessarily
 *   solvable.
 * - Only the filled cells need to be validated according to the mentioned rules.
 *
 * @author Kevin Lee
 */
public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        return checkRowsAndColumns(board) && checkSubBoxes(board);
    }

    private boolean checkRowsAndColumns(char[][] board) {
        Set<Character> rowSet = new HashSet<>();
        Set<Character> colSet = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !rowSet.add(board[i][j])) {
                    return false;
                }
                if (board[j][i] != '.' && !colSet.add(board[j][i])) {
                    return false;
                }
            }

            rowSet.clear();
            colSet.clear();
        }

        return true;
    }

    private boolean checkSubBoxes(char[][] board) {
        Set<Character> boxSet = new HashSet<>();

        for (int rowOffset = 0; rowOffset < 9; rowOffset += 3) {
            for (int colOffset = 0; colOffset < 9; colOffset += 3) {
                for (int i = rowOffset; i < rowOffset + 3; i++) {
                    for (int j = colOffset; j < colOffset + 3; j++) {
                        if (board[i][j] != '.' && !boxSet.add(board[i][j])) {
                            return false;
                        }
                    }
                }

                boxSet.clear();
            }
        }

        return true;
    }

}
