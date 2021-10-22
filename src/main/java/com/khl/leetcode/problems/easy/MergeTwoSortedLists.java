package com.khl.leetcode.problems.easy;

import com.khl.leetcode.common.ListNode;

/**
 * 21. Merge Two Sorted Lists
 *
 * Merge two sorted linked lists and return it as a sorted list. The list
 * should be made by splicing together the nodes of the first two lists.
 *
 * @author Kevin Lee
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }

        ListNode mergedHead = null;
        ListNode mergedNode = null;

        while (l1 != null && l2 != null) {
            ListNode node;

            if (l1.val < l2.val) {
                node = l1;
                l1 = l1.next;
            }
            else {
                node = l2;
                l2 = l2.next;
            }

            if (mergedHead == null) {
                mergedHead = node;
                mergedNode = node;
            }
            else {
                mergedNode.next = node;
                mergedNode = mergedNode.next;
            }
        }

        while (l1 != null) {
            mergedNode.next = l1;
            mergedNode = mergedNode.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            mergedNode.next = l2;
            mergedNode = mergedNode.next;
            l2 = l2.next;
        }

        return mergedHead;
    }

}
