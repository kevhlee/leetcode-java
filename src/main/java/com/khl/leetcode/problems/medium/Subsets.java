package com.khl.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 78. Subsets
 *
 * Given an integer array nums of unique elements, return all possible subsets
 * (the power set).
 *
 * The solution set must not contain duplicate subsets. Return the solution in
 * any order.
 *
 * @author Kevin Lee
 */
public class Subsets {

    private int[] nums;
    private List<List<Integer>> subsets;

    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        this.subsets = new ArrayList<>();

        generate(new ArrayList<>(), 0);

        return subsets;
    }

    private void generate(List<Integer> subset, int index) {
        if (index >= nums.length) {
            subsets.add(subset);
            return;
        }

        // Choose to add current num
        List<Integer> newSubset = new ArrayList<>(subset);
        newSubset.add(nums[index]);
        generate(newSubset, index + 1);

        // Choose not to add current num
        generate(subset, index + 1);
    }

}
