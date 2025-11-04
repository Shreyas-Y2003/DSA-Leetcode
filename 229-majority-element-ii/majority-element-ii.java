class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>result=new ArrayList<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:map.keySet()){
            if(map.get(num)>n/3){
                result.add(num);
            }
        }
        Collections.sort(result);
        return result;
    }
}