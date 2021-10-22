package com.khl.leetcode.problems.easy;

/**
 * 9. Palindrome Number
 *
 * Given an integer x, return true if x is palindrome integer.
 *
 * An integer is a palindrome when it reads the same backward as forward. For
 * example, 121 is palindrome while 123 is not.
 *
 * @author Kevin Lee
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String s = "" + x;

        int length = s.length();

        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - (i + 1))) {
                return false;
            }
        }

        return true;
    }

}
