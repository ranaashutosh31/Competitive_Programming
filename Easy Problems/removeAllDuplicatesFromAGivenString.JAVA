/*
PROBLEM LINK IN EXTENDED DESCRIPTION

Given a string Str which may contains lowercase and uppercase chracters. The task is to remove all duplicate characters from the string and find the resultant string. The order of remaining characters in the output should be same as in the original string.

Example 1:

Input:
Str = geeksforgeeks
Output: geksfor
Explanation: After removing duplicate
characters such as e, k, g, s, we have
string as "geksfor".

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
*/

class Solution {
    String removeDuplicates(String str) {
        // code here
        String s="";
        for(int i=0;i<str.length();i++){
            if(!s.contains(Character.toString(str.charAt(i)))){
                s=s+str.charAt(i);
            }
        }
        return s;
    }
}
