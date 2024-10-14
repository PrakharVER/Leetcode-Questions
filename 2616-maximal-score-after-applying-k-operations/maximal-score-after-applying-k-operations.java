class Solution 
{
    public long maxKelements(int[] nums, int k) 
    {
        long maaxxScore = 0;
        PriorityQueue<Integer> peequu = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<nums.length; i++) 
        {
            peequu.add(nums[i]);
        }
        int time= 0;
        while(time!= k) 
        {
            int num = peequu.poll();
            maaxxScore += num;
            peequu.add((int)Math.ceil((double)num/3));
            time++;
        }
        return maaxxScore;
    }
}