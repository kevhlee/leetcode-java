package com.khl.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 39. Combination Sum
 *
 * Given an array of distinct integers `candidates` and a target integer
 * `target`, return a list of all unique combinations of `candidates` where the
 * chosen numbers sum to `target`. You may return the combinations in any order.
 *
 * The same number may be chosen from `candidates` an unlimited number of times.
 * Two combinations are unique if the frequency of at least one of the chosen
 * numbers is different.
 *
 * It is guaranteed that the number of unique combinations that sum up to
 * `target` is less than `150` combinations for the given input.
 *
 * @author Kevin Lee
 */
public class CombinationSum {

    private int[] candidates;
    private List<List<Integer>> combinations;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.candidates = candidates;
        this.combinations = new ArrayList<>();

        findCombinations(new ArrayList<>(), 0, target);

        return combinations;
    }

    private void findCombinations(
            List<Integer> combination, int index, int target) {

        if (target == 0) {
            combinations.add(combination);
            return;
        }
        else if (index >= candidates.length) {
            return;
        }

        int newTarget = target - candidates[index];

        if (newTarget >= 0) {
            List<Integer> newCombination = new ArrayList<>(combination);

            newCombination.add(candidates[index]);

            findCombinations(newCombination, index, newTarget);
        }

        findCombinations(combination,index + 1, target);
    }

}
