package com.khl.leetcode.problems.medium;

/**
 * 200. Number of Islands
 *
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and
 * '0's (water), return the number of islands.
 *
 * An island is surrounded by water and is formed by connecting adjacent lands
 * horizontally or vertically. You may assume all four edges of the grid are
 * all surrounded by water.
 *
 * @author Kevin Lee
 */
public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (findIsland(grid, i, j)) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean findIsland(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length) {
            return false;
        }

        if (grid[i][j] == '0') {
            return false;
        }

        grid[i][j] = '0';
        findIsland(grid, i - 1, j);
        findIsland(grid, i + 1, j);
        findIsland(grid, i, j - 1);
        findIsland(grid, i, j + 1);

        return true;
    }

}
