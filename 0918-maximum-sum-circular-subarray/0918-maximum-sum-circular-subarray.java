class Solution {
    public int maxSubarraySumCircular(int[] nums) {

    int totalsum = 0;
    for(int i = 0; i<nums.length; i++){
        totalsum = totalsum + nums[i];
     }

    int bestending = nums[0];
    int maxsum = nums[0];
     for(int i = 1; i< nums.length; i++){
            int v1 = bestending + nums[i];
            int v2 = nums[i];
             bestending = Math.max(v1,v2);   
             maxsum = Math.max( maxsum , bestending);
     }
     
    
     int minsum = nums[0];
     bestending = nums[0];
     for(int i = 1; i< nums.length; i++){
        int v1 = bestending + nums[i];
        int v2 = nums[i];
        bestending = Math.min(v1,v2);
        minsum = Math.min(bestending , minsum);

     }
     if(maxsum < 0){
        return maxsum;
     }else{
      return Math.max(maxsum, (totalsum - minsum));
     }

      
        
    }
}