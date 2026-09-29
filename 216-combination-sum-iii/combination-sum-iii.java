class Solution {
    public void backtrack(List<List<Integer>> result, List<Integer> current, int k, int target, int index,int currsum){
        if(current.size()==k && currsum == target){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i = index ; i<=9 ; i++){
            if((currsum + i) > target) break;
            current.add(i);
            backtrack(result,current,k,target,i+1,currsum+i);
            current.remove(current.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(),k,n,1,0);
        return result;
    }
}