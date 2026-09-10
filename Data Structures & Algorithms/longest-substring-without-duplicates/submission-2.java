class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 || s == null)
        {
            return 0;
        }

        if(s.length() == 1)
        {
            return 1;
        }
        
        int left = 0, ans = 0;
        Set<Character> window = new HashSet<>();

        for(int right = 0; right < s.length(); right++)
        {
            char c = s.charAt(right);
            while(window.contains(c))
            {
                window.remove(s.charAt(left));
                left++;
            }
            window.add(c);
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
