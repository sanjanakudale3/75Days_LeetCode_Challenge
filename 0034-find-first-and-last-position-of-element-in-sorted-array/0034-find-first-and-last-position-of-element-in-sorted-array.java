class Solution {
    public int[] searchRange(int[] nums, int target) {
        //use binary search twice for first and last position..

        int first = FirstPosition(nums ,target);
        int last = lastPosition(nums, target);
         return new int []{first,last};
        }

        public int  FirstPosition(int nums[] , int target){
            int low = 0; 
            int high = nums.length-1;
            int result = -1; 

            while(low <= high ){
                int mid = low + (high - low)/2;

                if(nums[mid] ==  target){
                     result = mid ; 
                    high = mid-1;
                }
               else if(nums[mid] < target){
                    low = mid +1 ; 
                }else{
                    high = mid -1;
                }
            }
            return result;
        }

        public int lastPosition(int nums[] , int target ){
            int low = 0;
            int high = nums.length-1;
            int result =-1;

            while(low <= high){
                int mid = low + (high - low )/2;

                if(nums[mid] ==target){
                    result = mid ;
                    low = mid +1;

                }
                else if (nums[mid] < target){
                    low = mid + 1; 
                }else{
                    high = mid -1;
                }
            }
            return result ;

        }
  
    }
