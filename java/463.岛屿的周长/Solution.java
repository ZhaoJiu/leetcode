class Solution {
    public int islandPerimeter(int[][] grid) {
       // ͳ�Ʊ߳�
        int size = 0;
        for (int i=0;i<grid.length;i++) {
            for (int j=0;j<grid[i].length;j++) {
                // ����ǵ� �ſ�ʼͳ�Ʊ߳�
                if (grid[i][j] == 1) {
                    // �жϱ߽����
                    if (i == 0)
                        size ++;
                    if (i == grid.length-1)
                        size ++;
                    if (j == 0)
                        size ++;
                    if (j == grid[i].length-1)
                        size ++;
                    // �ж�4��
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