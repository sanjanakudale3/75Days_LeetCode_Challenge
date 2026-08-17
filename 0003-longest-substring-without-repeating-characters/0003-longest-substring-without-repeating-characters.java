class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> set = new HashSet <>();
        int left =0; 
        int maxlength = 0;

        for(int right =0; right <s.length(); right++){
            char rightchar = s.charAt(right);
           
            while(set.contains(rightchar)){
                 char leftchar = s.charAt(left);

                set.remove( leftchar);
                left++;
            }
            set.add(s.charAt(right)); 
              maxlength = Math.max( maxlength , right - left +1);
        }

       return maxlength ;
    }
}