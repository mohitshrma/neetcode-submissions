class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int left = 0, right = heights.length - 1;
        while(left < right)
        {
            int width = right - left;
            int minHeight = Math.min(heights[left], heights[right]);
            int area = width * minHeight;

            max = Math.max(max,area);
            if(heights[left] < heights[right])
            {
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}
