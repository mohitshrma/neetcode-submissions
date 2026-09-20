class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleanedStr = new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(Character.isLetterOrDigit(c)){
                cleanedStr.append(Character.toLowerCase(c));
            }
        }

        String cleaned = cleanedStr.toString();
        String reversed = cleanedStr.reverse().toString();

        return cleaned.equals(reversed);
    }
}
