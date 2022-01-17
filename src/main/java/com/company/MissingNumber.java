package com.company;

/* #268
 * Reflection:
 *
 * Optimal Solution Reflection:
 *
 */
public class MissingNumber {

    // initial solution
    // Runtime: 1 ms, faster than 64.96% of Java online submissions for Missing Number.
    // Memory Usage: 48.3 MB, less than 15.35% of Java online submissions for Missing Number.
    public int missingNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        for (int i = 0; i < nums.length + 1; i++) {
            result = result ^ i;
        }

        return result;
    }
}
