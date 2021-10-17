package com.khl.leetcode.problems.easy;

import com.khl.leetcode.common.TreeNode;

/**
 * 100. Same Tree
 *
 * Given the roots of two binary trees `p` and `q`, write a function to check if
 * they are the same or not.
 *
 * Two binary trees are considered the same if they are structurally identical,
 * and the nodes have the same value.
 *
 * @author Kevin Lee
 */
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p != null && q != null) {
            return p.val == q.val && isSameTree(p.left, q.left) &&
                    isSameTree(p.right, q.right);
        }

        return false;
    }

}
