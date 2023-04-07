/*
Given an array A of n positive numbers. The task is to find the first index in the array such that the sum of elements before it is equal to the sum of elements after it.
Note:  Array is 1-based indexed.

Example 1:

Input: 
n = 5 
A[] = {1,3,5,2,2} 
Output: 3 
Explanation: For second test case 
at position 3 elements before it 
(1+3) = elements after it (2+2). 
*/

class Solution{
	int equalSum(int [] A, int N) {
		//Write your code here
		int l = 0;
        int r = N-1;
        int leftsum = 0;
        int rightsum = 0;
        
        while(l<r){
            if(leftsum<rightsum){
                leftsum+=A[l];
                l++;
            }else{
                rightsum+=A[r];
                r--;
            }
        }
        
        return leftsum==rightsum?l+1:-1;
	}
}
