package com.company;



public class MaximumDepthOfBinaryTree {



    // Initial Solution - hacky in order traversal
    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
    // Memory Usage: 39.1 MB, less than 27.83% of Java online submissions for Maximum Depth of Binary Tree.
    public int maxDepthOne(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return inOrderTraversalOne(root, 1);
        }
    }

    public int inOrderTraversalOne(TreeNode root, int start) {
        int resultLeft;
        int resultRight;
        if (root.left != null) {
            resultLeft = inOrderTraversalOne(root.left, start+1);
        } else {
            resultLeft = 0;
        }
        if (root.right != null) {
            resultRight = inOrderTraversalOne(root.right, start+1);
        } else {
            resultRight = 0;
        }

        if (root.left == null && root.right == null) {
            return start;
        }

        if (root.left == null) {
            return resultRight;
        } else if (root.right == null) {
            return resultLeft;
        } else {
            return Math.max(resultLeft, resultRight);
        }
    }








    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
