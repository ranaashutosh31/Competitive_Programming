/*
PROBLEM LINK IN EXTENDED DESCRIPTION

Your task is to implement the function strstr. The function takes two strings as arguments (s,x) and  locates the occurrence of the string x in the string s. The function returns and integer denoting the first occurrence of the string x in s (0 based indexing).
Note: You are not allowed to use inbuilt function.

Example 1:
Input:
s = GeeksForGeeks, x = Fr
Output: -1
Explanation: Fr is not present in the
string GeeksForGeeks as substring.
*/

class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
       // Your code here
       int res=0;
       if(s.contains(x)){
           return s.indexOf(x);
       }
       else{
           return -1;
       }
    }
}
