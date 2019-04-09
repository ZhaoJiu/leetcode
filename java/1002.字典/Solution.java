public class Solution {
    /**
     *  1002 查找常用字符
     * @param A 闯入一个仅有小写字母组成的字符串数组
     * @return 每个字符串都显示的全部字符（包括重复字符）组成的列表
     */
    public List<String> commonChars(String[] A) {
        // 用来存放结果
        List<String> lists = new ArrayList<>();
        // 每个字符串都遍历一遍 统计26个字符的个数 全部比较 最小的就是全部的重复字符集合
        int[] size = new int[26];
        for (int i=0;i<A.length;i++) {
            if (i != 0) {
                int[]  max = new int[26];
                char[] chars = A[i].toCharArray();
                // 计算每个字符的个数
                for (char c:chars)  max[c-'a']++;
                // 判断
                for (int j = 0;j<26;j++)
                    if (size[j] > max[j])
                        size[j] = max[j];
            } else {
                char[] chars = A[i].toCharArray();
                // 计算每个字符的个数
                for (char c:chars)  size[c-'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            for (int j=0;j < size[i]; j++) lists.add((char)(i+'a')+"");
        }
        return lists;
    }
}
