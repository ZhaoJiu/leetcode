class Solution {
    public int islandPerimeter(int[][] grid) {
       // 统计边长
        int size = 0;
        for (int i=0;i<grid.length;i++) {
            for (int j=0;j<grid[i].length;j++) {
                // 如果是岛 才开始统计边长
                if (grid[i][j] == 1) {
                    // 判断边界情况
                    if (i == 0)
                        size ++;
                    if (i == grid.length-1)
                        size ++;
                    if (j == 0)
                        size ++;
                    if (j == grid[i].length-1)
                        size ++;
                    // 判断4周
                    if (i > 0)
                        if (grid[i-1][j] == 0)
                            size ++;
                    if (i < grid.length-1)
                        if (grid[i+1][j] == 0)
                            size ++;
                    if (j > 0)
                        if (grid[i][j-1] == 0)
                            size ++;
                    if (j < grid[i].length-1)
                        if (grid[i][j+1] == 0)
                            size ++;
                }
            }
        }
        return size;
    }
}