/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.

Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
*/

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0, len=s.length()-1;
        for(int i=len;i>=0;i--){
            if(s.charAt(i)==' '){
                if(count>0) return count;
                continue;
            }
            count += 1;
        }
        return count;
    }
}
