/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given a matrix with n rows and m columns. Your task is to find the kth element which is obtained while traversing the matrix spirally. You need to complete the method findK which takes four arguments the first argument is the matrix A and the next two arguments will be n and m denoting the size of the matrix A and then the forth argument is an integer k. The function will return the kth element obtained while traversing the matrix spirally.

Example 2:
Input:
n = 3, m = 3, k = 4
A[][] = {{1 2 3},
         {4 5 6},
         {7 8 9}}
Output:
6
Explanation:
The spiral order of matrix will look like 1->2->3->6->9->8->7->4->5. So the 4th element in this order is 6.
*/

class Solution
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
	// Your code here	
	    int left=0,right=m-1;
	    int top=0, bottom=n-1;
	    int count=1;
	    while(left<=right && top<=bottom){
	        for(int col=left;col<=right;col++){
	            if(count==k){
	                return A[top][col];
	            }
	            count++;
	        }
	        top++;
	        for(int row=top;row<=bottom;row++){
	            if(count==k){
	                return A[row][right];
	            }
	            count++;
	        }
	        right--;
	        for(int col=right;col>=left;col--){
	            if(count==k){
	                return A[bottom][col];
	            }
	            count++;
	        }
	        bottom--;
	        for(int row=bottom;row>=top;row--){
	            if(count==k){
	                return A[row][left];
	            }
	            count++;
	        }
	        left++;
	    }
	    return -1;
    }
}
