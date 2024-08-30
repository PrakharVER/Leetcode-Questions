class Solution 
{
    public int maxIncreaseKeepingSkyline(int[][] grid) 
    {
        int count = 0;
        int an = grid.length;
        int maxOfRows[] = new int[an];
        int maxOfColumns[] = new int[an];

        for(int i=0;i<an;i++){
            int max = 0;
            for(int j=0;j<an;j++){
                if(max<grid[i][j]){
                    max=grid[i][j];
                }
            }
            maxOfRows[i]=max;
        }

        for(int j=0;j<an;j++)
        {
            int max = 0;
            for(int i=0;i<an;i++)
            {
                if(max<grid[i][j])
                {
                    max=grid[i][j];
                }
            }
            maxOfColumns[j]=max;
        }

        for(int i=0;i<an;i++)
        {
            for(int j=0;j<an;j++)
            {
                count+=Math.min(maxOfColumns[i],maxOfRows[j])-grid[i][j];
            }
        }
        return count;
        
    }
}