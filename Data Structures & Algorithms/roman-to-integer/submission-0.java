class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int curr = translate(s.charAt(0));
        for(int i = 1; i < s.length(); i++)
        {
            int next = translate(s.charAt(i));

            if(curr < next)
            {
                sum -= curr;
            }
            else
            {
                sum += curr;
            }
            curr = next;
        }
        sum += curr;
        return sum;
    }

    private int translate(char c)
    {
        return switch(c){
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}