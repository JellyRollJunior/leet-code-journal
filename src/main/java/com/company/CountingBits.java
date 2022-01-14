package com.company;

/* #191
 * Reflection: I actually did this question right after Number of One Bits so this feels like cheating since it's almost
 *             the same question.
 *
 * Optimal Solution Reflection: The optimal solution for Number of One Bits was fresh in my mind so I basically just
 *                              repurposed that.
 *
 */
public class CountingBits {

    // initial solution
    // Runtime: 1 ms, faster than 99.91% of Java online submissions for Counting Bits.
    // Memory Usage: 43.1 MB, less than 64.52% of Java online submissions for Counting Bits.
    public int[] countBits(int n) {
        // 17 bits in 10^5
        int[] result = new int[n + 1];

        int current = 0;
        for (int i = 0; i <= n; i++) {
            int ones = 0;
            int shifted = current;
            while(shifted != 0) {
                ones += shifted & 1;
                shifted >>>= 1;
            }

            result[i] = ones;
            current++;
        }
        return result;
    }
}
