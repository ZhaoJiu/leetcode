class Solution {
    public int uniquePaths(int m, int n) {
        int[][] mn = new int[m][n];
        mn[0][0] = 1;
        for (int i=0;i<m;i++)
            mn[i][0] = 1;
        for (int j=0;j<n;j++)
            mn[0][j] = 1;
        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++) {
                mn[i][j] = mn[i-1][j]+mn[i][j-1];
            }
        }
        return mn[m-1][n-1];
    }
}