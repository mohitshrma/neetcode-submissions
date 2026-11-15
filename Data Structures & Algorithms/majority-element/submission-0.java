class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> counts = new HashMap<>();
        int threshold = nums.length/2;

        for(int num:nums)
        {
            int newCount = counts.getOrDefault(num,0) + 1;
            counts.put(num,newCount);

            if(newCount > threshold)
            {
                return num;
            }
        }
        return -1;
    }
}