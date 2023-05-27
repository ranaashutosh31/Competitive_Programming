/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given and integer N.Calculate the sum of series 13 + 23 + 33 + 43 + … till N-th term.

Example 1:
Input:
N=5
Output:
225
Explanation:
13+23+33+43+53=225

Expected Time Complexity:O(1)
Expected Auxillary Space:O(1)
*/

class Solution {
    long sumOfSeries(long N) {
        // code here
        long ans = (N*N*(N+1)*(N+1))/4;
        return ans;
    }
}
