class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        backTracking(resultList,new ArrayList<>(),nums,0);
        return resultList;
    }
    private void backTracking(List<List<Integer>> result, List<Integer> tempList,int[] arr,int start){
        result.add(new ArrayList<>(tempList));
        for(int i = start;i<arr.length;i++){
            tempList.add(arr[i]);
            backTracking(result,tempList,arr,i+1);
            tempList.remove(tempList.size()-1);
        }
    }
}