class Solution {
    public int [][] rotate(int[][] matrix) {
        
        //transpose 

    for(int i = 0 ; i< matrix.length; i++){
    for(int j = i +1; j<matrix.length; j++){
        int temp   = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }    
    }

    //reverse
    
for(int i = 0;i < matrix.length; i++ ){

    int start =0;
    int end = matrix.length-1;

    while(start<end){
        int temp = matrix[i][end];
        matrix[i][end] = matrix[i][start];
        matrix[i][start] = temp;
        start++;
        end--;

    }

}
 return matrix;

    }
}