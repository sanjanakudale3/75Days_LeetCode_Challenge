class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        // Traverse 2 times because array is circular
        for (int i = 2 * n - 1; i >= 0; i--) {

            int index = i % n;

            // Remove smaller or equal elements
            while (!st.isEmpty() && st.peek() <= nums[index]) {
                st.pop();
            }

            // Only fill answer during first traversal
            if (i < n) {
                if (st.isEmpty()) {
                    ans[index] = -1;
                } else {
                    ans[index] = st.peek();
                }
            }

            // Push current element
            st.push(nums[index]);
        }

        return ans;
    }
}