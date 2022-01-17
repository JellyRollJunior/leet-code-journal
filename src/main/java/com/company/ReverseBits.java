package com.company;

public class ReverseBits {

    // initial solution
    // doesn't work cuz of twos complement. Also doesn't use bit manipulation so it's cheating anyways
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if (n % 2 == 1) {
                result += Math.pow(2, 31 - i);
            }
            n = n >> 1;
        }
        return result;
    }

    // second solution - used a hint (shifting bits left gives the correct power of two we want to add)
    // Runtime: 1 ms, faster than 98.96% of Java online submissions for Reverse Bits.
    // Memory Usage: 38.9 MB, less than 53.36% of Java online submissions for Reverse Bits.
    public int reverseBitsSecond(int n) {
        int result = 0;
        for (int i = 31; i > -1; i--) {
            int bit = n & 1;
            int shifted = bit << i;
            result += shifted;
            n >>>= 1;
        }

        return result;
    }
}
