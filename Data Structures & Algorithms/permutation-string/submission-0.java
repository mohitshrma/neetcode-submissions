class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(n > m)
        {
            return false;
        }

        //initialise a counter frequency array for both string s1 and s2
        int[] s1Map = new int[26];
        int[] s2Map = new int[26];

        //frequency counter for S1Map and S2Map
        for(int i = 0; i < n; i++)
        {
           s1Map[s1.charAt(i) - 'a']++;
           s2Map[s2.charAt(i) - 'a']++;
        }

        for(int i = 0; i < m-n; i++)
        {
            if(matches(s1Map,s2Map))
            {
                return true;
            }
            s2Map[s2.charAt(i+n) - 'a']++; //adding new character to the window
            s2Map[s2.charAt(i) - 'a']--;  //removing old character from the window
        }
     //Checking last window   
     return matches(s1Map,s2Map);
    }

    //Comparing two frequency maps
    private boolean matches(int[] s1Map, int[] s2Map)
    {
        for(int i = 0; i < 26; i++)
        {
            if(s1Map[i] != s2Map[i])
            {
                return false;
            }
        }
        return true;
    }


}
