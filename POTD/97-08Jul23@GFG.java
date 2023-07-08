/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given an array arr[] of n integers. Check whether it contains a triplet that sums up to zero. 

Note: Return 1, if there is at least one triplet following the condition else return 0.

Example 1:
Input: n = 5, arr[] = {0, -1, 2, -3, 1}
Output: 1
Explanation: 0, -1 and 1 forms a triplet
with sum equal to 0.
*/

class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int k=i+1,j=n-1;
            int s=0-arr[i];
            while(k<j){
                if(arr[k]+arr[j]==s){
                    return true;
                }
                else if(arr[k]+arr[j]>s) j--;
                else k++;
            }
        }
        return false;
    }
}
