class Solution {
    public int maxProduct(int[] nums) {

       int maximum = nums[0];
       int minimum = nums[0];
       int result = nums[0];

       for(int i = 1; i< nums.length; i++){
            int v1 = nums[i];
            int v2 = maximum*nums[i];
            int v3 = minimum*nums[i];

            maximum = Math.max(nums[i], Math.max(v2,v3));
            minimum = Math.min(nums[i], Math.min(v2,v3));
            result = Math.max(result, Math.max(maximum,minimum));
       } 
        return result;
    }
}