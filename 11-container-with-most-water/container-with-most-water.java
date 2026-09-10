class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        int maxArea = -1;
        while(left < right){
            int width = right - left ;
            int Height = Math.min(height[left], height[right]);
            area = width * Height;
            if(area > maxArea){
                maxArea = area;
            }
            if(height[left] < height[right]){
                left++;
            }
            else right--;
        }
        return maxArea;
    }
}