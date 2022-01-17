package com.company;

/* #268
 * Reflection: did a similar question on hackerrank so this question is cheating as I already knew how to solve it.
 *
 * Optimal Solution Reflection: 8)
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

    // second solution
    // Runtime: 1 ms, faster than 64.96% of Java online submissions for Missing Number.
    // Memory Usage: 47.9 MB, less than 38.27% of Java online submissions for Missing Number.
    public int missingNumberSecond(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i] ^ i;
        }

        return result ^ nums.length;
    }
}
