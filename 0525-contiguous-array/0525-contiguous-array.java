class Solution {
    public int findMaxLength(int[] nums) {
        
        int n = nums.length ; 
        int zero =0; 
        int one =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int res = 0; 
         map.put(0, -1);
        for(int i =0; i< nums.length; i++){

            if(nums[i] == 0){
                zero++;
            }else{
                one++;
            }

            int diff = one - zero;
            
            if(map.containsKey(diff)){
                res = Math.max(res, i - map.get(diff));
            }else{
                map.put(diff, i);
            }

        } 

        return res;       
    }
}