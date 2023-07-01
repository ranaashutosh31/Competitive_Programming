/*
PROBLEM LINK IN EXTENDED DESCRIPITON
Given a positive integer N, print count of set bits in it. 

Example 1:

Input:
N = 6
Output:
2
Explanation:
Binary representation is '110' 
So the count of the set bit is 2.
*/

class Solution {
    static int setBits(int N) {
        // code here
        return Integer.bitCount(N);
    }
}
