package com.khl.leetcode.problems.easy;

import com.khl.leetcode.common.ListNode;

/**
 * 141. Linked List Cycle
 *
 * Given `head`, the head of a linked list, determine if the linked list has a
 * cycle in it.
 *
 * There is a cycle in a linked list if there is some node in the list that can
 * be reached again by continuously following the `next` pointer. Internally,
 * `pos` is used to denote the index of the node that tail's `next` pointer is
 * connected to. Note that `pos` is not passed as a parameter.
 *
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 *
 * @author Kevin Lee
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode p1 = head;
        ListNode p2 = head;

        while (p1 != null && p2 != null) {
            p1 = p1.next;
            p2 = p2.next;

            if (p2 != null) {
                p2 = p2.next;

                if (p1 == p2) {
                    return true;
                }
            }
        }

        return false;
    }

}
