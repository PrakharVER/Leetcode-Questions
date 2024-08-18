public class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int curMax = 0, curMin = 0, sum = 0;
        int maxSum = nums[0], minSum = nums[0];

        for (int num : nums) {
            curMax = Math.max(curMax + num, num);
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(curMin + num, num);
            minSum = Math.min(minSum, curMin);
            sum += num;
        }

        return sum == minSum ? maxSum : Math.max(maxSum, sum - minSum);
    }
}
