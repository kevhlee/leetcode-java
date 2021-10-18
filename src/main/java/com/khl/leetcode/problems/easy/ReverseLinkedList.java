package com.khl.leetcode.problems.easy;

import com.khl.leetcode.common.ListNode;

/**
 * 206. Reverse Linked List
 *
 * Given the `head` of a singly linked list, reverse the list, and return the
 * reversed list.
 *
 * @author Kevin Lee
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }

}
