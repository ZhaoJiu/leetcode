class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        List<List<Integer>> target = new ArrayList<>();
        prepList(root,lists,0);
        // 将生成的正序层次遍历 倒叙遍历出来
        for (int i=lists.size()-1;i>=0;i--)
            target.add(lists.get(i));
        return target;
    }
    
    public void prepList(TreeNode root,List<List<Integer>> lists,int level) {

        if (root == null) 
            return;
          
        if (lists.size() <= level) {
            lists.add(new ArrayList<Integer>());
        }
        prepList(root.left,lists,level+1);
        prepList(root.right,lists,level+1);
        lists.get(level).add(root.val);
    }
}