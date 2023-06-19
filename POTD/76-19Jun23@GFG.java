/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given an array arr[] of size N where every element is in the range from 0 to n-1. Rearrange the given array so that the transformed array arrT[i] becomes arr[arr[i]].

NOTE: arr and arrT are both same variables, representing the array before and after transformation respectively.

Example 1:
Input:
N = 2
arr[] = {1,0}
Output: 0 1
Explanation: 
arr[arr[0]] = arr[1] = 0.
arr[arr[1]] = arr[0] = 1.
*/

class Solution
{
 
    // arr: input array
    // n: size of array
    //Function to rearrange an array so that arr[i] becomes arr[arr[i]]
    //with O(1) extra space.
    static void arrange(long arr[], int n)
    {
        // your code here
        for(int i=0;i<arr.length;i++){
            arr[i]=(arr[(int)arr[i]]%n)*n+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]/n;
        }
    }
}
