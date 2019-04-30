public class Solution {
    /**
     * 给出两个图像 A 和 B ，A 和 B 为大小相同的二维正方形矩阵。（并且为二进制矩阵，只包含0和1）。
     *
     * 我们转换其中一个图像，向左，右，上，或下滑动任何数量的单位，并把它放在另一个图像的上面。之后，该转换的重叠是指两个图像都具有 1 的位置的数目。
     *
     * （请注意，转换不包括向任何方向旋转。）
     *
     * 最大可能的重叠是什么？
     *
     * 示例 1:
     *
     * 输入：A = [[1,1,0],
     *           [0,1,0],
     *           [0,1,0]]
     *      B = [[0,0,0],
     *           [0,1,1],
     *           [0,0,1]]
     * 输出：3
     * 解释: 将 A 向右移动一个单位，然后向下移动一个单位。
     * 注意:
     *
     * 1 <= A.length = A[0].length = B.length = B[0].length <= 30
     * 0 <= A[i][j], B[i][j] <= 1
     */
    public int largestOverlap(int[][] A, int[][] B) {
        // 判断A B 两个面的最大重叠值
        // 典型的动态规划问题
        int maxArea = 0;
        for (int i=0;i<A.length;i++) {
            for (int j=0;j<A.length;j++) {
                int flag1 = 0;
                int flag2 = 0;
                for (int m=0;m<A.length-i;m++)
                    for (int n=0;n<A.length-j;n++) {
                        if ((A[m][n]&B[m+i][n+j]) == 1) flag1 ++; // A板动
                        if ((B[m][n]&A[m+i][n+j]) == 1) flag2 ++; // B板动
                    }

                if (flag1 > maxArea) maxArea = flag1;
                if (flag2 > maxArea) maxArea = flag2;
            }
        }
        return maxArea;
    }

}
