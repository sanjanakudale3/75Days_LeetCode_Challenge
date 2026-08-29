class Solution {
    public int maximumSum(int[] arr) {
        
        int noDelete = arr[0];
        int oneDelete = Integer.MIN_VALUE /2;
        int ans = arr[0];

        for(int i =1; i<arr.length; i++){

            int preNoDelete = noDelete;

            noDelete = Math.max(arr[i], noDelete+arr[i]);
            oneDelete = Math.max(oneDelete + arr[i] , preNoDelete );
            ans = Math.max(ans, Math.max(noDelete,oneDelete));
        }

        return ans;
    }
}