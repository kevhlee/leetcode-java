package com.khl.leetcode.problems.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 *
 * Given an array of integers `nums` and an integer `target`, return indices of
 * the two numbers such that they add up to `target`.
 *
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 *
 * You can return the answer in any order.
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
