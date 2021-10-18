package com.khl.leetcode.problems.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 217. Contains Duplicate
 *
 * Given an integer array `nums`, return `true` if any value appears at least
 * twice in the array, and return `false` if every element is distinct.
 *
 * @author Kevin Lee
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }

            seen.add(num);
        }

        return false;
    }

}
