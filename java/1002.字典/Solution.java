public class Solution {
    /**
     *  1002 ���ҳ����ַ�
     * @param A ����һ������Сд��ĸ��ɵ��ַ�������
     * @return ÿ���ַ�������ʾ��ȫ���ַ��������ظ��ַ�����ɵ��б�
     */
    public List<String> commonChars(String[] A) {
        // ������Ž��
        List<String> lists = new ArrayList<>();
        // ÿ���ַ���������һ�� ͳ��26���ַ��ĸ��� ȫ���Ƚ� ��С�ľ���ȫ�����ظ��ַ�����
        int[] size = new int[26];
        for (int i=0;i<A.length;i++) {
            if (i != 0) {
                int[]  max = new int[26];
                char[] chars = A[i].toCharArray();
                // ����ÿ���ַ��ĸ���
                for (char c:chars)  max[c-'a']++;
                // �ж�
                for (int j = 0;j<26;j++)
                    if (size[j] > max[j])
                        size[j] = max[j];
            } else {
                char[] chars = A[i].toCharArray();
                // ����ÿ���ַ��ĸ���
                for (char c:chars)  size[c-'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            for (int j=0;j < size[i]; j++) lists.add((char)(i+'a')+"");
        }
        return lists;
    }
}
