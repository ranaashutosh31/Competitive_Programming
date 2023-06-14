/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given a positive integer n, find the nth fibonacci number. Since the answer can be very large, return the answer modulo 1000000007.

Example 1:
Input: n = 2
Output: 1 
Explanation: 1 is the 2nd number
of fibonacci series.

Example 2:
Input: n = 5
Output: 5
Explanation: 5 is the 5th number
of fibonacci series.
*/

class Solution {
    static long nthFibonacci(long n){
        // code here
        long a=0,b=1,fib=0;
        if(n==1 || n==2){
            return b;
        }
        else{
            for(int i=1;i<n;i++){
                fib=(a+b)%1000000007;
                a=b;
                b=fib;
            }
        }
        return fib;
    }
}
