class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Edge case: Check if string is zero, return an empty arraylist
        if(strs.length == 0)
        {
            return new ArrayList<>();
        }

        //Creating Hashmap:key-> String(hashing) amd value --> list of string anagrams
        Map<String, List<String>> ans = new HashMap<>();

        //outer for loop for iterating over string array word by word
        for(String s:strs)
        {
            //Initialize an array of size 26 to perform frequency countering logic
            int[] count = new int[26];

            //Inner for loop inorder to iterate on chracter by character basis
            for(char c:s.toCharArray())
            {
                count[c-'a']++; //increment by 1 if character is found.
            }

            //Since, we cant return an int array count as key we need string.
            StringBuilder sb = new StringBuilder();
            for(int num:count)
            {
                sb.append(num).append("#"); //appends like 0#1#0#0
            }
            String key = sb.toString();
            if(!ans.containsKey(key))
            {
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(s); //grouping anagrams together
        }
        return new ArrayList<>(ans.values());
    }
}
