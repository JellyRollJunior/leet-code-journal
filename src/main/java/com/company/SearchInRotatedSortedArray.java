package com.company;

/* #33
 * Reflection: I couldn't figure out how to do this one. I tried iterating through every single case like a monkey
 *             but thats way off what i should have been doing
 *
 * Optimal Solution Reflection: After studying this solution, the writer is dividing the array in half and looking to
 *                              see if the target is in the sorted subarray or the unsorted subarray.
 */
public class SearchInRotatedSortedArray {

    // extrememly lame brute force solution I wrote to feel better about myself
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // optimal solution i copied from discussion
    public int searchOptimal(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] == target) return mid;

            if (nums[lo] <= nums[mid]) {
                if (target >= nums[lo] && target < nums[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return nums[lo] == target ? lo : -1;
    }
}
