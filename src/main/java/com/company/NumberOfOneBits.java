package com.company;

/* #191
 * Reflection: I suspect the reason why my code is running slower than others is the Math.abs call. Unsure how to deal
 *             with java using 2's complement representation besides doing this.
 *
 * Optimal Solution Reflection: >>> operator is the unsigned version of >>. very useful. I also could have saved
 *                              an if statement by using a bitmask to check odd/even. Great stuff!
 *
 */
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

    // solution I got from discussions
    public static int hammingWeightOptimal(int n) {
        int c = 0;
        while (n != 0) {
            c += (n & 1);
            n >>>= 1;
        }
        return c;
    }
}
