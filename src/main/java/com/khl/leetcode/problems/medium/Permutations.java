package com.khl.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 46. Permutations
 *
 * Given an array nums of distinct integers, return all the possible
 * permutations. You can return the answer in any order.
 *
 * @author Kevin Lee
 */
public class Permutations {

    private List<List<Integer>> permutations;

    public List<List<Integer>> permute(int[] nums) {
        permutations = new ArrayList<>();

        List<Integer> permutation = new ArrayList<>();

        for (int num : nums) {
            permutation.add(num);
        }

        findPermutations(permutation, 0);

        return permutations;
    }

    private void findPermutations(List<Integer> permutation, int index) {
        if (index == permutation.size() - 1) {
            permutations.add(permutation);
            return;
        }

        for (int i = index + 1; i < permutation.size(); i++) {
            List<Integer> newPermutation = new ArrayList<>(permutation);
            swap(newPermutation, index, i);
            findPermutations(newPermutation, index + 1);
        }

        findPermutations(permutation, index + 1);
    }

    private void swap(List<Integer> nums, int i, int j) {
        int temp = nums.get(i);
        nums.set(i, nums.get(j));
        nums.set(j, temp);
    }

}
