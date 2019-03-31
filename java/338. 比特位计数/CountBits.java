class countBits {
    public int[] countBits(int num) {
        int[] source = new int[num+1];
        for (int i=1;i<=num ;i++) {
            int temp = i;
            int count = 0;
            do {
                count ++;
            } while ( (temp = temp & (temp-1) ) != 0 );
            source[i] = count;
        }
        return source;
    }
}