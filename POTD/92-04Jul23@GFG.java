/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given an array of positive numbers, the task is to find the number of possible contiguous subarrays having product less than a given number k.

Example 1:

Input : 
n = 4, k = 10
a[] = {1, 2, 3, 4}
Output : 
7
Explanation:
The contiguous subarrays are {1}, {2}, {3}, {4} 
{1, 2}, {1, 2, 3} and {2, 3} whose count is 7.
*/

class Solution {
    
    public int countSubArrayProductLessThanK(long a[], int n, long k)
    {
        int count = 0;
        long prod = 1;
        int start = 0 ;
        int end = 0;
        for(;end<n;end++){
            prod *= a[end];
            while(start<end && prod>=k){
                prod /= a[start];
                start++;
            }
            if(prod < k)
            count += end - start + 1;
        }
        return count;
    }
}
