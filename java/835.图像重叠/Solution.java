public class Solution {
    /**
     * ��������ͼ�� A �� B ��A �� B Ϊ��С��ͬ�Ķ�ά�����ξ��󡣣�����Ϊ�����ƾ���ֻ����0��1����
     *
     * ����ת������һ��ͼ�������ң��ϣ����»����κ������ĵ�λ��������������һ��ͼ������档֮�󣬸�ת�����ص���ָ����ͼ�񶼾��� 1 ��λ�õ���Ŀ��
     *
     * ����ע�⣬ת�����������κη�����ת����
     *
     * �����ܵ��ص���ʲô��
     *
     * ʾ�� 1:
     *
     * ���룺A = [[1,1,0],
     *           [0,1,0],
     *           [0,1,0]]
     *      B = [[0,0,0],
     *           [0,1,1],
     *           [0,0,1]]
     * �����3
     * ����: �� A �����ƶ�һ����λ��Ȼ�������ƶ�һ����λ��
     * ע��:
     *
     * 1 <= A.length = A[0].length = B.length = B[0].length <= 30
     * 0 <= A[i][j], B[i][j] <= 1
     */
    public int largestOverlap(int[][] A, int[][] B) {
        // �ж�A B �����������ص�ֵ
        // ���͵Ķ�̬�滮����
        int maxArea = 0;
        for (int i=0;i<A.length;i++) {
            for (int j=0;j<A.length;j++) {
                int flag1 = 0;
                int flag2 = 0;
                for (int m=0;m<A.length-i;m++)
                    for (int n=0;n<A.length-j;n++) {
                        if ((A[m][n]&B[m+i][n+j]) == 1) flag1 ++; // A�嶯
                        if ((B[m][n]&A[m+i][n+j]) == 1) flag2 ++; // B�嶯
                    }

                if (flag1 > maxArea) maxArea = flag1;
                if (flag2 > maxArea) maxArea = flag2;
            }
        }
        return maxArea;
    }

}
