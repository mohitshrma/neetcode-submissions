class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Checking edge case; if array equals k size, all elements are part of the answer.
        if(nums.length == k)
        {
            return nums;
        }

        //HashMap to count frequency of each number.
        Map<Integer,Integer> count = new HashMap<>();

        //Bucket array where index = frequency
        List<Integer>[] freq = new List[nums.length+1];

        //Initialize every bucket to avoid NullPointerException
        for(int i = 0; i < freq.length; i++)
        {
            freq[i] = new ArrayList<>();
        }

        //Building frequency map
        for(int n:nums)
        {
            count.put(n, count.getOrDefault(n,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:count.entrySet())
        {
            freq[entry.getValue()].add(entry.getKey());
        }

        //Initializing a result array of size k elements.
        int[] res = new int[k];

        int index = 0;
        //Traversing in reverse to count k elements (higher occurrence to lower occurrence)
        for(int i = freq.length - 1; i > 0 && index < k; i--)
        {
            for(int n:freq[i])
            {
                res[index++] = n;
                if(index == k)
                {
                    return res;
                }
            }
        }
    return res;
    }
}
