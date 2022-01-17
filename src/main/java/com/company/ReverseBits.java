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
}
