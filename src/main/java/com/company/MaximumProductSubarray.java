package com.company;

/* #152
 * Reflection: Initial solution is slow and hacky due to all the if statements. For the second solution, I combined
 *             some if statements and extracted reused code into a method. The algorithm is unchanged.
 *
 * Optimal Solution Reflection:
 *
 */
public class MaximumProductSubarray {

    // initial 2N solution
    // Runtime: 2 ms, faster than 31.47% of Java online submissions for Maximum Product Subarray.
    // Memory Usage: 41.9 MB, less than 6.54% of Java online submissions for Maximum Product Subarray.
    public int maxProduct(int[] nums) {
        int lastNegativeIndex = -1;
        int currentProduct = 1;
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (lastNegativeIndex < 0 && nums[i] < 0) {
                lastNegativeIndex = i;
            }

            currentProduct = currentProduct * nums[i];
            maxProduct = Math.max(maxProduct, currentProduct);

            System.out.println("curr: " + currentProduct);



            if ((nums[i] == 0 && lastNegativeIndex > -1)
                    || (i == nums.length - 1 && currentProduct < 0)) {
                int backtrackProduct = 1;
                for (int j = lastNegativeIndex + 1; j <= i; j++) {
                    backtrackProduct = backtrackProduct * nums[j];
                    maxProduct = Math.max(maxProduct, backtrackProduct);

                    System.out.println("back: " + backtrackProduct);
                }
                lastNegativeIndex = -1;
                currentProduct = 1;
            } else if (nums[i] == 0) {
                currentProduct = 1;
            }
        }

        return maxProduct;
    }

    // refactored solution
    // Runtime: 1 ms, faster than 91.00% of Java online submissions for Maximum Product Subarray.
    // Memory Usage: 41.7 MB, less than 6.54% of Java online submissions for Maximum Product Subarray.
    public int maxProductSecond(int[] nums) {
        int oddNegativeIndex = -1;
        int currentProduct = 1;
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (oddNegativeIndex < 0 && nums[i] < 0) {
                oddNegativeIndex = i;
            }

            currentProduct = currentProduct * nums[i];
            maxProduct = Math.max(maxProduct, currentProduct);

            if (nums[i] == 0) {
                currentProduct = 1;

                if (oddNegativeIndex > -1) {
                    int backtrackProduct = backtrack(nums, oddNegativeIndex + 1, i);
                    maxProduct = Math.max(maxProduct, backtrackProduct);

                    oddNegativeIndex = -1;
                }
            }
        }

        if (oddNegativeIndex > -1) {
            int backtrackProduct = backtrack(nums, oddNegativeIndex + 1, nums.length - 1);
            maxProduct = Math.max(maxProduct, backtrackProduct);
        }

        return maxProduct;
    }

    int backtrack(int[] nums, int start, int end) {
        int maxProduct = Integer.MIN_VALUE;
        int backtrackProduct = 1;
        for (int i = start; i <= end; i++) {
            backtrackProduct = backtrackProduct * nums[i];
            maxProduct = Math.max(backtrackProduct, maxProduct);
        }

        return maxProduct;
    }
}
