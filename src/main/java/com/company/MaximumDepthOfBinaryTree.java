package com.company;

/* #104
 * Reflection: For my initial solution, it was actually pretty good time wise and space wise but once again, I've over
 *             complicated the solution. I knew I was coding too much but I didn't know how to fix it. I need to pracice
 *             writing recursive functions more. I was making the base case a leaf when I should have made the base case
 *             a null node.
 *
 * Optimal Solution Reflection: I need to practice writing recursive functions. surprisingly my overcomplicated mess
 *                              uses comparable memory and speed although it's a nightmare to read.
 *
 */
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

    // found a simple solution in discussions
    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
    // Memory Usage: 39.3 MB, less than 18.79% of Java online submissions for Maximum Depth of Binary Tree.
    public int maxDepthSimplest(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(maxDepthSimplest(root.left), maxDepthSimplest(root.right));
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
