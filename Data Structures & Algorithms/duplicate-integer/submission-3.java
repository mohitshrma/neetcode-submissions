class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Create HashSet as it does not allow duplicate elements
        Set<Integer> seenNumbers = new HashSet<>();
        //Iterating through nums array
        for(int num:nums)
        {
           if(!seenNumbers.add(num))
           {
            return true;
           }
        }
        return false;
    }
}