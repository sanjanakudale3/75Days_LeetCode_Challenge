class Solution {
    public int missingNumber(int[] nums) {

        Arrays.sort(nums);

if (nums.length == 1) {
    if (nums[0] == 0) {
        return 1;
    } else {
        return 0;
    }
}

            if (nums[0] != 0) {
            return 0;
        }
        int ans = -1;
        for(int j = 0 ; j< nums.length-1; j++){
            if(nums[j+1]-nums[j] != 1){
                 ans = nums[j+1]-1;
                 break;
            }
        }
        if(ans == -1 ){
            return nums[nums.length-1]+1;
        }
        else {
            return ans;
        }

    }
}
        
    
