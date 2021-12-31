package com.company;

/* #253
 * Reflection: A very discouraging question. I basically only came up with a brute for solution.
 *
 * Optimal Solution Reflection: The worst part is I don't even understand the O(N) or the divide and conquer solution.
 *                              I'm gonna take a break and come back to this question at another time.
 *
 * Optimal Solution Reflection part 2: I want to say that I was tired that day but I don't know.
 *                                     It's important to commit to a process and work out cases if possible
 *                                     I knew I wanted to do a O(N) procedurally generated sum, I should have worked
 *                                     out all the possible cases.
 *                                     O(N) solution breakdown:
 *                                          - SumAtIndex + A[i] vs A[i]
 *                                              - SumAtIndex(+), A[i](+) : good, take both cuz sum goes up
 *                                              - SumAtIndex(-), A[i](+) : restart sum with A cuz why would we take sum
 *                                              - SumAtIndex(+), A[i](-) : take A in hopes of a large payoff
 *                                              - SumAtIndex(-), A[i](-) : take A to start a new chain, larger val recorded already
 *
 */
public class MaximumSubarray {

    // naive brute force solution
    // time limit exceeded hahaha
    public int maxSubArray(int[] nums) {
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;

            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];

                if (currentSum > max) {
                    max = currentSum;
                }
            }
        }

        return max;
    }

    // O(N)
    public static int maxSubArraySecond(int[] nums) {
        int max = nums[0];
        int maxAtIndex = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxAtIndex = Math.max(maxAtIndex + nums[i], nums[i]);
            max = Math.max(max, maxAtIndex);
        }

        return max;
    }

    // i honestly don't like this solution. It's slow
    // Divide and Conquer
    public int maxSubArrayThird(int[] nums) {

        return helper(nums,0,nums.length-1);
    }

    public int helper(int nums[],int i,int j){

        if(i==j){
            return nums[i];
        }

        int mid  =  (i+j)/2;
        int sum = 0,leftMax = Integer.MIN_VALUE;

        for(int l =  mid;l>=i;l--){
            sum+=nums[l];
            if(sum>leftMax){
                leftMax =  sum;
            }
        }

        int rightMax = Integer.MIN_VALUE;
        sum = 0;    // reset sum to 0
        for (int l = mid + 1; l <=j; l++)
        {
            sum += nums[l];
            if (sum > rightMax) {
                rightMax = sum;
            }
        }

        int maxLeftRight = Math.max(helper(nums, i, mid),
                helper(nums, mid + 1, j ));
        return Math.max(maxLeftRight, leftMax + rightMax);

    }

}
