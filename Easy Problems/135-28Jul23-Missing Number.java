//PROBLEM LINK IN EXTENDED DESCRIPTION

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int n = nums[len-1];
        if(nums[0]==1) return 0;
        int sum1 = n*(n+1)/2;
        int sum2 = 0;
        for(int i=0;i<len;i++){
            sum2 += nums[i];
        }
        return sum1-sum2==0?n+1:sum1-sum2;
    }
}
