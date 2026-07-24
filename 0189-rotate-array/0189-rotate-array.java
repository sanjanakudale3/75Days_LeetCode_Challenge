class Solution {
    public void rotate(int[] nums, int k) {

        k = k%nums.length; //for preventing array indexOutOfBound


        //reverse the whole array 
        int start = 0;
        int end = nums.length-1;

        while(start < end){
           int temp = nums[start];
            nums[start] = nums[end];
             nums[end] = temp;
            start++;
            end--;
        }


        //reverse the array upto k
        int start1 = 0;
        int end1 = k-1;

        while(start1 < end1){
           int temp = nums[start1];
            nums[start1] = nums[end1];
            nums[end1] = temp;
            start1++;
            end1--;
        }

        //reverse array from k 


        int start2 = k ; 
        int end2 = nums.length-1;

        while(start2 < end2 ){
            int  temp = nums[start2];
            nums[start2] = nums[end2];
            nums[end2] = temp;
            start2++;
            end2--;


        }



        
    }
}