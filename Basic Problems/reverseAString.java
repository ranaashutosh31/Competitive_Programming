/*
PROBLEM LINK IN EXTENDED DESCRIPTION

You are given a string s. You need to reverse the string.

Example 1:
Input:
s = Geeks
Output: skeeG
*/

class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        StringBuilder revstr = new StringBuilder(str);
        revstr.reverse();
        return revstr.toString();
    }
}
