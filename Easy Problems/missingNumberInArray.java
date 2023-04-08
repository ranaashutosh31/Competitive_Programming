/*
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

Example 1:
Input:
N = 5
A[] = {1,2,3,5}
Output: 4
*/

class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int sum = n*(n+1)/2;
        int arSum=0;
        for(int i=0;i<array.length;i++){
            arSum+=array[i];
        }
        int missNo = sum-arSum;
        return missNo;
    }
