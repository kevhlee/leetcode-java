package com.khl.leetcode.problems.hard;

import com.khl.leetcode.common.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 23. Merge k Sorted Lists
 * <p>
 * You are given an array of `k` linked-lists `lists`, each linked-list is
 * sorted in ascending order.
 * </p>
 * <p>
 * Merge all the linked-lists into one sorted linked-list and return it.
 * </p>
 */
public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        return merge(lists);
    }

    private PriorityQueue<ListNode> initPriorityQueue(ListNode[] lists) {
        PriorityQueue<ListNode> heads = new PriorityQueue<>(
                Comparator.comparingInt(a -> a.val));

        for (ListNode list : lists) {
            if (list == null) {
                continue;
            }

            heads.add(list);
        }

        return heads;
    }

    private ListNode merge(ListNode[] lists) {
        PriorityQueue<ListNode> heads = initPriorityQueue(lists);

        if (heads.isEmpty()) {
            return null;
        }

        ListNode mergedHead = null;
        ListNode mergedNode = null;

        while (!heads.isEmpty()) {
            ListNode head = heads.remove();

            if (head.next != null) {
                heads.add(head.next);
                head.next = null;
            }

            if (mergedHead == null) {
                mergedHead = head;
                mergedNode = mergedHead;
            }
            else {
                mergedNode.next = head;
                mergedNode = mergedNode.next;
            }
        }

        return mergedHead;
    }

}
