class Solution {
    public int[] plusOne(int[] digits) {

        int n = digits.length; 

        for(int i = digits.length -1; i>=0; i-- ){

//<9 case handle
            if(digits[i] <9){
                digits[i]++;
                return digits;
            }
    //9 chi case handle karto
            digits[i] =0;

        }
// if no. is 999 then for 1000 we are doing n+1 ...jar sgle 9 astil tar
//result navaychya array cha 1st index ha 1 theva
    int [] result = new int[n +1];
    result[0] = 1;

      return result;

    }
}