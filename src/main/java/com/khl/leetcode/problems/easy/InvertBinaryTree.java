package com.khl.leetcode.problems.easy;

import com.khl.leetcode.common.TreeNode;

/**
 * 226. Invert Binary Tree
 *
 * Given the `root` of a binary tree, invert the tree, and return its root.
 *
 * @author Kevin Lee
 */
public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left = invertTree(root.right);
        TreeNode right = invertTree(root.left);

        root.left = left;
        root.right = right;

        return root;
    }

}
