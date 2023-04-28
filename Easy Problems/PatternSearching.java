/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given a text and a pattern, the task is to check if the pattern exists in the text or not.

Example 1:
Input: text = "geeksforgeeks"
       pat = "geek"
Output: 1
Explanation: "geek" exists in
"geeksforgeeks"

Expected Time Complexity: O(|text| + |pat|)
Expected Auxiliary Space: O(|text| + |pat|)
*/

class Solution {
    int search(String text, String pat) {
        // code here
        if(text.contains(pat)){
            return 1;
        }
        return 0;
    }
}
