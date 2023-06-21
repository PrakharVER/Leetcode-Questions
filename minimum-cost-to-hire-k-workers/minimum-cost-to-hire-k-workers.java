class Solution 
{
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) 
    {
        int n=wage.length;
        double worker[][]=new double[n][2];
        for(int i=0;i<n;i++) 
        {
            double x=wage[i]/(quality[i]*1.0);
            worker[i][0]=x;
            worker[i][1]=quality[i];
        }
        Arrays.sort(worker,(a,b)->a[0]>b[0]?1:-1);
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        double ans=Double.MAX_VALUE;
        double totalWage=0;
        for (double[] a:worker) 
        {
	        if (pq.size() == k) 
            totalWage-=pq.poll();
	        pq.add(a[1]);
	        totalWage=(totalWage+a[1]);
            if(pq.size()==k)
            {
                double t=(totalWage*a[0]);
                ans=Math.min(ans,t);  
            }
        }
        return ans;
    }
}