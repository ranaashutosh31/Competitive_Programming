/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given a String, find the longest palindromic subsequence.

Example 1:
Input:
S = "bbabcbcab"
Output: 7
Explanation: Subsequence "babcbab" is the
longest subsequence which is also a palindrome.
*/

class Solution
{
    public int longestPalinSubseq(String S)
    {
        //code here
        String T = new StringBuilder(S).reverse().toString();
        int dp[][] = new int[S.length()+1][T.length()+1];
        for(int i=1;i<=S.length();i++){
            for(int j=1;j<=T.length();j++){
                if(S.charAt(i-1)==T.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else
                dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        return dp[S.length()][T.length()];
    }
}
