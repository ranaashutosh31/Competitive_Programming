/*
PROBLEM LINK IN EXTENDED DESCRIPTION

Given a string S. For each index i(1<=i<=N-1), erase it if s[i] is equal to s[i-1] in the string.

Example 1:
Input:
S = aabb
Output:  ab 
Explanation: 'a' at 2nd position is
appearing 2nd time consecutively.
Similiar explanation for b at
4th position.
*/

class Solution{
    public String removeConsecutiveCharacter(String S){
        String ans = Character.toString(S.charAt(0));
        int i=1;
        while(i<S.length()){
            if((S.charAt(i))!=(S.charAt(i-1))){
                ans+=(S.charAt(i));
            }
            i++;
        }
        return ans;
    }
}
