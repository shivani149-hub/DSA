class Solution {
    public void generate(List<List<Integer>> result,int n , int k,List<Integer> current,int index){
        if(current.size() == k){
            result.add(new ArrayList<>(current));
            return ;
        }
        if(index>n) return ;
        current.add(index);
        generate(result,n,k,current,index+1);
        current.remove(current.size()-1);
        generate(result,n,k,current,index+1);
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        generate(result,n,k,new ArrayList<>(),1);
        return result;
    }
}