class Solution {
    public void backtrack(List<List<Integer>> result, List<Integer> current, boolean[] used, int[] nums){
        if(current.size() == nums.length){
            result.add(new ArrayList<>(current));
            return ;
        }
        for(int i =0; i<nums.length;i++){
            if(used[i]==true) continue;
            current.add(nums[i]);
            used[i] = true;
            backtrack(result,current,used,nums);
            current.remove(current.size()-1);
            used[i]=false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), new boolean[nums.length],nums);
        return result;
    }
}