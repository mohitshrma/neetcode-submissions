//The most efficient approach is using HashMap to track elements along with indices.
// Time complexity:-> O(n)
// Space complexity:-> O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Creating a HashMap to store elements along with indices (Key-value) pair.
        Map<Integer, Integer> map = new HashMap<>();
        //Traversing through nums array
        for(int i = 0; i < nums.length; i++)
        {
            //Calculate the complement of current number
            int complement = target - nums[i];

            //check if map already contains key, if yes return true
            if(map.containsKey(complement))
            {
                return new int[] {map.get(complement), i};
            }
            //if not, add the value with its index to map.
            map.put(nums[i], i);
        }
         //Otherwise, return a new array
         return new int[]{};
    }
}
