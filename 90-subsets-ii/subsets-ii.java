class Solution {
    public void backtrack(List<List<Integer>> result, List<Integer> current,int[] nums,int start){
        result.add(new ArrayList<>(current));
        for(int i = start;i<nums.length;i++){
            if(i>start && nums[i-1]==nums[i]){
                continue;
            }
            current.add(nums[i]);
            backtrack(result,current,nums,i+1);
            current.remove(current.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>(), nums,0);
        return result;
    }
}