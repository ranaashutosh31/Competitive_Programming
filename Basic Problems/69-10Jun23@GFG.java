/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given a string consisting of lowercase english alphabets. Find the repeated character present first in the string.

Example 1:
Input:
S = "geeksforgeeks"
Output: g
Explanation: g, e, k and s are the repeating
characters. Out of these, g occurs first. 

Example 2:
Input: 
S = "abcde"
Output: -1
Explanation: No repeating character present.

*/

class Solution
{
    char firstRep(String S)
    {
        // your code here
        for(int i=0;i<S.length();i++){
            for(int j=i+1;j<S.length();j++){
                if(S.charAt(i)==S.charAt(j)){
                    return S.charAt(i);
                }
            }
        }
        return '#';
    }
}
