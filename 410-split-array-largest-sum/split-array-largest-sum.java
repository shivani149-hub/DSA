class Solution {
    public int splitArray(int[] nums, int k) {
        int left = Integer.MIN_VALUE;
        int right = 0;
        for (int ele : nums) {
            left = Math.max(left, ele);
            right += ele;
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int sum = 0;
            int count = 1;
            for (int i = 0; i < nums.length; i++) {
                if (sum + nums[i] <= mid) {
                    sum += nums[i];
                } else {
                    count++;
                    sum = nums[i];
                }
            }

            if (count <= k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return left;
    }
}
