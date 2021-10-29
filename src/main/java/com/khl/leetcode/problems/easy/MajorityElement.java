package com.khl.leetcode.problems.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 169. Majority Element
 *
 * Given an array nums of size n, return the majority element.
 *
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 *
 * @author Kevin Lee
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();

        for (int num : nums) {
            int count = counts.getOrDefault(num, 0) + 1;

            if (count > nums.length / 2) {
                return num;
            }

            counts.put(num, count);
        }

        // Technically, the program will never reach here
        return -1;
    }

}
