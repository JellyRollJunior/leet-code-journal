package com.company;

import com.company.structures.TreeNode;

/* #124
 * Reflection: HARD QUESTION ALERT. I WAS SO CLOSE TO GETTING IT. I HAD IT ALL EXCEPT:
 *                          int left = Math.max(0, recurse(root.left));
 *             I WAS DOING:
 *                          int left = recurse(root.left);
 *             I was getting a bit desparate near the end. Honestly pretty funny, I thought of doing bellman ford at
 *             every node to get all paths. I thought since it was a HARD question, longer runtimes would be inevitable
 *             but then I looked to the solutions page (without checking the solutions) and saw they were all O(N)
 *             so I rethought my approach.
 *
 *             The case I was having problems with was I was originally returning 0 if the root was null which works
 *             for node values above 0 but fails when nodes are below 0 because of the global max comparison.
 *
 *             My next solution was to return MIN_VALUE if null but I would get integer overflows when adding
 *             left + root.val + right.
 *
 * Optimal Solution Reflection: The optimal solution does a lot of smart things to eliminate code that I didn't do
 *
 *              - Got rid of compare self: if L and R are negative, it will be 0 + self + 0 anyways
 *              - Left < 0 or Right < 0 we don't want to add to the path so it gets overwritten with 0
 *              - remove extra sendUp comparison because is already addressed in left + root.val + right
 *              - remove extra addition operation with Math.max(left, right) + root.val
 *
 */
public class BinaryTreeMaximumPathSum {

    // SOLUTION 1
    // Runtime: 1 ms, faster than 85.16% of Java online submissions for Binary Tree Maximum Path Sum.
    // Memory Usage: 44.2 MB, less than 76.37% of Java online submissions for Binary Tree Maximum Path Sum.
    public int globalMax;

    public int maxPathSum(TreeNode root) {
        globalMax = Integer.MIN_VALUE;
        recurse(root);
        return globalMax;
    }

    public int recurse(TreeNode root) {
        if (root == null) return Integer.MIN_VALUE;

        // compare self
        globalMax = Math.max(globalMax, root.val);

        // left, right
        int left = Math.max(0, recurse(root.left));
        int right = Math.max(0, recurse(root.right));

        // left + curr + right
        globalMax = Math.max(globalMax, left + root.val + right);

        // curr + left, curr + right
        int sendUp = Math.max(root.val + left, root.val + right);
        globalMax = Math.max(globalMax, sendUp);
        return sendUp;
    }

    // optimal solution
    public int recurse2(TreeNode root) {
        if (root == null) return 0;

        // left, right
        int left = Math.max(0, recurse(root.left));
        int right = Math.max(0, recurse(root.right));

        // left + curr + right
        globalMax = Math.max(globalMax, left + root.val + right);

        // return curr + left or curr + right
        return Math.max(left, right) + root.val;
    }
}
