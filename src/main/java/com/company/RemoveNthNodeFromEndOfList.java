package com.company;

import com.company.structures.ListNode;

/* #19
 * Reflection: I knew how to find the nth node from the end already which is like half the battle. Kind of cheating a
 *             little bit :P
 *
 * Optimal Solution Reflection: naming the faster pointer "fast" and trailing "slow" is clearer than left and right.
 *                              I'll do it like that next item
 *
 *                              "Since we will need access to the node before the target node in order to remove the
 *                              target node, we can use fast.next == null as our exit condition, rather than
 *                              fast == null, so that we stop one node earlier." - smart!
 *
 *                              we dont actually need the "remove target" pointer!
 *
 */
public class RemoveNthNodeFromEndOfList {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    // Solution 1
    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Nth Node From End of List.
    // Memory Usage: 41.8 MB, less than 65.17% of Java online submissions for Remove Nth Node From End of List.
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // two pointers: Joseph gave me this answer already HAHAHAH
        // we discussed this question like 3 years ago. Shocked I remember it
        ListNode left = null;
        ListNode remove = null;
        ListNode right = head;
        for (int i = 0; i < n; i++) {
            right = right.next;
        }

        if (right == null) {
            return head.next;
        } else {
            // 1st iteration
            left = head;
            remove = head.next;
            right = right.next;
            if (right == null) {
                left.next = remove.next;
                return head;
            }

            while (right != null) {
                left = left.next;
                remove = remove.next;
                right = right.next;
            }
        }
        left.next = remove.next;
        return head;
    }


    // solution 2 - cleaned up code
    // Runtime: 1 ms, faster than 57.29% of Java online submissions for Remove Nth Node From End of List.
    // Memory Usage: 42.7 MB, less than 16.74% of Java online submissions for Remove Nth Node From End of List.
    public ListNode removeNthFromEnd2(ListNode head, int n) {

        ListNode left = null;
        ListNode remove = null;
        ListNode right = head;
        for (int i = 0; i < n; i++) {
            right = right.next;
        }

        if (right == null) {
            // item to remove is the first value
            return head.next;
        } else {
            // 1st iteration
            left = head;
            remove = head.next;
            right = right.next;

            // loop
            while (right != null) {
                left = left.next;
                remove = remove.next;
                right = right.next;
            }
        }
        left.next = remove.next;
        return head;
    }

    // optimal solution
    public ListNode removeNthFromEndOptimal(ListNode head, int n) {
        ListNode fast = head, slow = head;
        for (int i = 0; i < n; i++) fast = fast.next;
        if (fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

}
