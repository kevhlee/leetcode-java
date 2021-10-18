package com.khl.leetcode.problems.easy;

import com.khl.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 144. Binary Tree Preorder Traversal
 *
 * Given the `root` of a binary tree, return the preorder traversal of its
 * nodes' values.
 *
 * @author Kevin Lee
 */
public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();

        traverse(values, root);

        return values;
    }

    private void traverse(List<Integer> values, TreeNode root) {
        if (root == null) {
            return;
        }

        values.add(root.val);

        traverse(values, root.left);
        traverse(values, root.right);
    }

}
