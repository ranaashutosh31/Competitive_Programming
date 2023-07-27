/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
Example 1:
Input: nums = [2,2,1]
Output: 1
*/

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
                int val = map.get(nums[i]);
                map.put(nums[i],val+1);
        }
        for(int j=0;j<nums.length;j++){
            if(map.get(nums[j])==1) return nums[j];
        }
        return -1;
    }
}
