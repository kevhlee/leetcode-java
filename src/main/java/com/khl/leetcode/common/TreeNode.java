package com.khl.leetcode.common;

/**
 * Definition for a binary tree node.
 *
 * @author Kevin Lee
 */
public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode buildTree(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        else if (arr.length == 1) {
            return new TreeNode(arr[0]);
        }

        TreeNode[] nodes = new TreeNode[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                nodes[i] = new TreeNode(arr[i]);
            }
        }

        for (int i = 0; i < (arr.length - 1) / 2; i++) {
            if (nodes[i] == null) {
                continue;
            }

            int left = 2 * i + 1;
            int right = 2 * i + 2;

            nodes[i].left = nodes[left];

            if (right < arr.length) {
                nodes[i].right = nodes[right];
            }
        }

        return nodes[0];
    }

}