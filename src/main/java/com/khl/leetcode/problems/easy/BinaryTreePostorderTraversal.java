package com.khl.leetcode.problems.easy;

import com.khl.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 145. Binary Tree Postorder Traversal
 *
 * Given the `root` of a binary tree, return the postorder traversal of its
 * nodes' values.
 *
 * @author Kevin Lee
 */
public class BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();

        traverse(values, root);

        return values;
    }

    private void traverse(List<Integer> values, TreeNode root) {
        if (root == null) {
            return;
        }

        traverse(values, root.left);
        traverse(values, root.right);

        values.add(root.val);
    }

}
