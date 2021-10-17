package com.khl.leetcode.problems.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 * <p>
 * Given an array of integers `nums` and an integer `target`, return indices of
 * the two numbers such that they add up to `target`.
 * </p>
 * <p>
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * </p>
 * <p>
 * You can return the answer in any order.
 * </p>
 *
 * @author Kevin Lee
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (indices.containsKey(complement)) {
                return new int[]{indices.get(complement), i};
            }
            else {
                indices.put(nums[i], i);
            }
        }

        return null;
    }

}
