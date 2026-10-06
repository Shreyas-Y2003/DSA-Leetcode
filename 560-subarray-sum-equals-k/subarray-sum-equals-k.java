class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer>f=new HashMap<>();
        f.put(0,1);
        int prefix=0;int count=0;
        for(int x:nums){
            prefix += x;
            count+=f.getOrDefault(prefix-k,0);
            f.merge(prefix,1,Integer::sum);
        }
        return count;
    }
}