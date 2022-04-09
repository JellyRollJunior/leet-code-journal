package com.company;

import com.company.structures.ListNode;

/* #141
 * Reflection: I only thought of a brute force O(N) space solution. lame. I thought of the optimal space solution once
 *             I got the hint (basically the entire solution) see the pointer names walker and runner
 *
 * Optimal Solution Reflection: Thought linked lists would be easy but once again I'm naive. 8) discovered a neat way
 *                              to use two pointers at least.
 *
 */
public class LinkedListCycle {

    // initial brute force solution is to store all mem addresses in a hash and see if its appeared already
    // obviously wastes a lot of space

    // optimal solution
    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
    // Memory Usage: 45.2 MB, less than 79.28% of Java online submissions for Linked List Cycle.
    public boolean hasCycle(ListNode head) {
        ListNode runner = head;
        ListNode walker = head;
        while (runner != null && runner.next != null) {
            runner = runner.next.next;
            walker = walker.next;
            if (runner == walker) return true;
        }
        return false;
    }

    // proof: two cases N == odd, N == even
        // insert proof that while loop condition always terminates or returns
}
