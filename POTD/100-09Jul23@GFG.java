/*
PROBLEM LINK IN EXTENDED DESCRIPTION
You are given an array arr[] of N integers including 0. The task is to find the smallest positive number missing from the array.

Example 1:

Input:
N = 5
arr[] = {1,2,3,4,5}
Output: 6
Explanation: Smallest positive missing 
number is 6.
*/

class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        Arrays.sort(arr);
        int num=1;
        if(size==1){
            if(arr[0]==0) return 1;
        }
        for(int i=0;i<size;i++){
            if(arr[i]>0){
                if(arr[i]==num && i<size-1){
                    if(arr[i]!=arr[i+1]) num++;
                }
                else if(arr[i]==num && i>=size-1){
                    num++;
                }
                else{
                    return num;
                }
            }
        }
        return num;
    }
}
