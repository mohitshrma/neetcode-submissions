class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //Create a HashSet for tracking duplicates.
        Set<Integer> set = new HashSet<>();

        //Iterate over the nums array using for loop
        for(int i = 0; i < nums.length; i++)
        {
            //Check if i > k (window size)
            if(i > k)
            {
                //remove the element to maintain a size of k.
                set.remove(nums[i-k-1]);
            }
            //check if element has already been added to hashset, if it is return true.
            if(!set.add(nums[i]))
            {
                return true;
            }
        }
        // otherwise, return false.
        return false;
        
    }
}