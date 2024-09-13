class Solution 
{
    public int minMovesToSeat(int[] seeats, int[] istudents) 
    {
        int n = seeats.length;
        Arrays.sort(seeats);
        Arrays.sort(istudents);
        int count = 0, i = 0;
        while(i < n){
            count += Math.abs(seeats[i]-istudents[i]);
            i++;
        }
        return count;
    }
}