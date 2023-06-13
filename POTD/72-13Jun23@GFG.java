/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given an array Arr of N positive integers and an integer K, find K largest elements from the array.  The output elements should be printed in decreasing order.

Example 1:
Input:
N = 5, K = 2
Arr[] = {12, 5, 787, 1, 23}
Output: 787 23
Explanation: 1st largest element in the
array is 787 and second largest is 23.
*/

class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int brr[] = new int[k];
        int j=0;
        for(int i=n-1;i>=n-k;i--){
            brr[j]=arr[i];
            j++;
        }
        return brr;
    }
}
