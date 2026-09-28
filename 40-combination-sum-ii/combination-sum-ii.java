class Solution {
    public void backtrack(List<List<Integer>> result, List<Integer> current, int[] nums, int target,int start,int currsum){
        if(currsum == target){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i = start ; i<nums.length;i++){
            if(i>start && nums[i-1]==nums[i]){
                continue;
            }
            if(currsum + nums[i] > target) break;
            current.add(nums[i]);
            backtrack(result,current,nums,target,i+1,currsum+nums[i]);
            current.remove(current.size()-1);

        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>(),candidates,target,0,0);
        return result;
    }
}