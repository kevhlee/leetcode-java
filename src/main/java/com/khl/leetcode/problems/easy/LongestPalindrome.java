package com.khl.leetcode.problems.easy;

/**
 * 409. Longest Palindrome
 *
 * Given a string `s` which consists of lowercase or uppercase letters, return
 * the length of the longest palindrome that can be built with those letters.
 *
 * Letters are case-sensitive, for example, "Aa" is not considered a palindrome
 * here.
 *
 * @author Kevin Lee
 */
public class LongestPalindrome {

    public int longestPalindrome(String s) {
        int[] counts = new int[('z' - 'A') + 1];
        char offset = 'A';

        for (char c : s.toCharArray()) {
            counts[c - offset]++;
        }

        int length = 0;
        int total = 0;

        for (int count : counts) {
            total += count;
            length += 2 * (count / 2);
        }

        return (length == total) ? length : length + 1;
    }

}
