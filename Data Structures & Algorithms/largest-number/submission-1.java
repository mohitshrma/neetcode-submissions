class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];

        // Converting every integer into a String
        for(int i = 0; i < nums.length; i++)
        {
            arr[i] = String.valueOf(nums[i]);
        }

        // Custom sorting using comparator
        Arrays.sort(arr, (a,b) -> (b+a).compareTo(a+b));

        //Checking edge case -> [0,0,0]
        if(arr[0].equals("0"))
        {
            return "0";
        }

        //Building final answer
        StringBuilder sb = new StringBuilder();
        for(String s:arr)
        {
            sb.append(s);
        }

        return sb.toString();

    }
}