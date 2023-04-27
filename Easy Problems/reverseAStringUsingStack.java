/*
PROBLEM LINK IN EXTENDED DESCRIPTION
You are given a string S, the task is to reverse the string using stack.

Example 1:
Input: S="GeeksforGeeks"
Output: skeeGrofskeeG

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
*/

class Solution {
    
    public String reverse(String S){
        //code here
        Stack<String> stk = new Stack<>();
        int n = S.length();
        for(int i=0;i<n;i++){
            stk.push(Character.toString(S.charAt(i)));
        }
        String rev ="";
        for(int j=0;j<n;j++){
            rev = rev+stk.pop();
        }
        return rev;
    }

}
