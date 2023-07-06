class Solution {
    public int help(int[] boxes,int l,int r,int count,int[][][] dp){
        if(l>r){
            return 0;
        }
        if(dp[l][r][count]>0){
            return dp[l][r][count];
        }
        int l_Ori=l;
        int r_Ori=r;
        int count_Ori=count;
        while(l+1<=r && boxes[l]==boxes[l+1]){
            count++;
            l++;
        }
        
        int ans=(count+1)*(count+1)+help(boxes,l+1,r,0,dp);

        for(int i=l+1;i<=r;i++){
            if(boxes[l]==boxes[i]){
                ans=Math.max(ans,help(boxes,l+1,i-1,0,dp)+help(boxes,i,r,count+1,dp));
            }
        }
        return dp[l_Ori][r_Ori][count_Ori]=ans;
    }
    public int removeBoxes(int[] boxes) {
        int[][][] dp=new int[boxes.length+1][boxes.length+1][boxes.length+1];
        
        return help(boxes,0,boxes.length-1,0,dp);
    }
}