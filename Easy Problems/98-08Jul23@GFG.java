/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given an array A of size N of integers. Your task is to find the sum of minimum and maximum element in the array.

Example 1:
Input:
N = 5
A[] = {-2, 1, -4, 5, 3}
Output: 1
Explanation: min = -4, max =  5. Sum = -4 + 5 = 1
*/

class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        //code here
        int max=A[0],min=A[0];
        for(int i=0;i<N;i++){
            min = Math.min(min,A[i]);
            max = Math.max(max,A[i]);
        }
        return max+min;
    }
}
