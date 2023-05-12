/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

*/

class Solution {
    public boolean isPalindrome(int x) {
     int sum=0,m=0,n=x;
     boolean ans=true;
     if(x==0){
         return ans;
     }
     while(n>0){
         m=n%10;
         sum=sum*10+m;
         n=n/10;
     }
     if(sum!=x || sum%10==0){
         ans=false;
     }
     return ans;
    }
}
