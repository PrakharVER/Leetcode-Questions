class Solution 
{
    public long kthLargestLevelSum(TreeNode root, int k) 
    {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        PriorityQueue<Long> pequ = new PriorityQueue<>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            int size = queue.size();
            long sum = 0;
            for(int i =0; i < size; i++){
                TreeNode curr = queue.poll();
                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);
                sum += curr.val;    
            }
            pequ.add(sum);
            if (pequ.size() > k) pequ.poll();
        }
        return pequ.size() == k ? pequ.peek() : -1;
    }    
}