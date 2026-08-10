class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        
        int [] ans = new int [n]; //new array 

        int left = 0; 
        int right = n-1;

        for(int i = n - 1; i >= 0; i-- ){ 
             //we have to find largest element and place them according to right side...
             //because at the right side always greater number becuase array is sorted
            int leftsq = nums[left]*nums[left];  //square
            int rightsq = nums[right]*nums[right]; //square 

            //after the square checking either which square is largest then placing this value at the right side of new array (ans).

            if(leftsq > rightsq){
                ans[i] = leftsq ;    
                left++;
            }else{
                ans[i] = rightsq;
                right--;
            }

        }

        return ans;
    }
}