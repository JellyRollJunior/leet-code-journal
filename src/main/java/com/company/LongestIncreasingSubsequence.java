package com.company;

/* #300
 * Reflection: figured out the N^2 solution in a reasonable time. That's good at least
 *
 * Optimal Solution Reflection: Took me 2 hours 53 mins to understand. I'm dying
 *
 */
public class LongestIncreasingSubsequence {

    // initial O(N^2) solution : 41 mins
    // Runtime: 77 ms, faster than 35.01% of Java online submissions for Longest Increasing Subsequence.
    // Memory Usage: 41.5 MB, less than 23.77% of Java online submissions for Longest Increasing Subsequence.
    public int lengthOfLIS(int[] nums) {
        int max = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int previousLongest = 0;
            int j = i - 1;
            while(j > -1) {
                if (nums[i] > nums[j]) {
                    previousLongest = Math.max(previousLongest, result[j]);
                }
                j--;
            }
            result[i] = 1 + previousLongest;
            max = Math.max(result[i], max);
        }
        return max;
    }

    // O(N LogN) solution (SEARCHED UP)
    /*
     *  dp[] - result list
     *  Two cases
     *      1. nums[i] > all previous values : then increment subsequence by 1
     *      2. nums[i] < previous max nums[0 to (i-1)]
     *          a. insert into sorted location overwriting value previous in it's place
     *              EX: nums[i] = 5, dp[0, 2, 4, 6, 9] => dp[0, 2, 4, 5, 9]
     *              I. This effectively allows us to store 0, 2, 4, 6, 9 and 0, 2, 4, 5 using only one array
     *              II. if another 6 comes, it will be inserted into dp[0, 2, 4, 5, 6] because we no longer need 9
     */

    // OPTIMAL SOLUTION 2 -> Patience sort
}
