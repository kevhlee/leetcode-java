package com.khl.leetcode.problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 118. Pascal's Triangle
 *
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 *
 * @author Kevin Lee
 */
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rows = new ArrayList<>();
        List<Integer> previousRow = Arrays.asList(1);

        rows.add(Arrays.asList(1));

        for (int i = 2; i <= numRows; i++) {
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            int previousElement = previousRow.get(0);

            for (int j = 1; j < previousRow.size(); j++) {
                int currentElement = previousRow.get(j);
                currentRow.add(currentElement + previousElement);
                previousElement = currentElement;
            }

            currentRow.add(1);
            rows.add(currentRow);
            previousRow = currentRow;
        }

        return rows;
    }

}
