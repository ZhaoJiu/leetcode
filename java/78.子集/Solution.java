class Solution{
	 /**
     * 78. 子集
     * @param nums
     * @return
     */
    public List<List<Integer>> subsets(int[] nums) {
        // 初始化一个2层嵌套集合
        List<List<Integer>> lists = new ArrayList();
        // 如果传入的数据为null 返回一个null
        if(nums.length == 0)
            return lists;
        // 如果nums不为null时 先给集合添加一个为空的元素
        lists.add(new ArrayList<Integer>());
        // 遍历所有数据
        for (int i:nums) {
            // 获取当前集合内部的元素个数
            int len = lists.size();
            // 针对不同的元素来添加个数
            for (int j=0;j<len;j++) {
                // 在当前已存在的元素的基础上来添加值
                List<Integer> temp = new ArrayList<>(lists.get(j));
                temp.add(i);
                lists.add(temp);
            }
        }
        return lists;
    }
}