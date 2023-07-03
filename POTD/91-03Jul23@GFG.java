/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given an array arr[] of n positive integers. The task is to find the maximum of j - i subjected to the constraint of arr[i] <= arr[j].

Example 1:
Input:
n = 9
arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1}
Output: 
6
Explanation: 
In the given array arr[1] < arr[7]  satisfying 
the required condition (arr[i] <= arr[j])  thus 
giving the maximum difference of j - i which is
6(7-1).
*/

class Solution {

    int maxIndexDiff(int arr[], int n) {
        // code here
        int maxDiff;
        
         int RMax[] =  new int[n];
         int LMin[] = new int[n];
         
         
         LMin[0] =  arr[0];
         for(int i =1; i<n;i++){
             LMin[i] = Math.min(LMin[i-1], arr[i]);
         }
         
         
         
         RMax[n-1] = arr[n-1];
         for(int j = n-2; j>=0; j--){
             RMax[j] =  Math.max(RMax[j+1], arr[j]);
         }
         
         
         int i =  0;
         int j = 0;
         
         maxDiff  =  0;
         
         while(i<n && j<n){
             if(LMin[i]<=RMax[j]){
                int diff =  j-i;
                maxDiff = Math.max(maxDiff, diff);
                j++;
             }
             else{
                 i++;
             }
         }
         
         return maxDiff;
    }
}
