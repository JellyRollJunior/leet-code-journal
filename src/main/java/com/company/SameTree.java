package com.company;


import com.company.structures.TreeNode;

public class SameTree {

    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Same Tree.
    // Memory Usage: 41.8 MB, less than 31.94% of Java online submissions for Same Tree.
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p != null && q != null) {
            if (p.val == q.val) {
                return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
            }
        }
        return false;
    }
}
