package com.khl.leetcode.problems.easy;

import java.util.Stack;

/**
 * 20. Valid Parentheses
 *
 * Given a string `s` containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * 1. Open brackets must be closed by the same type of brackets.
 * 2. Open brackets must be closed in the correct order.
 *
 * @author Kevin Lee
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (isLeft(c)) {
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                if (!matches(stack.pop(), c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private boolean isLeft(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    private boolean matches(char left, char right) {
        switch (left) {
            case '(':
                return right == ')';
            case '[':
                return right == ']';
            case '{':
                return right == '}';
            default:
                return false;
        }
    }

}
