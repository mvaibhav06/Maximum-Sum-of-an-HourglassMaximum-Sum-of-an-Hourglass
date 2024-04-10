public class MaximumSum {
    public int maxSum(int[][] grid) {
        //grid[0][0] + grid[0][1] + grid[0][2] + grid[1][1] + grid[2][0] + grid[2][1] + grid[2][2];
        int out = Integer.MIN_VALUE;
        for(int i=0; i<grid.length-2; i++){
            for(int j=0; j<grid[1].length-2; j++){
                int sum = grid[i][j]+grid[i][j+1]+grid[i][j+2] +grid[i+1][j+1]+grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];
                if(sum > out){
                    out = sum;
                }
            }
        }
        return out;
    }
}
