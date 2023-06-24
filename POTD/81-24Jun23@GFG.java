/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given an array of strings arr[] of size n, a string str and an integer k. The task is to find the count of strings in arr[] whose prefix of length k matches with the k-length prefix of str.

Example 1:
Input:
n = 6
arr[] = {“abba”, “abbb”, “abbc”, “abbd”, 
“abaa”, “abca”}
str = “abbg”
k = 3
Output: 
4 
Explanation:
“abba”, “abbb”, “abbc” and “abbd” have their prefix of length 3 equal to 3-length prefix of str i.e., "abb".
*/

class Solution
{
    public int klengthpref(String[] arr, int n, int k, String str)
    {
        // code here
        if(str.length()<k) return 0;
        int count=0;
        for(int i=0;i<n;i++){
            int arrlen = Math.min(k, arr[i].length());
            String str1 = arr[i].substring(0,arrlen);
            if(str1.equals(str.substring(0,k))){
                count++;
            }
        }
        return count;
    }
}
