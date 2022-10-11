# LeetCodeJournal
 - Produce brute force solution (without IDE!)
 - Optimize solution
 - If solution not optimal, search discussions optimal solution
 - Understand the optimal solution 
 - Questions where I had to look at the answer to get a good time complexity marked *

# Starting Again 08/06/2022

### Grind 75
This time focus on getting the question right the first time. Try not to do reruns or brute force run test cases on a question. 

Array
* Two Sum
* Best Time to Buy and Sell Stock
* Binary Seach
    * Holy shit I messed up binary search fuck  

Matrix
* Flood Fill 
    * For the love of god please learn how to recurse properly 

String
* Valid Parentheses
    * you can do it more elegantly bro. at least its better than last time
* Valid Palindrome
* Valid Anagram

Linked List
* Merge Two Sorted Lists
    * Neat trick: dummy node for head
* Linked List Cycle

Tree
* Invert Binary Tree
* Lowest Common Ancestor of a Binary Search Tree
* Balanced Binary Tree 
    * I am so bad at trees
    * Need to identify when its a good idea to go BOTTOM UP vs TOP DOWN approach
    * DEFINITELY REDO  

Misc.
* Implement Queue using Stack 
    * Kind of a fun quirky question ngl 

### Non Blind 75

Easy

Array
* 88 - Merge Sorted Arrays
    * Pretty neat question. Go from the back vs the front sometimes can be useful nomesayin
    * Clean version is very different from messy version. Good code optimization + clean code practice 


### Blind 75 Tracker

NOTES:
* Remember your fundamentals -> Use variables when a value is used more than once!
* Hashmap lol

Array
* Two Sum
* Best Time to Buy and Sell Stock - Don’t use previous ideas. Start anew
* Contains Duplicate
* Product of Array Except Self
* Maximum Subarray
* Maximum Product Subarray
* Find Minimum in Rotated Sorted Array
* Search in Rotated Sorted Array 
    * (GAVE UP -> found approach tho but didn’t code)
    * https://www.youtube.com/watch?v=QdVrY3stDD4
* Three sum (GAVE UP) 
    * Look at the example: the example solution shows data in sorted order then maybe that’s a hint to sort the data!
    * https://www.youtube.com/watch?v=qJSPYnS35SE
* Container With Most Water
    * kind of cheating since i already knew the answer

Dynamic Programming
* Climbing Stairs
* Coin Change
* Longest Increasing Subsequence
    * THE OPT SOLUTION DOESNT EVEN USE DP I GOT TROLLED (ok honestly the NLogN solution is too complex, N^2 good enuf) 
