package com.company;

import java.util.ArrayList;

// #121
public class BestTimeToBuyAndSellStock {
    /*
     * Reflection: I felt the improvement with each attempt at improving the solution. For my second (and third) attempt
     *             I over thought the question and used dynamic programming when it wasn't necessary. The third attempt
     *             was completed after looking at a hint saying THIS ISN'T A DP QUESTION! Had a good laugh. Keep it
     *             simple!
     *
     * Optimal Solution Reflection: maybe I was a bit too eager to implement dynamic programming. Always use the
     *                              most simple solution available!
     *
     */

    // initial brute force solution
    // Exceeded time limit hahaha
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if ( profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }

    // second attempt
    // Runtime: 2 ms, faster than 66.14% of Java online submissions for Best Time to Buy and Sell Stock.
    // Memory Usage: 54.4 MB, less than 27.31% of Java online submissions for Best Time to Buy and Sell Stock.
    public int maxProfitSecond(int[] prices) {
        int maxProfit = 0;

        int[] lowestAtDay = new int[prices.length];
        lowestAtDay[0] = prices[0];
        for (int i = 1; i < prices.length; i++) {

            // create list of lowest prices
            if (lowestAtDay[i-1] < prices[i]) {
                lowestAtDay[i] = lowestAtDay[i-1];
            } else {
                lowestAtDay[i] = prices[i];
            }

            // calculate profits
            int profitToday = prices[i] - lowestAtDay[i-1];
            if (profitToday > maxProfit) {
                maxProfit = profitToday;
            }
        }

        return maxProfit;
    }

    // third attempt: trying to see if arraylist is faster
    //      spoiler, it isn't
    // Runtime: 9 ms, faster than 5.16% of Java online submissions for Best Time to Buy and Sell Stock.
    // Memory Usage: 52.4 MB, less than 36.92% of Java online submissions for Best Time to Buy and Sell Stock.
    public int maxProfitThird(int[] prices) {
        int maxProfit = 0;

        ArrayList<Integer> lowestAtDay = new ArrayList<>();
        lowestAtDay.add(prices[0]);
        for (int i = 1; i < prices.length; i++) {

            // create list of lowest prices
            if (lowestAtDay.get(i-1) < prices[i]) {
                lowestAtDay.add(lowestAtDay.get(i-1));
            } else {
                lowestAtDay.add( prices[i]);
            }

            // calculate profits
            int profitToday = prices[i] - lowestAtDay.get(i-1);
            if (profitToday > maxProfit) {
                maxProfit = profitToday;
            }
        }

        return maxProfit;
    }


    // fourth attempt
    // USED HINT: TRY TO REMOVE ARRAY
    // Runtime: 1 ms, faster than 100.00% of Java online submissions for Best Time to Buy and Sell Stock.
    // Memory Usage: 52.1 MB, less than 73.42% of Java online submissions for Best Time to Buy and Sell Stock.
    public int maxProfitFourth(int[] prices) {
        int maxProfit = 0;

        int minPrev = prices[0];
        for (int i = 1; i < prices.length; i++) {

            // calculate todays profit
            int profitToday = prices[i] - minPrev;
            if (profitToday > maxProfit) {
                maxProfit = profitToday;
            }

            // setup tommorrows minimum
            if (prices[i] < minPrev) {
                minPrev = prices[i];
            }
        }

        return maxProfit;
    }
}
