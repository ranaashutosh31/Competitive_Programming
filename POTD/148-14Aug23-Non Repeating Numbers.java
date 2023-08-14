//PROBLEM LINK IN EXTENDED DESCRIPTION

class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
        Arrays.sort(nums);
        int[] arr = new int[2];
        int j = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i==n-1){
                if(nums[i]==nums[i-1]) continue;
                else arr[j] = nums[i];
            }
            else if(i==0){
                if(nums[i]!=nums[i+1]){
                    arr[j] = nums[i];
                    j++;
                }
            }
            else{
                if((nums[i]!=nums[i+1]) && (nums[i]!=nums[i-1])){
                    arr[j] = nums[i];
                    j++;
                }
            }
        }
        return arr;
    }
}
