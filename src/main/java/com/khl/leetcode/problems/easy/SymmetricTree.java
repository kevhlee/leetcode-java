package com.khl.leetcode.problems.easy;


import com.khl.leetcode.common.TreeNode;

/**
 * 101. Symmetric Tree
 *
 * Given the root of a binary tree, check whether it is a mirror of itself(i.e.
 * symmetric around its center).
 *
 * @author Kevin Lee
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        return root == null || check(root.left, root.right);
    }

    private boolean check(TreeNode left, TreeNode right) {
        if (left == null) {
            return right == null;
        }
        else if (right == null) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }

        return check(left.left, right.right) && check(left.right, right.left);
    }

}
