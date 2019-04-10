class Solution {
	// DFS
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> lists = new ArrayList<>();
        helper(lists,root,0);
        return lists;
    }
    
    public void helper(List<List<Integer>> lists,Node root,int level) {
        if (root == null)
            return;
        if (level >= lists.size()) lists.add(new ArrayList<Integer>());
        lists.get(level).add(root.val);
        for(Node n:root.children) helper(lists,n,level+1);
    }
}