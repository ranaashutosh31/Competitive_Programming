/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, act and tac are an anagram of each other.
Note:-
If the strings are anagrams you have to return True or else return False
|s| represents the length of string s.

Example 1:
Input:a = geeksforgeeks, b = forgeeksgeeks
Output: YES
Explanation: Both the string have same characters with
        same frequency. So, both are anagrams.
Expected Time Complexity:O(|a|+|b|).
Expected Auxiliary Space: O(Number of distinct characters).
*/

class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        // Your code here
        char []arr = a.toCharArray();
        char []brr = b.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        if(a.length()!=b.length()){
            return false;
        }
        else{
           for(int j=0;j<b.length();j++){
                if(arr[j]!=brr[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
