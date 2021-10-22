package com.khl.leetcode.problems.easy;

import com.khl.leetcode.common.ListNode;

/**
 * 83. Given the head of a sorted linked list, delete all duplicates such that
 * each element appears only once. Return the linked list sorted as well.
 *
 * @author Kevin Lee
 */
public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode node = head;

        while (node != null) {
            ListNode next = node.next;

            while (next != null && node.val == next.val) {
                next = next.next;
            }

            node.next = next;
            node = node.next;
        }

        return head;
    }

}
