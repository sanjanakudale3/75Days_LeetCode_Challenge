class Solution {
    public int[] runningSum(int[] nums) {

        int n = nums.length;
        int ans [] = new int[n];
        int sum =0; 
        for(int i =0; i<nums.length; i++){
            sum = sum + nums[i];
            ans[i] = sum;
        }
        return ans;

    }
}