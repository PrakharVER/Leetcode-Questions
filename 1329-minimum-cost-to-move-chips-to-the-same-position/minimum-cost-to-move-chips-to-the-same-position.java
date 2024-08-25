class Solution 
{
    public int minCostToMoveChips(int[] position) 
    {
        int countEve = 0, countOd = 0;
        for (int i = 0; i<position.length; i++) 
        {
            if (position[i] % 2 == 0) countEve++;
            else countOd++; 
        }
        return Math.min(countOd, countEve);
    }
}