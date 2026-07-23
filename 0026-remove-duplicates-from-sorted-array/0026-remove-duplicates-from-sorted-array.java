class Solution {
    public int removeDuplicates(int[] nums) {
        

        // remove duplicate using two pointer 

   int i = 0; 

   for(int j = 1; j<nums.length; j++){  
    if(nums[i] != nums[j]){
        i++;                
        nums[i]= nums[j]; // replace another unique element after the previous element  

    }
   } 
   return i + 1; 
    }
}