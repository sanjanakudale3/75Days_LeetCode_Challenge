class Solution {
    public int[] rearrangeArray(int[] nums) {

   int [] ans = new int[nums.length];

   int posSigned = 0; //even index
   int negSigned = 1; //odd index

   for(int i = 0 ; i < nums.length; i++){
    if(nums[i]>0){
        ans[posSigned]=nums[i];
        posSigned = posSigned + 2;
    }else{
        ans[negSigned] = nums[i];
        negSigned = negSigned + 2;
    }
   }
    return ans;    
    }
}