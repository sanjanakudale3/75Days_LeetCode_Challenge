class Solution {
    public int singleNonDuplicate(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            // Make mid even
            if (mid % 2 == 1) {
                mid--;
            }

            // Pair is correct → single is on the right
            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2;
            }

            // Pair is broken → single is at mid or on the left
            else {
                high = mid;
            }
        }

        // At the end, low == high
        // This is the index of the single element
        return nums[low];
    }
}

// class Solution {
//     public int singleNonDuplicate(int[] nums) {
        
//         HashMap<Integer,Integer> map = new HashMap<>();
        
//        for(int i =0; i< nums.length; i++){
//         if(map.containsKey(nums[i])){
//             map.put(nums[i],map.get(nums[i]) +1);
//         }else{
//             map.put(nums[i],1);
//         }
//        }
//        for (int i = 0; i < nums.length; i++) {
//         if(map.get(nums[i]) == 1){
//             return nums[i];
//         }
//        }
//         return 0;
//     }
// }