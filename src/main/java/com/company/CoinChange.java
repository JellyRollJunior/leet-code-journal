package com.company;

import java.util.Arrays;

public class CoinChange {

    // initial hacky solution
    // Runtime: 21 ms, faster than 63.30% of Java online submissions for Coin Change.
    // Memory Usage: 42 MB, less than 23.79% of Java online submissions for Coin Change.
    public int coinChange(int[] coins, int amount) {
        int[] minCoinsAtAmount = new int[amount + 1];
        Arrays.fill(minCoinsAtAmount, -1);
        minCoinsAtAmount[0] = 0;

        for (int i = 0; i <= amount; i++) {
            int minNumCoins = Integer.MAX_VALUE;
            for (int value : coins) {
                if (i - value > -1) {
                    if (minCoinsAtAmount[i - value] > -1) {
                        int numCoinsUsingValue = 1 + minCoinsAtAmount[i - value];
                        minNumCoins = Math.min(minNumCoins, numCoinsUsingValue);
                    }
                }
            }
            if (minNumCoins < Integer.MAX_VALUE){
                minCoinsAtAmount[i] = minNumCoins;
            }
        }

        return minCoinsAtAmount[amount];
    }

    // slightly prettier solution
    // Runtime: 12 ms, faster than 85.84% of Java online submissions for Coin Change.
    // Memory Usage: 38.1 MB, less than 94.59% of Java online submissions for Coin Change.
    public int coinChangeSecond(int[] coins, int amount) {
        int[] minCoinsAtAmount = new int[amount + 1];
        Arrays.fill(minCoinsAtAmount, -1);
        minCoinsAtAmount[0] = 0;

        for (int i = 0; i <= amount; i++) {
            int minNumCoins = Integer.MAX_VALUE;
            for (int value : coins) {
                if (i - value > -1
                        && minCoinsAtAmount[i - value] > -1) {
                    int numCoinsUsingValue = 1 + minCoinsAtAmount[i - value];
                    minNumCoins = Math.min(minNumCoins, numCoinsUsingValue);
                }
            }
            if (minNumCoins < Integer.MAX_VALUE) {
                minCoinsAtAmount[i] = minNumCoins;
            }
        }
        return minCoinsAtAmount[amount];
    }

    // Clean version I found online although kind of slow
    public int coinChangeCLEAN(int[] coins, int amount) {
        int[] minCoinsAtAmount = new int[amount + 1];
        Arrays.fill(minCoinsAtAmount, amount + 1);
        minCoinsAtAmount[0] = 0;

        for (int i = 0; i <= amount; i++) {
            for (int value : coins) {
                if (value < i + 1) {
                    minCoinsAtAmount[i] = Math.min(minCoinsAtAmount[i], minCoinsAtAmount[i - value] + 1);
                }
            }
        }
        return minCoinsAtAmount[amount] > amount ? -1 : minCoinsAtAmount[amount];
    }
}
