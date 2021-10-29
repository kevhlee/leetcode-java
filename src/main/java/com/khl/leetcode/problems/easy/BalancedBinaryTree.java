package com.khl.leetcode.problems.easy;

import com.khl.leetcode.common.TreeNode;

/**
 * 110. Balanced Binary Tree
 *
 * Given a binary tree, determine if it is height-balanced.
 *
 * For this problem, a height-balanced binary tree is defined as: a binary tree
 * in which the left and right subtrees of every node differ in height by no
 * more than 1.
 *
 * @author Kevin Lee
 */
public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        return checkDepth(root) != -1;
    }

    private int checkDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = checkDepth(root.left);
        if (leftDepth == -1) {
            return -1;
        }

        int rightDepth = checkDepth(root.right);
        if (rightDepth == -1) {
            return -1;
        }

        if (Math.abs(leftDepth - rightDepth) > 1) {
            return -1;
        }

        return Math.max(leftDepth, rightDepth) + 1;
    }

}
