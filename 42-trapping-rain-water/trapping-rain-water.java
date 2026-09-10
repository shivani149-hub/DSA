class Solution {
    public int trap(int[] height) {
        Stack<Integer> st = new Stack<>();
        int n = height.length;
        int mid, right , left , width , Height , water;
        water = 0;
        for(int i =0 ; i < n; i++){
            while(!st.isEmpty() && height[st.peek()] < height[i] ){

                 mid = st.pop();
                 if(st.isEmpty()) break;
                 right = i;
                 left = st.peek();
                 width = right - left - 1;
                 Height = Math.min(height[right],height[left]) - height[mid];
                 water += width * Height ;
            }

            st.push(i);
        }
        return water;
    }
}