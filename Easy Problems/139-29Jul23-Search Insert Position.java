// PROBLEM LINK IN EXTENDED DESCRIPTION

class Solution {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums,0,nums.length-1,target); 
    }
    public int binarySearch(int[] arr,int low,int high,int target){
        if(high>=low){
            int mid = low+(high-low)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]>target){
                return binarySearch(arr,low,mid-1,target);
            }
            else{
                return binarySearch(arr,mid+1,high,target);
            }
        }
        return low;
    }
}
