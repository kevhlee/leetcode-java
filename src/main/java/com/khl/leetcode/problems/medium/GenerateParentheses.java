package com.khl.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. Generate Parentheses
 *
 * Given `n` pairs of parentheses, write a function to generate all combinations
 * of well-formed parentheses.
 *
 * @author Kevin Lee
 */
public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> combinations = new ArrayList<>();

        generate(combinations, "", n, n);

        return combinations;
    }

    private void generate(
            List<String> combinations, String combination, int left,
            int right) {

        if (left == 0 && right == 0) {
            combinations.add(combination);
        }

        if (left > 0) {
            generate(combinations, combination + "(", left - 1, right);
        }

        if (right > left) {
            generate(combinations, combination + ")", left, right - 1);
        }
    }

}
