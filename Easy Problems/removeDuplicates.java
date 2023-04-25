/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given a string without spaces, the task is to remove duplicates from it.

Note: The original order of characters must be kept the same. 

Example 1:
Input: S = "zvvo"
Output: "zvo"
Explanation: Only keep the first
occurrence

Expected Time Complexity: O(|s|)
Expected Auxiliary Space: O(constant)
*/

class Solution {
    String removeDups(String S) {
        // code here
        String str ="";
        for(int i=0;i<S.length();i++){
            if(!str.contains(Character.toString(S.charAt(i)))){
                str = str + Character.toString(S.charAt(i));
            }
        }
        return str;
    }
}
