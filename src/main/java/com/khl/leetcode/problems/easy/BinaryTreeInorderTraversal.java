package com.khl.leetcode.problems.easy;

import com.khl.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. Binary Tree Inorder Traversal
 *
 * Given the root of a binary tree, return the inorder traversal of its nodes'
 * values.
 *
 * @author Kevin Lee
 */
public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();

        traverse(values, root);

        return values;
    }

    private void traverse(List<Integer> values, TreeNode root) {
        if (root == null) {
            return;
        }

        traverse(values, root.left);

        values.add(root.val);

        traverse(values, root.right);
    }

}
