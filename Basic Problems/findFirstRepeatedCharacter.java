/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given a string S. The task is to find the first repeated character in it. We need to find the character that occurs more than once and whose index of second occurrence is smallest. S contains only lowercase letters.

Example 1:
Input: S="geeksforgeeks"
Output: e
Explanation: 'e' repeats at third position.
Expected Time Complexity: O(|S|) 
Expected Auxiliary Space: O(1)
where |S| denotes the length of string S.
Expected Time Complexity: O(|S|) 
Expected Auxiliary Space: O(1)
where |S| denotes the length of string S.
*/

class Solution 
{ 
    String firstRepChar(String s) 
    { 
        // code here
        String result="-1",str="";
        for(int i=0;i<s.length();i++){
            if(str.contains(Character.toString(s.charAt(i)))){
                result = Character.toString(s.charAt(i));
                break;
            }
            str = str + s.charAt(i);
        }
        return result;
    }
} 
