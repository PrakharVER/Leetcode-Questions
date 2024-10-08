class Solution 
{
    public boolean isUnivalTree(TreeNode root) 
    {
        int data=root.val;
        return check(root,data); 
    }
    boolean check(TreeNode root, int val)
    {
        if(root==null)
        {
            return true;
        }
        if(root.val!=val)
        {
            return false;
        }
        return check(root.left,val)&&check(root.right,val);   
    }
}