// For this problem, we can consider using an array of fixed size 26, for alphabets.
class Solution {
    public boolean isAnagram(String s, String t) {
        // If they are valid anagram, their length must be equal.
        if(s.length() != t.length())
        {
            return false;
        }

        //Create a frequency count array of size 26 (lowercase alphabets)
        int[] countChar = new int[26];

        // Increasing counter if value is found once inside for loop
        for(char ch:s.toCharArray())
        {
            countChar[ch - 'a']++;
        }

        //Decreasing counter if value is found again.
        for(char ch:t.toCharArray())
        {
            countChar[ch - 'a']--;
        }

        //Lastly, we check if the counter value is zero or not for validity of anagram.
        for(int c:countChar)
        {
            if(c!=0)
            {
                return false;
            }
        }
        return true;

    }
}
