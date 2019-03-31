class Solution {
    public int climbStairs(int n) {
        int[] size = new int[n+1];
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        size[1] = 1;
        size[2] = 2;
        for (int i=3;i<size.length;i++)
            size[i] = size[i-1]+size[i-2];
        return size[n];
    }
}