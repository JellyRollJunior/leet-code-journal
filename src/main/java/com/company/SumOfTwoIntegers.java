package com.company;


/* #371
 * Reflection: I'm not that good at bitwise operators so this one really stumped me. My solution works for positive
 *             numbers but fails for negative numbers.
 *
 * Optimal Solution: From leetcode discussions paraphrasing solution from Cracking the Coding Interview:
 *                  Our first Instinct in problems like these should be that we're going to have to work with bits.
                    Why, Because when you take the + sign, what other choice do we have?
                    Plus, that's how computers do it!
                    Our next thought should be to deeply understand how addition works. We can walk through an addition
                    problem to see if we can understand something new—some pattern—and then see if we can replicate
                    that with code. So let, do just that—let, walk through an addition problem.
                    We'll work in base 10 so that it, easier to see.
                    To add 759 + 674, would usually add digit [0] from each number, carry the one, add digit [1] from
                    each number, carry the one, and so on. You could take the same approach in binary:
                    add each digit, and carry the one as necessary.
                    Can we make this a little easier? Yes! Imagine I decided to split apart the "addition" and "carry"
                    steps. That is, I do the following:

                    Add 759 + 674, but "forget" to carry. I then get 323.
                    Add 759 + 674 but only do the carrying, rather than the addition of each digit. I then get 1110.
                    Add the result of the first two operations (recursively, using the same process described in step 1
                    and 2): 1110 + 323 = 1433.
                    Now, how would we do this in binary?

                    If I add two binary numbers together, but forget to carry, the ith bit in the sum will be 0 only if
                    a and b have the same ith bit (both 0 or both 1).This is essentially an XOR.
                    If I add two numbers together but only carry, I will have a 1 in the ith bit of the sum only if
                    bits i - 1 of a and b are both 1s. This is an AND, shifted.
                    Now, recurse until there's nothing to carry.
 *
 */
public class SumOfTwoIntegers {

    // initial hacky solution that doesn't work for negative numbers. what a joke
    public int getSum(int a, int b) {
        StringBuilder result = new StringBuilder("");

        boolean carryBit = false;
        // range -1000 <= a, b <= 1000
        // 10 bits 2048
        for (int i = 0; i < 10; i++) {
            int aBit = (a >> i) & 1;
            int bBit = (b >> i) & 1;

            int nextSigBit;
            if (carryBit) {
                nextSigBit = (aBit ^ bBit) ^ 1;
            } else {
                nextSigBit = aBit ^ bBit;
            }

            System.out.println(nextSigBit);
            if (aBit == 1 && bBit == 1
                    || aBit == 1 && carryBit
                    || bBit == 1 && carryBit) {
                carryBit = true;
            } else {
                carryBit = false;
            }

            result.insert(0, nextSigBit + "");
        }
        return Integer.parseInt(result.toString(), 2);
    }
}
