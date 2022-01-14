package com.company;

public class NumberOfOneBits {

    // initial solution
    // Runtime: 2 ms, faster than 20.56% of Java online submissions for Number of 1 Bits.
    // Memory Usage: 37.9 MB, less than 25.18% of Java online submissions for Number of 1 Bits.
    public int hammingWeight(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            long shifted = n >> i;
            if (Math.abs(shifted % 2) == 1) {
                result++;
            }
        }
        return result;
    }
}
