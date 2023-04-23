/*
PROBLEM LINK IN THE EXTENDED DESCRIPTION

Given a string S, check if it is palindrome or not.

Example 1:
Input: S = "abba"
Output: 1
Explanation: S is a palindrome

Example 2:
Input: S = "abc" 
Output: 0
Explanation: S is not a palindrome

Expected Time Complexity: O(Length of S)
Expected Auxiliary Space: O(1)
*/

class Solution {
    int isPalindrome(String S) {
        // code here
        int len= S.length();
        int i=0,j=len-1;
        while(i<=len/2 && j>=len/2){
            if(S.charAt(i)==S.charAt(j) && i!=j){
                i++;
                j--;
            }
            else if(S.charAt(i)!=S.charAt(j)){
                return 0;
            }
            else if(i==j){
                break;
            }
        }
        return 1;
    }
}
