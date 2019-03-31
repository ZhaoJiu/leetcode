class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        if (grid[0][0] == 1)
            return 0;
        for (int i=0;i<grid.length;i++) {
            for (int j=0;j<grid[i].length;j++){
                if (i == 0 || j == 0) {
                    if (grid[i][j] == 1) {
                        grid[i][j] = 0;
                    } else {
                       grid[i][j] = 1; 
                    }
                    continue;
                }
                if (grid[i][j] == 1) {
                    grid[i][j] = 0;
                    continue;
                }
                grid[i][j] = 2;
                
            }
        }
            
        for (int m=1;m<grid.length;m++) {
            for (int n=1;n<grid[m].length;n++){
                if (grid[m][n] == 2)
                    grid[m][n] = grid[m-1][n]+grid[m][n-1];
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}