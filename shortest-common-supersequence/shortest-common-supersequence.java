class Solution 
{
    public String shortestCommonSupersequence(String str1, String str2) 
    {
        int l1 = str1.length();
        int l2 = str2.length();
        int[][] dp = new int[l1+1][l2+1];
        for(int i = 0 ; i <= l1 ; i++)
            dp[i][0] = 1;
        for(int j = 0 ; j <= l2 ; j++)
            dp[0][j] = 1;
        for(int i = 1 ; i <= l1 ; i++)
        {
            for(int j = 1 ; j <= l2 ; j++)
            {
                if(str1.charAt(i-1) == str2.charAt(j-1))
                    dp[i][j] = 1+dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
            }
        }
        String ans = "";
        while(l1 >= 1 && l2 >= 1)
        {
            if(str1.charAt(l1-1) == str2.charAt(l2-1))
            {
                ans = str1.charAt(l1-1) + ans;
                l1--;
                l2--;
            }
            else
            {
                if(dp[l1-1][l2] > dp[l1][l2-1])
                {
                    ans = str1.charAt(l1-1) + ans;
                    l1--;
                }
                else
                {
                    ans = str2.charAt(l2-1) + ans;
                    l2--;
                }
            }
        }
        while(l1 > 0)
            ans = str1.charAt(--l1) + ans;
        while(l2 > 0)
            ans = str2.charAt(--l2) + ans;
        return ans;
    }
}