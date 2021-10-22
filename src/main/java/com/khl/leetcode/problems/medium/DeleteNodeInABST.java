package com.khl.leetcode.problems.medium;

import com.khl.leetcode.common.TreeNode;

/**
 * 450. Delete Node in a BST
 *
 * Given a root node reference of a BST and a key, delete the node with the
 * given key in the BST. Return the root node reference (possibly updated) of
 * the BST.
 *
 * Basically, the deletion can be divided into two stages:
 *
 * 1. Search for a node to remove.
 * 2. If the node is found, delete the node.
 *
 * @author Kevin Lee
 */
public class DeleteNodeInABST {

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }
        else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }
        else {
            return deleteNode(root);
        }

        return root;
    }

    private TreeNode deleteNode(TreeNode root) {
        int numberOfChildren =
                (root.left != null ? 1 : 0) + (root.right != null ? 1 : 0);

        if (numberOfChildren == 0) {
            return null;
        }
        else if (numberOfChildren == 1) {
            return (root.left != null) ? root.left : root.right;
        }
        else {
            TreeNode successor = findSuccessorNode(root.right);

            root.val = successor.val;
            root.right = deleteNode(root.right, successor.val);

            return root;
        }
    }

    private TreeNode findSuccessorNode(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

}