* Longest Common Subsequence
    * (GAVE UP -> https://www.youtube.com/watch?v=sSno9rV8Rhg)
    * How do i build an algorithm to solve this? Do i just have to know? 
    * Build your solution incrementally when you can
    * Get acquainted with which questions use matrix and which don’t. 
* Word Break 
    * I kinda suck at dynamic programming LOL this one is really hard tho tbh
    * Sliding window -> the actual strings don’t really matter, just keep track of whether there’s a solution or not
    * find solution incrementally for each letter one at a time. 
    * BUILD IT UP ONE AT A TIME BRO NO GREEDY SHIT TRYNA DO THE WHOLE THING IN ONCE PASSOVER
    * NOT GREEDY -> DYNAMIC MY MANZ
    * UNDERSTAND HOW s.substring works!
* Combination Sum
    * Classic DP question
    * Good at testing your optimization skills while not being too hard
* House Robber
* House Robber II
    * honestly i remembered the solution for this. kind of cheated
* Decode Ways
    * THINK OUTSIDE THE BOX 
    * CAN GRAB THE ACTUAL NUMBER INSTEAD OF CREATING THESE CONVOLUTED IF STATEMENTS
* Unique Paths
* Jump Game

Interval
* Insert Interval
* Merge Intervals
    * Honestly not that hard tbh. Can redo if you want
    * Remember you can always sort if you want LOL 

Linked List
* Reverse Linked List
* Detect Cycle in a Linked List
* Merge Two Sorted Lists
    * please read the question carefully to save yourself some headache lol
* Merge K sorted lists (skipped)
* Remove Nth Node From End of List
    * you may remember the algorithm but can you think of an elegant way to implement it??? bitch boy
* Reorder List
    * I figured out the algorithm but I couldnt code it out. MUST REDO

Matrix[row][col]
* Setting Matrix Zeroes
    * O(MN) & O(M + N) are quite simple to figure out. 
    * O(1) space is a bit tricky but very smart. Think outside the box!
    * Good question to redo just to remember what kind of space saving methods are possible (but not high priority)
    * DO NOT READ SPOILER: use the original matrix and data storage
* Spiral Matrix
    * Good question to practice matrix indicies
    * A good test in writing simple elegant code. My answer was quite convoluted when there was a VERY SIMPLE alternative.  
* Rotate Image
    * Didn't even bother to attempt this one -> just looked at answer
    * I remembered matrix multiplication from linear algebra but it had been too long
    * Need to brush up on matrix operations.  

String
* Longest Substring Without Repeating Characters
    * Important: Code this out using the data structure so you get the right answer first
    * Then explain there are more efficient ways to do this
        * two pointer -> save memory
        * Array -> save memory
    * Explain if given more time, this can be optimized. Show that you see the potential for better
* Longest Repeating Character Replacement
    * Did brute force but not the good solution lol
    * Redo this one. Its pretty good. 
* MINIMUM WINDOW SUBSTRING (SKIPPED)
* Valid Anagram
* Group Anagrams
    * I thought of brute force approach then gave up and looked at the answer
    * Very good question - redo it
    * (DONT READ THIS) - think about putting fancy tings in a hash map
* Valid Parenthesis
    * Redo this question
    * its an easy one but you couldn’t think of an elegant solution l0000000000000l
* Valid Palindrome
* Longest Palindromic Substring
    * Got right answer with right algorithm but could have been coded way better
    * REDO
* Palindromic Substrings
    * Easier version of longest palindromic substring. 
    * its the same algorithm but with less knowledge of string functions

Tree
* Maximum Depth of Binary Tree
* Same Tree
* Invert/Flip Binary Tree
* Binary Tree Maximum Path Sum (SKIPPED)
* Binary Tree Level Order Traversal
    * Very important to choose the right data structure for this one
* Serialize and Deserialize Binary Tree (SKIPPED)
* Subtree of Another Tree
    * An easy question but I kinda struggled oof. REDO
* Construct Binary Tree from Preorder and Inorder Traversal
    * Very Very Very hard but also kinda easy once you know the trick. REDO 
* Validate Binary Search Tree
    * REDO -> easy in principle but the concept is kinda hard to get
    * Do iterative and recursive solution 
* Kth Smallest Element in a BST
    * REDO -> Good question to test elegant clean code
    * Remember that these kind of questions can always be done with a stack or with recursion. Pick your poison but stack is better for real world data with billionzzz of data points
    * I thought of the algorithm but it was so hacky and I re ran it so many times. FUCK
    * I CAN THINK OF THE ALGORITHM BUT I NEED MORE PRACTICE CODING  
    * Familiarize yourself with stack tree iteration
* Lowest Common Ancestor of a Binary Search Tree
    * THOROUGHLY READ THE QUESETION
    * ITS ACTUALLY REALLY EASY WHEN YOU FIGURE OUT WHAT THE QUESTION ACTUALLY WANTS FROM YOU 
* Add and Search Word
    * REDO FOR SURE
    * I just looked at the answer for this one lol 
    * Trie data structure MY GUY
    * Honestly not a very difficult question once you know about Trie's. Basically a test on implementing a Trie data structure.   


# First Time 12/20/2021

Things I've Learned
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
 - If you feel mental strain start to set in, just take a break and reset mental
 - Only run code if you think it's correct. Don't run code to check correctness! This promotes lazy coding. They won't let you submit the answer over and over again to check correctness in a job interview lol. 

Reflections - easy
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
 - #206 Reverse Linked List*: I still have trouble saving space. I can usually write an optimal time algorithm but not a optimal space one. I need to work on keeping track of pointers because sometimes I get lost in the pointer shuffle. Try to write everything down to make things more clear. 
 - #141 Linked List Cycle*: Don't underestimate linked lists. They're trickier than you think! A lot of these can be solved using two pointers so try to figure out a way to do it like that haha. 
 - #21 Merge two sorted Linked Lists*: Extremely easy question that I blundered! 8) Good test when coming back from a break though!

Reflections - medium 
 - #238 Product of Array Except Self: I'm very proud to have figured this out by myself! Need to keep in mind when it's necessary to save intermediate values and when they can just be discarded (in order to save space)
 - #152 Maximum Product Subarray: This question drove home the importance of constructing algorithms mathematically. I thought up an algorithm and coded it. What I should have done was decide on an approach, carefully plan out all the cases, then code. 
 - #11 Container with Most Water: You don't always have to go through the inputs in a linear fashion. Start with the largest potential value and work from there!
 - #153 Find Minimum In Rotated Sorted Array: I'm starting to see the patterns in these question! Just need to learn to work faster.
 - #33 Search In Rotated Sorted Array*: This question is so much harder than the previous one. Don't just mindlessly map out cases. Try to notice patterns, make use of work already done for you (in this case sorted areas) to eliminate ranges of input (which is easily done with sorting already done for you).
 - #13 Three Sum*: Remember two pointer traversals and again, always try to use sorted arrays in your favor. 
 - #371 Sum of Two Integers*: Explanation of bitwise operators + solution in reflection. The only way I would have figured this out is by writing out examples using a ^ b, a & b, etc. and noticing the pattern. I'm not sure how I would have solved this without prior knowledge of this but at least now I have that prior knowledge. 
   - [helpful bitwise operator cheat sheet](https://leetcode.com/problems/sum-of-two-integers/discuss/84278/A-summary%3A-how-to-use-bit-manipulation-to-solve-problems-easily-and-efficiently)
 - #322 Coin Change: While my problem solving was sound, I need to work on concision and clarity. Eliminate Intermediate variables whenever possible. 
 - #300 Longest Increasing Subsequence*: Figured out O(N^2) quickly, O(NLogN) took me 3 hours. I understand it but I don't know how I would figure this out myself to be honest. Run through EXAMPLE TEST CASES to understand a solution quicker (although at this point you already gave up on figuring it out yourself lol). REMEMBER TO TAKE BREAKS TO RESET MENTAL. MENTAL DRAIN STOLE LIKE TWO HOURS OF MY LIFE.
 - #198 House Robber*: Not a particularly hard question (my fastest medium at 20mins for O(N) solution) but I could have done better with space complexity and reducing redundant code. 
 - #62 Unique Paths: Implement the inefficient space solution first, then work on saving space. 
 - #55 Jump Game: I implemented the O(N) O(1) solution myself this time (48 mins)! I'm improving! Although I realized my approach to doing questions promotes lazy coding so I'll work on changing that (explained above).
 - #1143 Longest Common Subsequence: Again, notice mental boom. Prove your steps are correct. Don't just write a line of code and pray it works. PROVE IT PROVE IT PROVE IT PROVE IT PROVE IT. 
 - #3 Longest Substring Without Repeating Characters: Actually a pretty easy question for a medium. However, I didnt do this question properly. I fell back to my old ways of not proving and just running til I see a success message. Don't do this!!! 
 - #19 Remove Nth Node from End of List: Kind of cheated as I already knew how to find nth node from Joseph all those years ago :P again, a great question to do comign back from a break. Think about what pointers you need and which ones you dont! Always try to save memory. 
 - #209 Mininum Size Subarray Sum: REMEMBER YOU CAN DO TWO POINTER FOR MORE THAN JUST LINKED LISTS. I still have a lot of work to do regarding code readability. My final solution could have been shortened a couple lines.

Reflections - hard
 - #124 Binary Tree Maximum Path Sum*: Honestly, easier than I expected for a hard question. Although I still didn't complete it 100% on my own, I got a lot closer than some mediums. Me thinks this one isn't actually that hard. One thing I need to work on is mental fatigue. I get impatient half way through and try to brute force it with submissions. 
