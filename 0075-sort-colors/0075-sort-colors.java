class Solution {
    public int[] sortColors(int[] nums) {
        
   int start = 0 ; 
   // int mid = 0 ; 
   int end = nums.length-1;

   for(int mid = 0 ; mid <= end; ){
    //move 0's forward 

    if(nums[mid]==0){
        int temp = nums[start];
        nums[start] = nums[mid];
        nums[mid] = temp;
        start++;
        mid++;
    }
    //for 1's only increment (focuses on only high and low element)

    else if (nums[mid]==2){
   int temp = nums[end];
        nums[end] = nums[mid];
        nums[mid] = temp;
        end--;

    } else{
        mid++;
    }
   
    }
   return nums;
   
    }


}