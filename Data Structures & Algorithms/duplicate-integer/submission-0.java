class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Create HashSet as it does not allow duplicate elements
        Set<Integer> seenNumbers = new HashSet<>();
        //Iterating through nums array
        for(int num:nums)
        {
            //Check if hashset already contains the current number
            if(seenNumbers.contains(num))
            {
                //If it already contains the number, which means duplicate found and return true
                return true;
            }
            // If hashset does not contain number already, add the given number into it.
            seenNumbers.add(num);
        }
        return false;
    }
}