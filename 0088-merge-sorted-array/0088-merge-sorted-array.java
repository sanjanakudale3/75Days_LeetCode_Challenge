class Solution {
    public int []  merge(int[] nums1, int m, int[] nums2, int n) {
        
        int [] ans = new int [m+n];

        int i = 0; 
        int j =0;
        int k = 0; 

        while( i < m &&  j < n){
           
            if(nums1[i] <= nums2[j] ){
                ans[k] = nums1[i];
                i++;
                k++;
           } else{
                ans[k] = nums2[j];
                j++;
                k++;
            }

        }
          // i is outof array hence we are taking j 
        while(i < m ){
            ans[k] = nums1[i];
            i++;
            k++;
        }
      
        // j is out of array hence we are taking j
        while( j < n){
            ans[k] = nums2[j];
            j++;
            k++;
        }
        //for initializing array ans to the nums1 
        for (int x = 0; x < m + n; x++) {
            nums1[x] = ans[x];
        }
        return nums1;
    }
}