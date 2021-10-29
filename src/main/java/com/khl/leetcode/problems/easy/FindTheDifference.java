package com.khl.leetcode.problems.easy;

/**
 * 389. Find the Difference
 *
 * You are given two strings `s` and `t`.
 *
 * String `t` is generated by random shuffling string s and then add one more
 * letter at a random position.
 *
 * Return the letter that was added to `t`.
 *
 * @author Kevin Lee
 */
public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        int[] counts = new int[26];
        char offset = 'a';

        for (char ch : s.toCharArray()) {
            counts[ch - offset]++;
        }

        for (char ch : t.toCharArray()) {
            if (counts[ch - offset] == 0) {
                return ch;
            }
            counts[ch - offset]--;
        }

        // Program should never reach this point
        return '0';
    }

}
