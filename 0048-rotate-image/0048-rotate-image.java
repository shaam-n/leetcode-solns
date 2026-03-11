class Solution {
    public void rotate(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        for(int i = 0;i < r;i++){
            for(int j = 0;j < i;j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        for(int i = 0;i < r;i++){
            for(int j = 0;j < c/2;j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][c-j-1];
                matrix[i][c-j-1] = tmp;
            }
        }
    }
}