package com.company;

import com.company.structures.ListNode;

/* #21
 * Reflection: Honestly a super easy question but I've been slacking on the coding so it took me a while to code out.
 *             The theory is easy but I'm really sloppy with pointers. I'm going to get back into doing at least one
 *             question a week!
 *
 * Optimal Solution Reflection: I've gone soft. I thought coding automation would keep me sharp but coding automation is
 *                              nothing compared to leetcode. Don't rest just yet. keep pushing!
 *
 */

public class MergeTwoSortedLists {
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

    // solution 1
    // Runtime: 1 ms, faster than 65.98% of Java online submissions for Merge Two Sorted Lists.
    // Memory Usage: 42.9 MB, less than 58.34% of Java online submissions for Merge Two Sorted Lists.
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        // setup return list
        ListNode newList;
        if (list1.val <= list2.val) {
            newList = list1;
            list1 = list1.next;
        } else {
            newList = list2;
            list2 = list2.next;
        }

        // begin splicing
        ListNode current = newList;
        while (list1 != null || list2 != null) {

            if (list1 == null) {
                // append list2
                while (list2 != null) {
                    current.next = list2;
                    list2 = list2.next;
                    current = current.next;
                }
            } else if (list2 == null) {
                // append list1
                while (list1 != null) {
                    current.next = list1;
                    list1 = list1.next;
                    current = current.next;
                }
            } else if (list1.val <= list2.val) {
                // append list1 val
                current.next = list1;
                // increment list1
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        return newList;
    }


    // optimal recursive
    public ListNode mergeTwoListsR(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val < l2.val){
            l1.next = mergeTwoListsR(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeTwoListsR(l1, l2.next);
            return l2;
        }
    }

    // optimal iterative
    public ListNode mergeTwoListsI(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        else if(l2 == null) return l1;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(l1 != null && l2!= null){
            if(l1.val <= l2.val){
                curr.next = l1;
                l1 = l1.next;
            }else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = l1 == null? l2:l1;
        return dummy.next;
    }
}

