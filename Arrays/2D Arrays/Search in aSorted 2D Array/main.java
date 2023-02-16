



//Linear Search
static int SearchMatric(int[][] matrix){
int rows = matrix.length;
int cols = matrix[0].length;

    for(int i = 0;i<rows;i++){
      for(int j =0;j<cols;j++){
          
        if(matrix[i][j] == target){
            return true;
          }
      }
   }
return false;
}
