class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length, mult = 1;

        int[] res = new int[n];

        //From left to right (prefix aproach)
        for(int i = 0; i < n; i++)
        {
            res[i] = mult;
            mult *= nums[i];
        }

        //Reset value of mult to 1
        mult = 1;
        //From right to left (postfix approach)
        for(int j = n-1; j >=0; j--)
        {
            res[j] *= mult;
            mult *= nums[j];
        }
    return res;
    }
}  
