/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given a non-negative integer N. The task is to check if N is a power of 2. More formally, check if N can be expressed as 2x for some x.

Example 1:
Input: N = 1
Output: YES
Explanation:1 is equal to 2 
raised to 0 (20 = 1).
*/

class Solution{
    public:
    // Function to check if given number n is a power of two.
    bool isPowerofTwo(long long n){
        
        // Your code here    
        if(n==0) return false;
        return ((n&(n-1))==0);
    }
};
