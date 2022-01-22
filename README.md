# LeetCodeJournal
 - Produce brute force solution (without IDE!)
 - Optimize solution
 - If solution not optimal, search discussions optimal solution
 - Understand the optimal solution 
 - Questions where I had to look at the answer to get a good time complexity marked *

## Things I've Learned
 - Don't use data structures unnecessarily
   - try not to use prebuilts (ex: arraylist) unless necessary
 - Don't over engineer code (is there a simpler approach? Do I really need to use this algorithm? etc.)
 - When in doubt, write it out
 - Follow your instinct when deciding an approach to take
 - Completing by proof: Write out the formula for an optimal intermediate step and ask yourself in what situation would you increment values. 
 - Make use of work already done for you (ex: presorted array)
 - Sample process
   - decide on an approach
   - do some work on paper (ex: work out cases, work out optimal formulas, etc.)
   - write pseudo code 
   - code
 - Try to eliminate intermediate variables for clarity

## Reflections - easy
 - #1 TwoSum: Simplify code! Always be trying to code less. In this case, I should have figured out a way to combine my two loops into one. 
 - #104 Maximum Depth of Binary Tree: I need to practice writing recursive functions specifically work on choosing the most efficient base case. 
 - #121 Best Time to Buy and Sell Stocks: Don't use data structures unnecessarily and Don't over engineer code.
 - #217 Contains Duplicate: An easy question to solve using HashSet. 
 - #253 Maximum Subarray*: Decide on an approach (follow instinct) and work out cases. I had the right idea but thought I could work everything out in my head. When in doubt, put pen to paper. 
 - #191 Number of one bits: an easy question but smart use of bit operators can save a lot of time compared to "dumb" use of bit operators like I did like makeing use of bit mask to save if statements when checking if odd or not! so smart!
 - #338 Counting Bits*: I got the N Log N solution and mistakenly rested on my laurels. Don't get cocky!!! Always try to reuse previous work done if applicable. 
 - #268 Missing Number: I've done this before 8)
 - #190 Reverse Bits*: Taught me how to properly use bitmasks and bit shifting operations!
 - #70 Climbing Stairs: 8)

## Reflections - medium 
 - #238 Product of Array Except Self: I'm very proud to have figured this out by myself! Need to keep in mind when it's necessary to save intermediate values and when they can just be discarded (in order to save space)
 - #152 Maximum Product Subarray: This question drove home the importance of constructing algorithms mathematically. I thought up an algorithm and coded it. What I should have done was decide on an approach, carefully plan out all the cases, then code. 
 - #11 Container with Most Water: You don't always have to go through the inputs in a linear fashion. Start with the largest potential value and work from there!
 - #153 Find Minimum In Rotated Sorted Array: I'm starting to see the patterns in these question! Just need to learn to work faster.
 - #33 Search In Rotated Sorted Array*: This question is so much harder than the previous one. Don't just mindlessly map out cases. Try to notice patterns, make use of work already done for you (in this case sorted areas) to eliminate ranges of input (which is easily done with sorting already done for you).
 - #13 Three Sum*: Remember two pointer traversals and again, always try to use sorted arrays in your favor. 
 - #371 Sum of Two Integers*: Explanation of bitwise operators + solution in reflection. The only way I would have figured this out is by writing out examples using a ^ b, a & b, etc. and noticing the pattern. I'm not sure how I would have solved this without prior knowledge of this but at least now I have that prior knowledge. 
   - [helpful bitwise operator cheat sheet](https://leetcode.com/problems/sum-of-two-integers/discuss/84278/A-summary%3A-how-to-use-bit-manipulation-to-solve-problems-easily-and-efficiently)
 - #322 Coin Change: While my problem solving was sound, I need to work on concision and clarity. Eliminate Intermediate variables whenever possible. 

