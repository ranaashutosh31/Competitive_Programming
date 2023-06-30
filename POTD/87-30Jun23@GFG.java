/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given a number in its binary form find if the given binary number is a multiple of 3. It is recommended to finish the task using one traversal of input binary number.

Example 1:
Input: S = "0011"
Output: 1
Explanation: "0011" is 3, which is divisible by 3.
*/

class Solution {
    int isDivisible(String s) {
        // code here
        int ans=0,l=0,n=s.length();
        for(int i=n-1;i>=0;i--){//3//2
            if(s.charAt(i)=='1'){
                if(l%2==0) ans+=2;//2//
                else ans+=1;//3
            }
            l++;//1
        }
        return ans%3==0?1:0;
    }
}
