package com.khl.leetcode.problems.easy;

import com.khl.leetcode.common.TreeNode;

/**
 * 104. Maximum Depth of Binary Tree
 *
 * Given the `root` of a binary tree, return its maximum depth.
 *
 * A binary tree's maximum depth is the number of nodes along the longest path
 * from the root node down to the farthest leaf node.
 *
 * @author Kevin Lee
 */
public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        return (root == null) ? 0 :
                Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}
