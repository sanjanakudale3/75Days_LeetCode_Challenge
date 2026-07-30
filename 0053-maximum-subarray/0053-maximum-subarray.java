class Solution {
    public int maxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < nums.length; i++) {

            currSum += nums[i];

            // First update maxSum
            maxSum = Math.max(maxSum, currSum);

            // Then reset currSum if it becomes negative
            if (currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }
}