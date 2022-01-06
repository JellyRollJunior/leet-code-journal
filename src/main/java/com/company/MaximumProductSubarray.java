package com.company;

public class MaximumProductSubarray {

    // initial 2N solution
    // Runtime: 97 ms, faster than 5.33% of Java online submissions for Maximum Product Subarray.
    // Memory Usage: 45.7 MB, less than 6.54% of Java online submissions for Maximum Product Subarray.
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
}
