class Solution {
    public void backtrack(List<List<Integer>> result,List<Integer> current, int start,int[] nums, int target,int currsum){
        if(currsum == target){
            result.add(new ArrayList<>(current));
            return ;
        }
        if(currsum > target) return ;
        for(int i = start;i<nums.length;i++){
            current.add(nums[i]);
            backtrack(result,current,i,nums,target,currsum + nums[i]);
            current.remove(current.size()-1);
            
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>(),0,candidates,target,0);
        return result;
    }
}