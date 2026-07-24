class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       if(strs.length == 0)
       {
        return new ArrayList<>();
       }

       Map<String, List<String>> ans = new HashMap<>();

       for(String s:strs)
       {
        char[] ch = new char[26];
        for(int i = 0; i < s.length(); i++)
        {
            ch[s.charAt(i) - 'a']++;
        }

        String key = new String(ch);

        ans.computeIfAbsent(key, k -> new ArrayList<>()).add(s);

       }
       return new ArrayList<>(ans.values());
    }       
}
