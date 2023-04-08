//Given sorted array of size N and an integer K, find the position(0-based indexing) at which K is present in the array using binary search.
/*Example 1:

Input:
N = 5
arr[] = {1 2 3 4 5} 
K = 4
Output: 3
Explanation: 4 appears at index 3.*/

//code
class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int low=0, mid=0, high=(n-1);
        mid = (low+high)/2;//29
            while(low<high){
                if(arr[mid]==k){
                 return mid;
                }
                else if(arr[mid]<k){
                    low=mid+1;//30,52/45/52
                }
                else{
                    high=mid-1;//58//54//52
                }
                mid = (low+high)/2;//44,81/51,92/55,96/53,94
            }
        if(low>high || low==high && arr[mid]!=k){
            return -1;
        }
        else if(low==high && arr[mid]==k){
            return mid;
        }
        else{
            return mid;
        }
        
    }
}
