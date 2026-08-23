class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        int n = nums.length;
        while(i<n)
        {
            int correctIdx = nums[i] - 1;
            if(nums[i] > 0 && nums[i]<=n && nums[i]!=nums[correctIdx])
            {
                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            }
            else
            {
                i++;
            }
        }
        for(i = 0; i < n; i++)
        {
            if(nums[i] != i+1)
            {
                return i+1;
            }
        }
        return n+1;
    }
}