package com.khl.leetcode.problems.easy;

import com.khl.leetcode.common.TreeNode;

/**
 * 112. Path Sum
 *
 * Given the `root` of a binary tree and an integer `targetSum`, return true if
 * the tree has a root-to-leaf path such that adding up all the values along
 * the path equals `targetSum`.
 *
 * A leaf is a node with no children.
 *
 * @author Kevin Lee
 */
public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        else if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }
        else {
            return hasPathSum(root.left, targetSum - root.val) ||
                    hasPathSum(root.right, targetSum - root.val);
        }
    }

}
