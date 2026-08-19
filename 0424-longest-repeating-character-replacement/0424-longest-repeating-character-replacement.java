class Solution {
    public int characterReplacement(String s, int k) {
        
        int f [] = new int [256]; 

        int low =0; 
        int maxcount =0; 
        int result =0; 

        for(int high=0; high < s.length(); high++){
              f[s.charAt(high)]++;

            maxcount = Math.max( maxcount ,    f[s.charAt(high)]);
            int length = high - low +1 ;
             int diff = length - maxcount;       

            while(diff > k){
                  f[s.charAt(low)]--;
                low++;
                 length = high -low+1;
                diff = maxcount - length;

            }
            result = Math.max(result,length);

        }

        return result ;
    }
}