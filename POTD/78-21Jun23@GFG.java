/*
PROBLEM LINK IN EXTENDED DESCRIPTION
You will be given an integer n, your task is to return the sum of all natural number less than or equal to n.

As the answer could be very large, return answer modulo 109+7.

Example 1:
Input:
n = 6
Output:
21
Explanation:
1+2+3+4+5+6 = 21
*/

class Solution {
    static int sumOfNaturals(int n) {
        // code here
        int mod = 1000000007;
        long sum = (long)n*(long)(n+1);
        sum/=2;
        return (int)(sum%mod);
    }
};
