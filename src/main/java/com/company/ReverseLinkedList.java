package com.company;

import com.company.structures.ListNode;

/* # 206
 * Reflection: I figured out the O(N) time iterative solution myself however I was unable to figure out O(1) space and
 *             recursive version myself. Although I did figure out the recursive way after looking at the optimal
 *             solution for iterative implementation. Honestly not a very difficult questions but I still choked on the
 *             space saving aspect. I need to work on in place algorithms as I easily get lost in the pointer shuffling.
 *
 * Optimal Solution Reflection: Very short and very sweet. I was checking if head.next == null when I should be checking
 *                              if head == null in my loop condition. Stay present not looking into the future hahahaha.
 */
public class ReverseLinkedList {

    // initial iterative solution O(N) space/time
    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
    // Memory Usage: 43.3 MB, less than 21.45% of Java online submissions for Reverse Linked List
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode current = new ListNode(head.val);
        while (head.next != null) {
            head = head.next;
            current = new ListNode(head.val, current);
        }

        return current;
    }

    // optimal in place solution O(N) time O(1) space
    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
    // Memory Usage: 42.5 MB, less than 69.16% of Java online submissions for Reverse Linked List.
    public ListNode reverseListInPlace(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    // optimal in place recursive solution O(N) time O(1) space
    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
    // Memory Usage: 43.1 MB, less than 39.59% of Java online submissions for Reverse Linked List.
    public ListNode reverseListRecurse(ListNode head) {
        return recursiveReverseList(null, head);
    }

    public ListNode recursiveReverseList(ListNode prev, ListNode current) {
        if (current == null) {
            return prev;
        }

        ListNode next = current.next;
        current.next = prev;

        return recursiveReverseList(current, next);
    }
}
