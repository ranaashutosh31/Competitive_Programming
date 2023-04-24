/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given a string str and another string patt. Find the minimum index of the character in str that is also present in patt.

Example 1:
Input:
str = geeksforgeeks
patt = set
Output: 1
Explanation: e is the character which is
present in given str "geeksforgeeks"
and is also presen in patt "set". Minimum
index of e is 1. 
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Number of distinct characters).
*/

class Solution
{
    //Function to find the minimum indexed character.
    public static int minIndexChar(String str, String patt)
    {
        // Your code here
        for(int i=0;i<str.length();i++){
            if(patt.contains(Character.toString(str.charAt(i)))){
                return i;
            }
        }
        return -1;
    }
}
