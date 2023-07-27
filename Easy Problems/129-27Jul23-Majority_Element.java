/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3
*/

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int len = nums.length;
        int count = 0,ans=0;
        for(int i=0;i<len;i++){
            if(map.get(nums[i])==null){
                map.put(nums[i],1);
            }
            else{
                int val = map.get(nums[i]);
                map.put(nums[i], val+1);
            }
            if(map.get(nums[i])>count){
                ans = nums[i];
            }
            count = Math.max(count, map.get(nums[i]));
        }
        return ans;
    }
}
