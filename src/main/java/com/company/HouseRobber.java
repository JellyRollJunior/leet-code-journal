package com.company;

/* #198
 * Reflection: My fastest Medium Yet! I might be a professional house robber. Although space could use some work.
 *
 * Optimal Solution Reflection: My original solution doesn't need the last Math.max call. I also realized I didn't need
 *                              the entire array but after I tried a similar approach, I couldn't get it to work. I
 *                              know now how to do it though!
 *
 */
public class HouseRobber {

    // initial solution : 20 minutes : I know I don't need the matrix, try to remove it to save space
    // Runtime: 0 ms, faster than 100.00% of Java online submissions for House Robber.
    // Memory Usage: 41.9 MB, less than 5.73% of Java online submissions for House Robber.
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        } else {
            int[] resultMatrix = new int[nums.length];
            resultMatrix[0] = nums[0];
            resultMatrix[1] = Math.max(nums[0], nums[1]);
            for (int i = 2; i < nums.length; i++) {
                resultMatrix[i] = Math.max(nums[i] + resultMatrix[i - 2], resultMatrix[i - 1]);
            }
            return Math.max(resultMatrix[nums.length - 1], resultMatrix[nums.length - 2]);
        }
    }

    // solution from discussions
    public int robTwo(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int dp2 = nums[0];
        int dp1 = Math.max(nums[0], nums[1]);
        int dp = dp1;

        for (int i = 2; i < nums.length; i++) {
            dp = Math.max(dp1, dp2 + nums[i]);
            dp2 = dp1;
            dp1 = dp;
        }
        return dp;
    }
}
