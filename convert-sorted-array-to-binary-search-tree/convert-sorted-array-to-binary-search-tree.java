class Solution {

    public TreeNode createBST(int nums[], int start, int end) {
        if(start>end) {
            return null;
        }
        int mid = (start+end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createBST(nums,start,mid-1);
        root.right = createBST(nums,mid+1,end);
        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums,0,nums.length-1);
    }
}