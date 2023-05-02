/*
PROBLEM LINK IN EXTENDED DESCRIPTION
You are given an array A of size N. Let us denote S as the sum of all integers present in the array. Among all integers present in the array, find the minimum integer X such that S ≤ N*X.

Example 1:
Input:
N = 3,
A = { 1, 3, 2}
Output:
2
Explanation:
Sum of integers in the array is 6.
since 6 ≤ 3*2, therefore 2 is the answer.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
*/

class Solution {
    public static int minimumInteger(int N, int[] A) {
        // code here
        long sum=Arrays.stream(A).summaryStatistics().getSum();
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            long mul=((long)N*(long)A[i]);
            if(sum<=mul){
                ans=Math.min(ans,A[i]);
            }
        }
        return ans;
    }
}
