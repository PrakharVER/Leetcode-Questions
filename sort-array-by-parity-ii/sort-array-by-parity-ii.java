class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] freq = new int[1001];
        for (int n : nums){
            freq[n]++;
        }
        for (int k = 0; k < 2; k++) {
            int cur = k;
            for (int i = k; i < nums.length; i += 2) {
                while (freq[cur] == 0) cur += 2;
                freq[cur]--;
                nums[i] = cur;
            }
        }
        return nums;
    }
}