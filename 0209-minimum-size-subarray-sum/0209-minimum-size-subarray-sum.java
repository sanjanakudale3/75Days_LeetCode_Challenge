class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        //sliding window (variable (hiring and firing ))

        int left = 0 ; 
        int n = nums.length;
        int sum = 0; 
        int minlength = Integer.MAX_VALUE; //-infinity

        for( int right = 0 ; right< n; right++ ){

            sum +=  nums[right];

            while(sum >= target){
                minlength = Math.min( minlength , right - left + 1); //compare length 
                sum = sum - nums[left];
                left ++;  //2
            }
           
        }

        if (minlength == Integer.MAX_VALUE){
            return 0;
        }else{
            return minlength;
        }
        
    }
}